import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aselsan on 12.12.2018 at 14:16.
 */
public class SockMerchantTest {

    @Test
    public void sockMerchant() {
        SockMerchant.sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20});
    }
}