package code.com.badpig.javase.demo_thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable running，name:" + Thread.currentThread().getName());
    }
}
