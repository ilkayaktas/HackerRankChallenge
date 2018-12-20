import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by aselsan on 18.12.2018 at 16:51.
 */

public class Pairs {
    static int pairs(int k, int[] arr) {
        Map<Integer, List<Integer>> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(o -> o));
        int counter = 0;
        for (Integer i : collect.keySet()) {
            if(i < k)continue;

            if(collect.containsKey(i-k)){
                counter++;
            }
        }
        return counter;
    }
}
