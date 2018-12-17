package code.com.badpig.javacrazy.chapter_18_loadingandreflection;

import code.com.badpig.javacrazy.chapter_18_loadingandreflection.demo_6.A;
import org.junit.jupiter.api.Test;

public class Test_18 {

	@Test
	public void test_5_conn () {
		A.getConnection("jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8","root","666666");
	}

}