package code.com.badpig.javase.demo_thread.demo_03;

/**
 * 线程的isAlive()方法
 */
public class MyThread_03 extends Thread {

    @Override
    public void run() {
        System.out.println("run方法被调用：" + this.isAlive());
    }
}
