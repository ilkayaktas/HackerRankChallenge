import java.util.ArrayList;
import java.util.List;

/**
 * Created by aselsan on 17.01.2019 at 11:15.
 */

public class ThreadExperiment {
    public static void createaMultiThread(){
        List<Thread> l = new ArrayList<>();
        while (true){
            Thread t = new Thread(() -> {
                System.out.println(Thread.currentThread().getId());
            });

            l.add(t);
            t.start();
        }
    }
}
