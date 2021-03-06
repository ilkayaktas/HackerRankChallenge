import java.util.HashMap;
import java.util.Map;

/**
 * Created by aselsan on 17.12.2018 at 11:07.
 */

public class Java1DArray {
    static Map<Integer, Boolean> dirtyIndex;
    public static boolean canWin(int leap, int[] game) {
        dirtyIndex = new HashMap<>();
        return calcRecursive(game, 0, leap) ;
    }


    static boolean calcRecursive(int[] game, int index, int leap){

        if( index < 0 || game[index] == 1){
            return false;
        }

        if(index == (game.length-1) || (index+leap) >= game.length){
            return true;
        }

        if(dirtyIndex.get(index) != null && dirtyIndex.get(index)){
            return false;
        }

        dirtyIndex.put(index, true);

        boolean loopResult = calcRecursive(game, index+leap, leap);
        if(!loopResult ){
            boolean nextResult = calcRecursive(game, index+1, leap);
            if(!nextResult ){
                return calcRecursive(game, index-1, leap);
            }
            return nextResult;
        }
        return loopResult;
    }
}
