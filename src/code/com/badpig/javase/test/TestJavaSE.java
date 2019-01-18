package code.com.badpig.javase.test;

import code.com.badpig.javase.demo_enum.ProjectEnum;
import code.com.badpig.javase.demo_enum.SeasonEnum;
import code.com.badpig.javase.demo_enum.SeasonEnum_demo_1;
import org.junit.jupiter.api.Test;

public class TestJavaSE {

    @Test
    public void test_SeasonEnum() {
        System.out.println(SeasonEnum.SPRING+ ":" + SeasonEnum.SPRING.name);
        System.out.println("****************");
        SeasonEnum[] seasonEnums = SeasonEnum.values();
        for (int i=0 ; i<seasonEnums.length ; i++) {
            System.out.println(seasonEnums[i]);
        }
        System.out.println("****************");
        SeasonEnum seasonEnum2 = Enum.valueOf(SeasonEnum.class,"WINTER");
        seasonEnum2.name = "冬天";
        System.out.println(seasonEnum2 + ":" + seasonEnum2.name);

        System.out.println("****************");

        System.out.println(SeasonEnum_demo_1.SPRING + ":" + SeasonEnum_demo_1.SPRING .getName());

        System.out.println("****************");

        System.out.println(ProjectEnum.lovestory.name() + ":" + ProjectEnum.examonlin.value()+ ":" + ProjectEnum.getProjectEnumLx(1));
    }

}
