/**
 * Created by ilkayaktas on 2018-12-15 at 21:36.
 */

public class BubbleSort {
    static void countSwaps(int[] a) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swap(a, j, (j + 1));
                    counter++;
                }
            }
        }

        System.out.println("Array is sorted in "+counter+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);
    }

    static void swap(int[] a, int first, int second){
        int tmp = a[first];
        a[first] = a[second];
        a[second] = tmp;
    }
}
