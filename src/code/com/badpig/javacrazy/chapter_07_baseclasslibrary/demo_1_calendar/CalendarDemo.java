package code.com.badpig.javacrazy.chapter_07_baseclasslibrary.demo_1_calendar;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class CalendarDemo {

    public void demo_1() {
        Calendar calendar = Calendar.getInstance();
        Long millis = calendar.getTimeInMillis();
        System.out.println("当前时间毫秒数（calendar版）：" + millis);
        System.out.println("当前时间毫秒数（System版）：" + System.currentTimeMillis());
        System.out.println("当前时间：" + calendar.getTime());

        System.out.println("当前时间：" + calendar.get(Calendar.YEAR));
    }

    public void demo_2() {
        Clock clock = Clock.systemUTC();
        System.out.println("当前时间毫秒数（Clock版）：" + clock.millis());
        System.out.println("当前时间毫秒数（System版）：" + System.currentTimeMillis());
        System.out.println("当前时间：" + clock.instant());
    }

    public void demo_3() {
        Duration duration = Duration.ofSeconds(7201);
        System.out.println("7200秒转为分钟（Duration版）：" + duration.toMinutes());
        System.out.println("7200秒转为小时（Duration版）：" + duration.toHours());
        System.out.println("7200秒转为毫秒（Duration版）：" + duration.toMillis());
    }

    public void demo_4() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS");
        LocalDateTime localDateTime = LocalDateTime.now();
//        String s = dtf.format(localDateTime);
        String s = localDateTime.format(dtf);
        LocalDateTime.now(Clock.systemDefaultZone());
        LocalDateTime ss = LocalDateTime.parse(s,dtf);
        System.out.println("当前时间（LocalDateTime版）：" + s);
        System.out.println("当前时间（LocalDateTime版）ss：" + ss);
    }



}
