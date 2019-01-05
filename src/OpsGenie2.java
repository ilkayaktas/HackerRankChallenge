import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilkayaktas on 2018-12-23 at 13:42.
 */

public class OpsGenie2 {
    static int oddDigitPrime(int l, int r, int t){
        List<Integer> primeList = new ArrayList<>();
        for(int i = l; i <= r; i++){
            if(i <= 2)continue;

            if(isEachOfDigitsOdd(i)){
                if(isPrime(i)){

                }
            }
        }

        return 0;
    }

    static boolean isPrime(int i ) {
        if (i <= 1) {
            return false;
        }

        // Check from 2 to n-1
        for (int j = 2; j < i; j++){
            if (i % j == 0) {
                return false;
            }
        }

        return true;
    }

    static boolean isEachOfDigitsOdd(int i){
        int index = 1;
        while ((i / (10*index)) > 0 ){
            if((i % (10*index)) % 2 == 0){
                return false;
            }
            i = (i / (10*index));
        }

        return true;
    }
}
