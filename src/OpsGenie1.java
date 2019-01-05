/**
 * Created by ilkayaktas on 2018-12-23 at 13:42.
 */

public class OpsGenie1 {
    static int maxDifference(int[] a){
        int result = Integer.MIN_VALUE;
        int minValueIntArray = Integer.MAX_VALUE;

        for(int i = 0; i < a.length; i++){
            if(a[i] < minValueIntArray){
                minValueIntArray = a[i];
            }

            if(a[i] > minValueIntArray && a[i] - minValueIntArray > result){
                result = a[i] - minValueIntArray;
            }
        }

        if(result == Integer.MIN_VALUE){
            result = -1;
        }
        return result;
    }
}
