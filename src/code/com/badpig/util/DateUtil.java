package code.com.badpig.util;

import org.junit.platform.commons.util.StringUtils;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * 日期时间工具类
 */
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

    /**
     * 将日期字符串转为LocalDateTime格式，指定格式
     * @return
     */
    public static LocalDateTime stringToLocalDateTime(String dateTime,String pattern) {
        if (StringUtils.isNotBlank(pattern)) {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
            return LocalDateTime.parse(dateTime,dateTimeFormatter);
        }
        return LocalDateTime.parse(dateTime);
    }

    /**
     * 将日期字符串转为LocalDateTime格式
     * @return
     */
    public static LocalDateTime stringToLocalDateTime(String dateTime) {
        return stringToLocalDateTime(dateTime,"yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 将日期字符串转为毫秒数
     * @return
     */
    public static String dateTimeToMills(String dateTime) {
        LocalDateTime localDateTime = stringToLocalDateTime(dateTime,"yyyy-MM-dd HH:mm:ss");
        Long mills = localDateTime.toInstant(ZoneOffset.ofHours(8)).toEpochMilli();
        return String.valueOf(mills);
    }

}
