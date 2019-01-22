package code.com.badpig.util.test;

import code.com.badpig.util.DateUtil;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.jupiter.api.Test;

public class UtilTest {

    @Test
    public void test_DateUtil_1() {
        System.out.println("当前时间毫秒数：" + DateUtil.currentTimeMillisString());
        System.out.println("当前类的两个毫秒数是否相同：" + DateUtil.currentTimeMillisString() == DateUtil.currentTimeMillisString());
        System.out.println("当前时间日期：" + DateUtil.nowDefault());
        System.out.println("****");
        System.out.println("****");
        System.out.println("****");
        System.out.println("****");
        System.out.println("当前时间日期：" + DateUtil.nowMillisDefault());
        System.out.println("当前时间日期：" + DateUtil.nowDefault());
        System.out.println("当前时间日期：" + DateUtil.now("MM"));
        for (int i=0 ; i<10 ; i++) {
            System.out.println("当前时间日期：" + DateUtil.nowDefault());

            System.out.println("当前时间日期毫秒：" + DateUtil.nowMillisDefault() +","+ DateUtil.nowMillisDefault());
        }


    }

}
