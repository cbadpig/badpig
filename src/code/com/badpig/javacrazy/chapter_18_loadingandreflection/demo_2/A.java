package code.com.badpig.javacrazy.chapter_18_loadingandreflection.demo_2;

public class A {

	//声明变量a时指定初始值
	static int a = 5;
	static int b;
	static int c;
	
	static {
		//使用静态初始化块为变量b指定初始值
		b = 6;
	}
	
}
