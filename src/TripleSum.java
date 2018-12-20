import java.util.Arrays;

/**
 * Created by aselsan on 18.12.2018 at 17:12.
 */

public class TripleSum {
    static long triplets(int[] a, int[] b, int[] c) {

        int[] aMap = Arrays.stream(a).distinct().sorted().toArray();
        int[] bMap = Arrays.stream(b).distinct().sorted().toArray();
        int[] cMap = Arrays.stream(c).distinct().sorted().toArray();

        long counter = 0;
        for (int i = 0; i < bMap.length; i++) {
            long lA = find(aMap, bMap[i]);
            long lC = find(cMap, bMap[i]);

            counter += lA*lC;
        }
        return counter;
    }

    static long find(int [] arr, int val){
        long found = Arrays.binarySearch(arr, val);

        if(found < 0 ){
            return -1*(found)-1;
        }
        if(found >= arr.length){
            return 0;
        }

        return found+1;
    }
}
