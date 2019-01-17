import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Created by aselsan on 7.01.2019 at 09:01.
 */

public class ResponseLengthCalculator extends RecursiveTask<Map<String, Integer>> {
    private final List<String> links;

    ResponseLengthCalculator(List<String> links) {
        this.links = links;
    }

    @Override
    protected Map<String, Integer> compute() {
        if (links.isEmpty()) {
            System.out.printf("No more links to fetch");
            return Collections.emptyMap();
        }

        int middle = links.size() / 2;
        System.out.printf("Middle index: {}", links, middle);
        ResponseLengthCalculator leftPartition = new ResponseLengthCalculator(links.subList(0, middle));
        ResponseLengthCalculator rightPartition = new ResponseLengthCalculator(links.subList(middle + 1, links.size()));

        System.out.printf("Forking left partition");
        leftPartition.fork();
        System.out.printf("Left partition forked, now forking right partition");
        rightPartition.fork();
        System.out.printf("Right partition forked");

        String middleLink = links.get(middle);
        HttpRequester httpRequester = new HttpRequester(middleLink);
        String response;
        try {
            System.out.printf("Calling managedBlock for {}", middleLink);
            ForkJoinPool.managedBlock(httpRequester);
            response = httpRequester.response;
        } catch (InterruptedException ex) {
            System.out.printf("Error occurred while trying to implement blocking link fetcher", ex);
            response = "";
        }

        Map<String, Integer> responseMap = new HashMap<>(links.size());

        Map<String, Integer> leftLinks = leftPartition.join();
        responseMap.putAll(leftLinks);
        responseMap.put(middleLink, response.length());
        Map<String, Integer> rightLinks = rightPartition.join();
        responseMap.putAll(rightLinks);

        System.out.printf("Left map {}, middle length {}, right map {}", leftLinks, response.length(), rightLinks);

        return responseMap;
    }

    private static class HttpRequester implements ForkJoinPool.ManagedBlocker {
        private final String link;
        private String response;

        private HttpRequester(String link) {
            this.link = link;
        }

        @Override
        public boolean block() {
    /*        HttpGet headRequest = new HttpGet(link);
            CloseableHttpClient client = HttpClientBuilder
                    .create()
                    .disableRedirectHandling()
                    .build();
            try {
                System.out.printf("Executing blocking request for {}", link);
                CloseableHttpResponse response = client.execute(headRequest);
                System.out.printf("HTTP request for link {} has been executed", link);
                this.response = EntityUtils.toString(response.getEntity());
            } catch (IOException e) {
                System.out.printf("Error while trying to fetch response from link {}: {}", link, e.getMessage());
                this.response = "";
            }*/
            return true;
        }

        @Override
        public boolean isReleasable() {
            return false;
        }
    }
}