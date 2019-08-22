package code.com.badpig.java8.demo_lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {

    public static void demo_1() {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer", "Roger Federer",
                "Andy Murray", "Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players = Arrays.asList(atp);

        // 以前的循环方式
        for (String player : players) {
            System.out.print(player + "; ");
        }
        System.out.println("**************************** ");
        // 使用 lambda 表达式以及函数操作(functional operation)
        players.forEach((p) -> System.out.print(p + "; "));
        System.out.println("**************************** ");
        // 使用 lambda 表达式以及函数操作(functional operation)
        // 在 Java 8 中使用双冒号操作符(double colon operator)
        players.forEach(System.out::println);
    }

    public static void demo_2() {
        Runnable r = () -> System.out.println("hello world");
        Thread t = new Thread(r);
        t.start();
    }

    public static void main(String[] args) {
        demo_2();
    }
}