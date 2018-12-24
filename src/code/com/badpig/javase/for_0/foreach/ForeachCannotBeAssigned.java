package code.com.badpig.javase.for_0.foreach;

import java.util.ArrayList;
import java.util.List;

/**
 * foreach内修改对象的值，无效
 */
public class ForeachCannotBeAssigned {

    /**
     * 无法改变数组的值
     */
    public static void CannotBeAssigned_demo_1() {
        int[] ints = new int[]{1,2,3,4};
        for(int in : ints) {
            in = 0;
            System.out.println("foreach内修改："+in);
        }

        for(int in : ints) {
            System.out.println("foreach修改后："+in);
        }
    }

    /**
     *无法改变list的值
     */
    public static void CannotBeAssigned_demo_2() {
        Persion persion = new Persion();
        persion.setName("张三");
        persion.setAge(1);

        List<Integer> lists = new ArrayList<Integer>();
        lists.add(1);
        lists.add(2);
        lists.add(3);

        for(int list : lists) {
            list = 0;
            System.out.println("foreach内修改："+list);
        }

        for(int list : lists) {
            System.out.println("foreach修改后："+list);
        }
    }

}
