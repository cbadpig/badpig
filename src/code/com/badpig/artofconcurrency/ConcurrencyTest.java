package code.com.badpig.artofconcurrency;

import code.com.badpig.artofconcurrency.demo_01.ConcurrencyDemo01;
import org.junit.jupiter.api.Test;

public class ConcurrencyTest {

    @Test
    public void test_01 () {
        ConcurrencyDemo01.concurrency();
        //ConcurrencyDemo01.serial();
    }
    @Test
    public void test_02 () {
        ConcurrencyDemo01.serial();
    }
}
