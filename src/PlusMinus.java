import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by aselsan on 18.12.2018 at 08:10.
 */

public class PlusMinus {
    static void plusMinus(int[] arr) {
        Map<Integer, List<Integer>> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i -> {
            if (i < 0) {
                return -1;
            } else if (i > 0) {
                return 1;
            } else {
                return 0;
            }
        }));

        int plus = collect.get(1) != null ? collect.get(1).size() : 0;
        int minus = collect.get(-1) != null ? collect.get(-1).size() : 0;
        int zero = collect.get(0) != null ? collect.get(0).size() : 0;
        int total = plus+minus+zero;
        System.out.printf("%.6f\n",((double)plus/(double)total));
        System.out.printf("%.6f\n",((double)minus/(double)total));
        System.out.printf("%.6f\n",((double)zero/(double)total));

    }
}
