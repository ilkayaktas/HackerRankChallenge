import java.io.IOException;
import java.util.*;

/**
 * Created by ilkayaktas on 2018-12-16 at 01:31.
 */

public class FraudulentActivityNotifications {


    static int activityNotifications(int[] expenditure, int d) {
        System.out.println(Arrays.stream(expenditure).boxed().reduce((i1, i2) -> i1+i2).get());
        Queue<Integer> queue = new LinkedList<>();
        int[] countingSort = initArray();
        int counter = 0;
        for (int i = 0, j = 0; i < expenditure.length; i++, j++) {

            if(i >= d){
                if( expenditure[i] >= median(countingSort, d)*2 ){
                    counter++;
                }
            }

            countingSort[ expenditure[i] ]++;
            queue.add(expenditure[i]);
            if(queue.size() > d){
                Integer polled = queue.poll();
                countingSort[ polled ]--;
            }
        }
        return counter;
    }

    static int[] initArray(){
        int[] array = new int[201];
        for (int i = 0; i < 201; i++) {
            array[i] = 0;
        }
        return array;
    }

    static double median(int[] countingSort, int d){

        if(d % 2 == 0){
            int findingIndex1 = d/2;
            int findingIndex2 = findingIndex1+1;
            int x1=0, x2=0;
            int counter = 0;
            for (int i = 0; i < 201; i++) {
                counter += countingSort[i];

                if(counter >= findingIndex2){
                    x2 = i;
                    break;
                }

                if(counter >= findingIndex1){
                    x1 = i;

                }
            }
            return ((double)x1+(double)x2)/2;
        } else{
            int findingIndex = d/2;
            for (int i = 0; i < 201; i++) {
                findingIndex -= countingSort[i];
                if(findingIndex < 0){
                    return i;
                }
            }
        }
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
   //     BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
    //    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        System.out.println(result);
        scanner.close();
    }
}

class PriceComparator implements Comparator<Integer>
{
    @Override
    public int compare(Integer x, Integer y)
    {
        if (x != null && y != null) {
            if (x > y){
                return 1;
            }else{
                return -1;
            }
        }
        return 0;
    }
}
