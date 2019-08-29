package code.com.badpig.javase.demo_thread.demo_01;

/**
 * 线程的使用
 * 方法二：实现Runnable接口的方法
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("实现Runnable接口");
    }
}
