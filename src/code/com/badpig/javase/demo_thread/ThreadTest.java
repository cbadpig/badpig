package code.com.badpig.javase.demo_thread;

import code.com.badpig.javase.demo_thread.demo_01.MyRunnable;
import code.com.badpig.javase.demo_thread.demo_01.MyThread;
import code.com.badpig.javase.demo_thread.demo_02.MyThread_02;
import code.com.badpig.javase.demo_thread.demo_03.MyThread_03;
import code.com.badpig.javase.demo_thread.demo_04.MyThread_04;
import code.com.badpig.javase.demo_thread.demo_05.StaticTraceTest;
import org.junit.jupiter.api.Test;

import java.util.Date;

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

    /**
     * 测试线程的isAlive()方法
     */
    @Test
    public void demo_03_01() {
        MyThread_03 myThread_03 = new MyThread_03();
        System.out.println("begin：" + myThread_03.isAlive());
        myThread_03.start();
        System.out.println("end：" + myThread_03.isAlive());
    }

    /**
     * 测试线程的sleep()方法
     */
    @Test
    public void demo_04_01() {
        long start = System.currentTimeMillis();
        try {
            System.out.println("开始休眠");
            Thread.sleep(2000);
            System.out.println("结束休眠");
            long end = System.currentTimeMillis();
            System.out.println("休眠["+ (end-start) +"]毫秒");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
