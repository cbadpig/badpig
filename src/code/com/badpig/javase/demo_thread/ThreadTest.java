package code.com.badpig.javase.demo_thread;

import code.com.badpig.javase.demo_thread.demo_01.MyRunnable;
import code.com.badpig.javase.demo_thread.demo_01.MyThread;
import code.com.badpig.javase.demo_thread.demo_02.MyThread_02;
import org.junit.jupiter.api.Test;

public class ThreadTest {

    /**
     * 测试-继承Thread类
     */
    @Test
    public void demo_01() {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("测试运行结束");
    }

    /**
     * 测试实现Runnable接口
     */
    @Test
    public void demo_02() {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("测试运行结束");
    }

    /**
     * 测试currentThread()方法
     */
    @Test
    public void demo_02_01() {
        MyThread_02 myThread_02 = new MyThread_02();
        myThread_02.start();
        System.out.println("测试方法被调用：" + Thread.currentThread().getName());
    }


}
