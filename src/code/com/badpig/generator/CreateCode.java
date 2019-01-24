package code.com.badpig.generator;

import org.mybatis.generator.config.xml.ConfigurationParser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CreateCode {

    private static void generatorCode() {
        System.out.println("*************++代码自动生成开始++******************");
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File(getPath());
        System.out.println("配置文件是否存在：" + configFile.exists());
        ConfigurationParser cp = new ConfigurationParser(warnings);

        System.out.println("*************++代码自动生成结束++******************");

    }

    private static String getPath() {
        String str = RunGenerator.class.getResource("/").getPath()+"resources/config/generatorConfig.xml";
        String path = str.substring(1,str.length());
        return path;
    }

    public static void main(String[] args) {
        generatorCode();
    }
}
