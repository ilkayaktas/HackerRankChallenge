/**
 * Created by aselsan on 12.12.2018 at 16:14.
 */

public class JumpingOnTheClouds {
    static int jumpingOnClouds(int[] c) {

        int  step = 0;

        for (int i = 0; i < c.length; ) {
            if(isIndexExist(i+2, c) && c[i+2] == 0){
                step++;
                i = i+2;
            } else if(isIndexExist(i+1, c) && c[i+1] == 0){
                step++;
                i++;
            } else{
                i++;
            }
        }

        return step;
    }

    static boolean isIndexExist(int index, int [] c){
        if(index < c.length)return true;
        return false;
    }
}
