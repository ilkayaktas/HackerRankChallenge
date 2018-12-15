/**
 * Created by ilkayaktas on 2018-12-15 at 12:58.
 */

public class RepeatedString {

    static long repeatedString(String s, long n) {
        long total = 0;
        for (long i = 0; i < n;) {
            String [] sArr = s.split("");
            for (int j = 0; j < sArr.length && i < n; j++, i++) {
                if (sArr[j].equals("a")){
                    total++;
                }
            }
        }
        return total;
    }
}
