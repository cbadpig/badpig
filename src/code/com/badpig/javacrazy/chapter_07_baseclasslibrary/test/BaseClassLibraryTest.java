package code.com.badpig.javacrazy.chapter_07_baseclasslibrary.test;

import code.com.badpig.javacrazy.chapter_07_baseclasslibrary.demo_1_calendar.CalendarDemo;
import org.junit.jupiter.api.Test;

public class BaseClassLibraryTest {

    @Test
    public void test_calendar_1() {
        CalendarDemo calendarDemo = new CalendarDemo();
        calendarDemo.demo_1();
    }

    @Test
    public void test_calendar_2() {
        CalendarDemo calendarDemo = new CalendarDemo();
        calendarDemo.demo_2();
    }

    @Test
    public void test_calendar_3() {
        CalendarDemo calendarDemo = new CalendarDemo();
        calendarDemo.demo_3();
    }

    @Test
    public void test_calendar_4() {
        CalendarDemo calendarDemo = new CalendarDemo();
        calendarDemo.demo_4();
    }
}
