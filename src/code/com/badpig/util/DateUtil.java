package code.com.badpig.util;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    private DateUtil() {}

    private static final class DateUtilHolder {
        private static final DateUtil dateUtil = new DateUtil();
    }

    private static DateUtil getInstance() {
        return DateUtilHolder.dateUtil;
    }

    /**
     * 获取当前时间的毫秒数，返回数据为Long型
     * @return
     */
    public static Long currentTimeMillis() {
        return Clock.systemDefaultZone().millis();
    }

    /**
     * 获取当前时间的毫秒数，返回数据为String型
     * @return
     */
    public static String currentTimeMillisString() {
        return String.valueOf(DateUtil.currentTimeMillis());
    }

    /**
     * 获取系统当前日期，不分时区。
     * @return
     */
    private static LocalDateTime now() {
        return LocalDateTime.now();
    }

    /**
     * 获取系统日期时间，不带毫秒
     * @return
     */
    public static String nowDefault() {
        return now("yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 获取系统日期时间，带毫秒
     * @return
     */
    public static String nowMillisDefault() {
        return now("yyyy-MM-dd HH:mm:ss:SSS");
    }

    /**
     * 获取系统日期时间，自定义格式
     * @return
     */
    public static String now(String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return DateUtil.now().format(dateTimeFormatter);
    }

}
