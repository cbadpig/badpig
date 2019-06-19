package code.com.badpig.javase.demo_thread;

public class MyRunnable implements Runnable {

    private int num;

    public MyRunnable() {}

    public MyRunnable(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("第"+ (num+1) +"个线程["+ Thread.currentThread().getName() +"]");
    }
}
