/**
 * Created by aselsan on 12.12.2018 at 15:43.
 */

public class CountingValleys {

    static int countingValleys(int n, String s) {

        int numOfValleys = 0;
        int rakim = 0;

        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);
            if (str == 'U') {
                rakim++;
            } else {
                rakim--;
            }

            if(rakim == 0 && str ==  'U'){
                numOfValleys++;
            }
        }
        return numOfValleys;
    }
}
