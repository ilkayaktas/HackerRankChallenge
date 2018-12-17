/**
 * Created by ilkayaktas on 2018-12-17 at 18:56.
 */

public class MakingAnagrams {
    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        String originalA = a;
        String originalB = b;
        int counter = 0;
        for (String s1 : a.split("")) {
            if (b.contains(s1)) {
                b = b.replaceFirst(s1, "");
                a = a.replaceFirst(s1, "");
                counter += 2;
            }
        }
        return originalA.length()+originalB.length()-counter;
    }
}
