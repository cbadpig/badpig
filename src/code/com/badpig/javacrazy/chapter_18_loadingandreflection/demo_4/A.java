package code.com.badpig.javacrazy.chapter_18_loadingandreflection.demo_4;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class A {

	public static void getBootClass() {
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		System.out.println("系统类加载器：" + classLoader);
		
		try {
			Enumeration<URL> eml = classLoader.getResources("");
			
			while (eml.hasMoreElements()) {
				System.out.println(eml.nextElement());
			}
			
			ClassLoader classLoader2 = classLoader.getParent();
			System.out.println("扩展类加载器：" + classLoader2);
			System.out.println("扩展类加载器的加载路径：" + System.getProperty("java.ext.dirs"));
			System.out.println("扩展类加载器：" + classLoader2.getParent());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
