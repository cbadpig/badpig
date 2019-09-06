package code.com.badpig.javase.demo_thread.demo_04;

/**
 * 线程的sleep()方法
 */
public class MyThread_04 extends Thread {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        try {
            System.out.println(Thread.currentThread().getName() + ",开始休眠");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + ",结束休眠");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + ",休眠["+ (end-start) +"]毫秒");
    }
}
