import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ilkayaktas on 2018-12-16 at 01:31.
 */

public class FraudulentActivityNotifications {
    static int activityNotifications(int[] expenditure, int d) {
        List<Integer> exp = Arrays.stream(expenditure).boxed().collect(Collectors.toList());

        int counter = 0;
        for (int i = d, j = 0; i < exp.size(); i++, j++) {
            List<Integer> subExp = exp.subList(j,i);
            if( exp.get(i) >= median(subExp)*2 ){
                counter++;
            }
        }
        return counter;
    }

    static double median(List<Integer> list){
        List<Integer> l = list.stream().sorted().collect(Collectors.toList());
        if(l.size() % 2 == 0){
            return ((double)(l.get(l.size()/2)+l.get(l.size()/2-1)))/2;
        }else {
            return l.get(l.size()/2);
        }
    }
}
