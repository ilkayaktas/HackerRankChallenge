import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ilkayaktas on 2018-12-15 at 22:30.
 */

public class DynamicArray {

    static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> seqList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            seqList.add(new ArrayList<Integer>(Arrays.asList()));
        }

        int lastAnswer = 0;

        for (List<Integer> subList: queries) {
            if(subList.get(0).equals(1)){
                int index = (subList.get(1) ^ lastAnswer)%n;
                List<Integer> seq = seqList.get(index);
                seq.add(subList.get(2));
                continue;
            }

            if(subList.get(0).equals(2)){
                int index = (subList.get(1) ^ lastAnswer)%n;
                List<Integer> seq = seqList.get(index);
                lastAnswer = seq.get(subList.get(2) % seq.size());
                result.add(lastAnswer);
                System.out.println(lastAnswer);
                continue;
            }
        }
        return result;
    }
}
