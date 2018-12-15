import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ilkayaktas on 2018-12-15 at 21:42.
 */

public class MarkAndToys {

    static int maximumToys(int[] prices, int k) {

        List<Integer> list = Arrays.stream(prices).boxed().sorted().collect(Collectors.toList());

        int count = 0;
        for (Integer itemPrice : list) {
            if(k >= itemPrice){
                k-=itemPrice;
                count++;
            }else{
                break;
            }
        }

        return count;
    }
}
