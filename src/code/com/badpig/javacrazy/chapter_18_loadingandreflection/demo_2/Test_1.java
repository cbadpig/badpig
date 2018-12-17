package code.com.badpig.javacrazy.chapter_18_loadingandreflection.demo_2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test_A")
public class Test_1 {

	@Test
	public void test_A() {
		System.out.println("a:" + A.a);
		System.out.println("b:" + A.b);
		System.out.println("c:" + A.c);
	}
	
	@Test
	public void test_B() {
		System.out.println("a:" + B.a);
		System.out.println("b:" + B.b);
		System.out.println("c:" + B.c);
	}
	
}
