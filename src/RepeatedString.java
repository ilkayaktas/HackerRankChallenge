import java.util.Arrays;

/**
 * Created by ilkayaktas on 2018-12-15 at 12:58.
 */

public class RepeatedString {

    static long repeatedString(String s, long n) {
        long numOfA = Arrays.asList(s.split("")).stream().filter(s1 -> s1.equals("a")).count();

        long numOfStr = n/s.length();
        long rest = n%s.length();
        long totalNumOfA = numOfA*numOfStr;
        if(rest != 0){
            totalNumOfA += Arrays.asList(s.substring(0, (int)rest).split("")).stream().filter(s1 -> s1.equals("a")).count();
        }

        return totalNumOfA;
    }
}
