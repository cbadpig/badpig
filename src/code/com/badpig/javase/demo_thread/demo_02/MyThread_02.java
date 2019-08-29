package code.com.badpig.javase.demo_thread.demo_02;

/**
 * 打印currentThread()线程类
 */
public class MyThread_02 extends Thread {

    public MyThread_02() {
        System.out.println("构造方法被调用：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法被调用：" + Thread.currentThread().getName());
    }
}
