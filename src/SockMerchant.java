import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by aselsan on 12.12.2018 at 13:55.
 */

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {

        Map<Integer, List<Integer>> map = Arrays.stream(ar).boxed().sorted().collect(Collectors.groupingBy(o->o ));

        int total = 0;
        for (Integer i : map.keySet()){
            System.out.println(i + " " + map.get(i).size());
            total += (map.get(i).size()/2);
        }
        return total;
    }
}
