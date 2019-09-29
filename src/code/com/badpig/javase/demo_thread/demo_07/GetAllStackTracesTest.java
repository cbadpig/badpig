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
            System.out.println("------------------每个线程的基本信息");
            System.out.println("线程名：" + thread.getName());
            System.out.println("线程状态：" + thread.getState());
            System.out.println("stackTraceElements size：" + stackTraceElements.length);
            if(stackTraceElements.length == 0) {
                continue;
            }
            System.out.println("stackTraceElements数组基本信息，如下：");
            for (StackTraceElement s:stackTraceElements) {
                System.out.println("  " + s.getClassName() + " " + s.getMethodName() + " " + s.getLineNumber() );
            }
        }

    }

    public static void main(String[] args) {
        GetAllStackTracesTest getAllStackTracesTest = new GetAllStackTracesTest();
        getAllStackTracesTest.a();
    }
}
