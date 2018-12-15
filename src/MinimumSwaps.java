/**
 * Created by ilkayaktas on 2018-12-15 at 16:30.
 */

public class MinimumSwaps {

    static int minimumSwaps(int[] arr) {

        int swapCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > (i+1)){
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] < (j+1)){
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                        swapCount++;


                        break;
                    }
                }
            }
        }
        return  swapCount;
    }

}
