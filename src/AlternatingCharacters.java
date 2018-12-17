/**
 * Created by ilkayaktas on 2018-12-17 at 19:24.
 */

public class AlternatingCharacters {
    static int alternatingCharacters(String s) {
        /*String alternateString = Arrays.stream(s.split("")).reduce((s1, s2) -> {
            if(s1.substring(s1.length()-1).equals(s2)){
                return s1;
            } else{
                return s1+s2;
            }
        }).get();

        return s.length()-alternateString.length();*/

        int counter = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)){
                counter++;
            }
        }
        return counter;
    }
}
