/**
 * Created by ilkayaktas on 2018-12-16 at 19:22.
 */

public class TwoStrings {
    static String twoStrings(String s1, String s2) {

        for (int i = 97; i <= 122; i++) {
            int initialPosition1 = s1.length();
            int initialPosition2 = s2.length();
            s1 = s1.replace("" + ((char) i), "");
            s2 = s2.replace("" + ((char) i), "");

            if (s1.length() != initialPosition1 && s2.length() != initialPosition2) {
                return "YES";
            }
        }

        return "NO";
    }
}
