package code.com.badpig.javase.demo_thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {

    @Test
    public void testThread_01() {
        MyThread myThread = new MyThread();
        myThread.start();
    }

    @Test
    public void testRunnable_01() {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }

    @Test
    public void testPool_01() {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i=0 ; i<100; i++) {
            pool.submit(new MyRunnable());
        }

        pool.shutdown();
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }

}
