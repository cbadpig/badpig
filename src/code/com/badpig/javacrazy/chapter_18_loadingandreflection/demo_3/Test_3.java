package code.com.badpig.javacrazy.chapter_18_loadingandreflection.demo_3;

import org.junit.jupiter.api.Test;

public class Test_3 {

	@Test
	public void testA () {
		System.out.println(A.compileConstant);
	}
	
	@Test
	public void testB() {
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		
		try {
			cl.loadClass("javac.com.badpig.javase.crazyjava.java18_loadingandreflection.demo3.B");
			Class.forName("javac.com.badpig.javase.crazyjava.java18_loadingandreflection.demo3.B");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
