package code.com.badpig.javase.demo_thread.demo_01;

/**
 * 线程的使用
 * 方法一：继承Thread类
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("继承Thread类");
    }
}


