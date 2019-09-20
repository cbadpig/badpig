package code.com.badpig.javase.demo_thread.demo_06;

/**
 * 测试线程dumpStack()方法
 * 该方法的作用是将当前线程的堆栈跟踪信息输出值标准的错误流中
 * 该方法仅用于调试
 */
public class DumpStackTest {
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
       int age = 0;
       age = 100;
       if(age == 100) {
           Thread.dumpStack();
       }
    }

    public static void main(String[] args) {
        DumpStackTest dumpStackTest = new DumpStackTest();
        dumpStackTest.a();
    }
}
