/**
 * Created by ilkayaktas on 2018-12-17 at 18:11.
 */

public class DiagonalMatrix {
    static int diagonalDifference(int[][] arr) {

        int total = 0;
        int total2 = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i][i];
            total2 += arr[i][arr.length -1 - i];
        }
        return Math.abs(total-total2);
    }
}
