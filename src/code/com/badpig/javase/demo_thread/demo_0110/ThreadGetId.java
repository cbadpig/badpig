package code.com.badpig.javase.demo_thread.demo_0110;

/**
 * getId()方法
 * 获取线程的唯一标识
 */
public class ThreadGetId {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "：" + thread.getId());
    }
}
