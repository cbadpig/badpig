package code.com.badpig.javase.demo_thread.demo_99;

public class MyThread extends Thread {

    private int num;

    public MyThread() {}

    public MyThread(int num) {
        this.num = num;
    }

    public void run(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("第"+ (num+1) +"个线程["+ Thread.currentThread().getName() +"]");
    }
}
