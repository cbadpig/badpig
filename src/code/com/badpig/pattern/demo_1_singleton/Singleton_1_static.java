package code.com.badpig.pattern.demo_1_singleton;

/**
 * 静态内部类
 */
public class Singleton_1_static {

    private Singleton_1_static() {}

    //静态内部类
    private static final class Singleton_1_static_Holder {
        private static final Singleton_1_static singleton_1_static_instance = new Singleton_1_static();
    }

    public static Singleton_1_static getInstance() {
        return Singleton_1_static_Holder.singleton_1_static_instance;
    }



}
