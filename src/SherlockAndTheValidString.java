import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by ilkayaktas on 2018-12-17 at 21:04.
 */

public class SherlockAndTheValidString {
    static String isValid(String s) {

        Map<String, List<String>> collect = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1));


        Map<Integer, List<String>> numOfLetterMap = collect.keySet().stream().collect(Collectors.groupingBy(o -> collect.get(o).size()));

        if(numOfLetterMap.size() > 2){
            return "NO";
        }

        if(numOfLetterMap.size() == 2){
            List<Integer> l = new ArrayList<>(numOfLetterMap.keySet());
            if( Math.abs(l.get(0) - l.get(1)) == 1
                    && ((numOfLetterMap.get(l.get(0)).size() == 1) || (numOfLetterMap.get(l.get(1)).size() == 1))){
                return "YES";
            }
            if( ((numOfLetterMap.get(l.get(0)).size() == 1) || (numOfLetterMap.get(l.get(1)).size() == 1))){
                return "YES";
            }
            return "NO";
        }
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        String result = isValid(s);

        System.out.println(result);
        scanner.close();
    }
}
