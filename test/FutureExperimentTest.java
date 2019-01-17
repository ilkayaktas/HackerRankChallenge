import org.junit.Test;

import java.util.concurrent.ExecutionException;

/**
 * Created by aselsan on 16.01.2019 at 15:30.
 */
public class FutureExperimentTest {

    @Test
    public void doItFuture() {
        try {
            FutureExperiment.doItFuture();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void completableFuture(){
        try {
            FutureExperiment.completableFuture();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void completedFutureExample() {
        FutureExperiment.completedFutureExample();
    }

    @Test
    public void runAsyncExample(){
        FutureExperiment.runAsyncExample();
    }

    @Test
    public void thenApplyExample(){
        FutureExperiment.thenApplyExample();
    }

    @Test
    public void thenApplyAsyncExample(){
        FutureExperiment.thenApplyAsyncExample();
    }
}