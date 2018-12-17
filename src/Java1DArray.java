/**
 * Created by aselsan on 17.12.2018 at 11:07.
 */

public class Java1DArray {
    public static boolean canWin(int leap, int[] game) {

    /*    int i = 0;
        while (i < game.length){

            if(game[i+leap] == 0){
                i = i+leap;
            }else if(game[i+1] == 0){
                i += 1;
            } else{
                return false;
            }

            if((i+leap) >= (game.length) || i == (game.length-1)){
                return true;
            }
        }

        return false;*/

        return calcRecursive(game, 0, leap, false) ;
    }

    static boolean calcRecursive(int[] game, int index, int leap, boolean comingBack){

        if(index == (game.length-1) || (index+leap) >= game.length){
            return true;
        }

        if( index < 0 || game[index] == 1){
            return false;
        }



        boolean loopResult = calcRecursive(game, index+leap, leap, false);
        if(!loopResult && !comingBack){
            boolean nextResult = calcRecursive(game, index+1, leap, false);
            if(!nextResult && comingBack){
                return calcRecursive(game, index-1, leap, true);
            }
            return nextResult;
        }
        return loopResult;
    }
}
