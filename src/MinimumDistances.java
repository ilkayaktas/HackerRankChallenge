import java.util.HashMap;
import java.util.Map;

/**
 * Created by aselsan on 20.12.2018 at 09:53.
 */

public class MinimumDistances {
    static int minimumDistances(int[] a) {
        Map<Integer, Integer > mapIndex = new HashMap<>();
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(mapIndex.containsKey(a[i])){
                int previousIndex = mapIndex.get(a[i]);
                if(Math.abs(previousIndex-i) < distance){
                    distance = Math.abs(previousIndex-i);
                }

            }
            mapIndex.put(a[i], i);

        }
            return distance == Integer.MAX_VALUE ? -1:distance;
    }
}
