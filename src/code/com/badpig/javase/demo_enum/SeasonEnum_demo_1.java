package code.com.badpig.javase.demo_enum;

public enum SeasonEnum_demo_1 {

    SPRING("春天"),SUMMER("春天"),FALL("春天"),WINTER("春天");

    private final String name;

    private SeasonEnum_demo_1(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
