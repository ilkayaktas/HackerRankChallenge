/**
 * Created by ilkayaktas on 2018-12-15 at 13:27.
 */

public class HourglassSum {

    static int hourglassSum(int[][] arr) {

        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length-2; row++) {
            for (int column = 0; column < arr[0].length-2; column++) {
                int sum = sumHourglass(arr,row,column);
                if(sum > max){
                    max = sum;
                }
            }
        }

        return max;
    }

    private static int sumHourglass(int[][] arr, int row, int column){
        return arr[row][column]+arr[row][column+1]+arr[row][column+2]+
                arr[row+1][column+1]+
        arr[row+2][column]+arr[row+2][column+1]+arr[row+2][column+2];
    }
}
