package code.com.badpig.javase.demo_thread.demo_99;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Executors_Demo {

    private static final int nThreads = Runtime.getRuntime().availableProcessors();

    public static void newFixedThreadPool_Demo() {
        ExecutorService executorService = Executors.newFixedThreadPool(nThreads*2);

        for (int i=0 ; i < 100000 ; i++)  {
            executorService.submit(new MyRunnable(i));
        }
        //等待线程结束
        executorService.shutdown();
        try {
            boolean flag = executorService.awaitTermination(3, TimeUnit.SECONDS);
            System.out.println("线程池结束，flag：" + flag);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        newFixedThreadPool_Demo();
    }
}
