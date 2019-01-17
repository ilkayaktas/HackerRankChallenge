import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * Created by aselsan on 7.01.2019 at 08:22.
 */

public class ListSummer extends RecursiveTask<Integer> {
    private final List<Integer> listToSum;

    ListSummer(List<Integer> listToSum) {
        this.listToSum = listToSum;
    }

    @Override
    protected Integer compute() {
        if (listToSum.isEmpty()) {
            System.out.println("Found empty list, sum is 0");
            return 0;
        }

        int middleIndex = listToSum.size() / 2;
        System.out.printf("List {}, middle Index: {}", listToSum, middleIndex);

        List<Integer> leftSublist = listToSum.subList(0, middleIndex);
        List<Integer> rightSublist = listToSum.subList(middleIndex + 1, listToSum.size());

        ListSummer leftSummer = new ListSummer(leftSublist);
        ListSummer rightSummer = new ListSummer(rightSublist);

        leftSummer.fork(); // asynchronously execute this task in the pool the current task is running in
        rightSummer.fork(); // asynchronously execute this task in the pool the current task is running in

        Integer leftSum = leftSummer.join(); // returns the result of the computation when it is done
        Integer rightSum = rightSummer.join(); // returns the result of the computation when it is done
        int total = leftSum + listToSum.get(middleIndex) + rightSum;
        System.out.printf("Left sum is {}, right sum is {}, total is {}", leftSum, rightSum, total);

        return total;
    }
}