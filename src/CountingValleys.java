/**
 * Created by aselsan on 12.12.2018 at 15:43.
 */

public class CountingValleys {

    static int countingValleys(int n, String s) {

        int numOfValleys = 0;
        int rakim = 0;
        for (String str :  s.split("")){
            System.out.println(str);
            if(str.equals("U"))rakim++;
            if(str.equals("D"))rakim--;

            if(rakim == 0 && str.equals("U")){
                numOfValleys++;
            }
        }
        return numOfValleys;
    }
}
