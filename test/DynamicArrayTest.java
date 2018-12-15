import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ilkayaktas on 2018-12-15 at 22:31.
 */
public class DynamicArrayTest {

    @Test
    public void dynamicArray() {


        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 0, 5),
                Arrays.asList(1, 1, 7),
                Arrays.asList(1, 0, 3),
                Arrays.asList(2, 1, 0),
                Arrays.asList(2, 1, 1)
        );


        DynamicArray.dynamicArray(2, list);
    }
}