package code.com.badpig.artofconcurrency.demo_01;

public class MyRunnableDemo01 implements Runnable {

    private long count;

    public MyRunnableDemo01() {}

    public MyRunnableDemo01(long count) {
        this.count = count;
    }

    @Override
    public void run() {

        for (long i=0 ; i<count ; i++) {
            System.out.println(Thread.currentThread().getName()+","+i);
        };

    }
}
