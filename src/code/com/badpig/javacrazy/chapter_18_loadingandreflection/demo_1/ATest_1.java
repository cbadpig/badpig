package code.com.badpig.javacrazy.chapter_18_loadingandreflection.demo_1;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author 89151
 *
 */
public class ATest_1 {
	
	@Test
	void test1() {
		//创建A类实例
		A a_ = new A();
		//让A实例的类变量a的值自加
		a_.a ++;
		System.out.println("****" + a_.a);
	}
	
	
}
