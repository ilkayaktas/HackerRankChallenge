import java.util.Arrays;

/**
 * Created by ilkayaktas on 2018-12-16 at 01:31.
 */

public class FraudulentActivityNotifications {


    static int activityNotifications(int[] expenditure, int d) {

        int counter = 0;
        for (int i = d, j = 0; i < expenditure.length; i++, j++) {
            int[] particularDays = Arrays.copyOfRange(expenditure, j,i);
            Arrays.sort(particularDays);
            if( expenditure[i] >= median(particularDays)*2 ){
                counter++;
            }
        }
        return counter;
    }

    static double median(int[] sortedList){
        int length = sortedList.length;
        if(length % 2 == 0){
            return ((double)(sortedList[length/2]+sortedList[length/2-1]))/2;
        }else {
            return sortedList[length/2];
        }
    }
}
