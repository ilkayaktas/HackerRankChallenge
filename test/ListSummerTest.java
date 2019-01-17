import org.junit.Test;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

import static org.junit.Assert.assertEquals;


/**
 * Created by aselsan on 7.01.2019 at 08:23.
 */
public class ListSummerTest {

    @Test
    public void shouldSumEmptyList() {
        ListSummer summer = new ListSummer(List.of());
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(summer);

        int result = summer.join();

        assertEquals(result, 0);
    }

    @Test
    public void shouldSumListWithOneElement() {
        ListSummer summer = new ListSummer(List.of(5));
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(summer);

        int result = summer.join();

        assertEquals(result, 5);
    }

    @Test
    public void shouldSumListWithMultipleElements() {
        ListSummer summer = new ListSummer(List.of(
                1, 2, 3, 4, 5, 6, 7, 8, 9
        ));
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(summer);

        int result = summer.join();

        assertEquals(result, 45);

    }
}