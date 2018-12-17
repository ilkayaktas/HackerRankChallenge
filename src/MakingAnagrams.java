/**
 * Created by ilkayaktas on 2018-12-17 at 18:56.
 */

public class MakingAnagrams {
    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        String k = a;
        String t = b;
        String[] s = a.split("");
        int counter = 0;
        for (int i = 0; i < s.length; i++) {
            if(b.contains(s[i])){
                b.replace(s[i],"");
                a.replace(s[i],"");
                counter+=2;
            }
        }
        return k.length()+t.length()-counter;
    }
}
