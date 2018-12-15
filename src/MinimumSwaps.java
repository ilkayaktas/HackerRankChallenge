/**
 * Created by ilkayaktas on 2018-12-15 at 16:30.
 */

public class MinimumSwaps {

    static int counter = 0;

    static int minimumSwaps(int[] arr) {

        quickSort(arr, 0, arr.length-1);

        return counter;
    }

    static void quickSort(int[] arr, int low, int high){
        if (low < high)
        {

            int pi = divideAndConquare(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int divideAndConquare(int[] arr, int low, int high)
    {
        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j <= high- 1; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                counter++;
            }
        }
        int tmp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = tmp;
        counter++;

        return (i + 1);
    }
}
