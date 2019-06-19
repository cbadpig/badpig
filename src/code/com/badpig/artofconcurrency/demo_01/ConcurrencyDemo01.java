package code.com.badpig.artofconcurrency.demo_01;

public class ConcurrencyDemo01 {

    private static final long counts = 100L;

    public static void concurrency() {
        long s = System.currentTimeMillis();
        Thread thread = new Thread(new MyRunnableDemo01(counts));
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        long e = System.currentTimeMillis();
        System.out.println("");
        System.out.println(counts + "多线程耗时：" + (e-s) + "毫秒");
    }

    public static void serial() {
        long s = System.currentTimeMillis();

        for (long i=0 ; i<counts ; i++) {
            System.out.print(i);
        };
        long e = System.currentTimeMillis();
        System.out.println("");
        System.out.println(counts + "串行耗时：" + (e-s) + "毫秒");
    }
}
