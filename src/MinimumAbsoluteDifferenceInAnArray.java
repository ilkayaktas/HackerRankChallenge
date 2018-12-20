import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by aselsan on 20.12.2018 at 17:29.
 */

public class MinimumAbsoluteDifferenceInAnArray {
    static int minimumAbsoluteDifference(int[] arr) {

        List<Integer> sortedArray = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());

        int difference = Integer.MAX_VALUE;
        for (int i = 0; i < sortedArray.size()-1; i++) {
            if(sortedArray.size()>1){
                int diff = Math.abs(sortedArray.get(i) - sortedArray.get(i+1));
                if(diff < difference){
                    difference = diff;
                }
            } else{
                return sortedArray.get(i);
            }
        }

        return difference;
    }
}
