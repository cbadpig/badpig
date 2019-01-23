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

    /**
     * 日期格式-默认
     */
    private static final String PATTERN_DEFAULT = "yyyy-MM-dd HH:mm:ss";
    /**
     * 日期格式-默认带毫秒
     */
    private static final String PATTERN_DEFAULT_MILLIS = "yyyy-MM-dd HH:mm:ss:SSS";

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
        return now(PATTERN_DEFAULT);
    }

    /**
     * 获取系统日期时间，带毫秒
     * @return
     */
    public static String nowMillisDefault() {
        return now(PATTERN_DEFAULT_MILLIS);
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
        DateTimeFormatter dateTimeFormatter = null;
        if (StringUtils.isNotBlank(pattern)) {
            dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        } else {
            dateTimeFormatter = DateTimeFormatter.ofPattern(PATTERN_DEFAULT);
        }
        return LocalDateTime.parse(dateTime,dateTimeFormatter);
    }

    /**
     * 将日期字符串转为LocalDateTime格式
     * @return
     */
    public static LocalDateTime stringToLocalDateTime(String dateTime) {
        return stringToLocalDateTime(dateTime,PATTERN_DEFAULT);
    }

    /**
     * 将日期字符串转为毫秒数
     * @return
     */
    public static String dateTimeToMillis(String dateTime,String pattern) {
        LocalDateTime localDateTime = stringToLocalDateTime(dateTime,PATTERN_DEFAULT);
        Long mills = localDateTime.toInstant(ZoneOffset.ofHours(8)).toEpochMilli();
        return String.valueOf(mills);
    }

    /**
     * 将日期字符串转为毫秒数
     * @return
     */
    public static String dateTimeToMillis(String dateTime) {
        return dateTimeToMillis(dateTime,PATTERN_DEFAULT);
    }

}
