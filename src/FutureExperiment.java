import java.util.concurrent.*;

/**
 * Created by aselsan on 16.01.2019 at 15:24.
 */

public class FutureExperiment {
    static void doItFuture() throws ExecutionException, InterruptedException {
        System.out.println("Started!");
        FutureTask<String> future =
                new FutureTask<>(() -> {
                    Thread.sleep(2000);
                    return "Async call result";
                });

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(future);
        System.out.println(future.get());

        System.out.println("Hello");
        Future<String> f
                = executor.submit(() -> {
                    Thread.sleep(2000);
                    return "Async call result";
                });

        System.out.println(f.get());
    }

    static void completableFuture() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future
                = CompletableFuture.supplyAsync(() -> {
                    sleep(3000);
                    return "Hello";

            });

        System.out.println("Hi man!");
        System.out.println(future.get());
    }

    static void completedFutureExample() {
        CompletableFuture cf = CompletableFuture.completedFuture("message");
        System.out.println(cf.isDone());
        System.out.println(cf.getNow(null));
    }

    static void runAsyncExample() {
        CompletableFuture cf = CompletableFuture.runAsync(() -> {
            System.out.println("is deamon: "+Thread.currentThread().isDaemon());
            sleep(1000);
        });
        System.out.println("is deamon 1: "+cf.isDone());
        sleep(2000);
        System.out.println("is deamon 2: "+cf.isDone());

        CompletableFuture cf1 = CompletableFuture.runAsync(() -> {
            System.out.println("is deamon: "+Thread.currentThread().isDaemon());
            sleep(2000);
        });

        CompletableFuture cf2 = CompletableFuture.runAsync(() -> {
            System.out.println("is deamon: "+Thread.currentThread().isDaemon());
            sleep(3000);
        });
    }

    static void thenApplyExample() {
        CompletableFuture cf = CompletableFuture.completedFuture("message").thenApply(s -> {
            System.out.println(Thread.currentThread().isDaemon());
            sleep(2000);
            return s.toUpperCase();
        });

        System.out.println("now: "+cf.getNow(null));
    }


    static void thenApplyAsyncExample() {
        CompletableFuture cf = CompletableFuture.completedFuture("message").thenApplyAsync(s -> {
            System.out.println(Thread.currentThread().isDaemon());
            sleep(3000);
            return s.toUpperCase();
        });
        System.out.println(cf.getNow(null));
        System.out.println(cf.join());
    }

    static void sleep(long milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
