import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by ilkayaktas on 2018-12-16 at 19:04.
 */

public class RansomNote {
    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, List<String>> map = Arrays.stream(magazine).sorted().collect(Collectors.groupingBy(s -> s));

        String result = "";
        for (int i = 0; i < note.length; i++) {
            String s = note[i];
            if(map.get(s) != null && map.get(s).size()>0){
                map.get(s).remove(0);
                result = "Yes";
            } else{
                result = "No";
                break;
            }
        }

        System.out.println(result);

    }
}
