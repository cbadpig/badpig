package code.com.badpig.javacrazy.chapter_18_loadingandreflection.demo_6;

import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.Driver;
import java.util.Properties;

public class A {

	private static Connection conn;
	
	public static Connection getConnection(String url,String root,String password) {
		
		try {
			if (conn == null) {
				
				URL[] urls = {new URL("file:mysql-connector-java-8.0.13.jar")};
				URLClassLoader urlClassLoader = new URLClassLoader(urls);
				//mysql版本8.0以后driver要引用import com.mysql.cj.jdbc.Driver
				Driver driver = (Driver) urlClassLoader.loadClass("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
				
				Properties properties = new Properties();
				properties.setProperty("user", root);
				properties.setProperty("password", password);
				
				//url要加入失去，否则时区会报错。serverTimezone=GMT%2B8 
				conn = driver.connect(url, properties);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
