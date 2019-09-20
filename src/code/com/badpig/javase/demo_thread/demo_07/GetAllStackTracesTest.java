package code.com.badpig.javase.demo_thread.demo_07;

import java.util.Map;

/**
 * 测试线程getAllStackTracesTest()方法
 * 该方法的作用是返回所有活动线程的堆栈跟踪的一个映射
 */
public class GetAllStackTracesTest {
    public void a() {
        b();
    }
    public void b() {
        c();
    }
    public void c() {
        d();
    }
    public void d() {
        e();
    }
    public void e() {
        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        if (map == null || map.isEmpty()) {
            System.out.println("未获取到该对象。");
            return;
        }

        for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
            Thread thread = entry.getKey();
            StackTraceElement[] stackTraceElements = entry.getValue();
        }

    }

    public static void main(String[] args) {

    }
}
