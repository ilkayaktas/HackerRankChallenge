/**
 * Created by ilkayaktas on 2018-12-15 at 14:04.
 */

public class LeftRotation {
    static int[] rotLeft(int[] a, int d) {

        int [] shiftedA =  new int[a.length];

        for (int i = 0; i < a.length; i++) {
            shiftedA[i] = a[Math.floorMod(d+i, a.length)];
        }

        return shiftedA;
    }
}
