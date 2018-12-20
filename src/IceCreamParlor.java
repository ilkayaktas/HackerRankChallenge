import java.util.*;

/**
 * Created by aselsan on 18.12.2018 at 10:09.
 */

public class IceCreamParlor {
    static void whatFlavors(int[] cost, int money) {

        Map<Integer, List<Integer>> costIndex = new HashMap<>();
        for (int i = 0; i < cost.length; i++) {
            if(costIndex.get(cost[i]) != null){
                List<Integer> l = costIndex.get(cost[i]);
                l.add(i);
                costIndex.put(cost[i], l);
            } else{
                List<Integer> l = new ArrayList<>();
                l.add(i);
                costIndex.put(cost[i], l);
            }

        }

        for (Integer cst : costIndex.keySet()) {
            int rest = money - cst;

            if(costIndex.get(rest) != null && costIndex.get(rest).size() > 0){
                int index1 = (costIndex.get(cst).remove(0)+1);
                int index2 = (costIndex.get(rest).remove(0)+1);
                System.out.println((index1 < index2 ? index1 : index2) + " " +(index1 > index2 ? index1 : index2) );
                break;
            }
        }
    }
}
