package code.com.badpig.pattern.test;

import code.com.badpig.pattern.demo_1_singleton.Singleton_2_enum;
import org.junit.jupiter.api.Test;

public class PatternTest {

    @Test
    public void test_1_single() {
        System.out.println(Singleton_2_enum.SINGLE == Singleton_2_enum.SINGLE);
    }

}
