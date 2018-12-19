import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ilkayaktas on 2018-12-18 at 21:46.
 */

public class ATaleOfTwoStacks {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

class MyQueue<T>{
    private Stack<T> newest = new Stack<>();
    private Stack<T> oldest = new Stack<>();

    public void enqueue(T t){
        newest.push(t);
    }

    public void dequeue(){
        shiftElements();
        oldest.pop();
    }

    private void shiftElements() {
        if(oldest.empty()){
            T t;
            while ((t = newest.pop()) != null){
                oldest.push(t);
            }
        }
    }

    public T peek() {
        shiftElements();
        return oldest.peek();
    }
}
