package code.com.badpig.javacrazy.chapter_18_loadingandreflection.demo_3;

public class A {

	static {
		System.out.println("静态初始化块...");
	}
	
	/**
	 * 该类变量使用final修饰，而它的值在编译时确定下来，因此compileConstant会被当做宏变量处理。类不被初始化
	 */
	static final String compileConstant = "java - reflection";
	

}
