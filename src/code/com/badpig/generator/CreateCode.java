package code.com.badpig.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CreateCode {

    public static void generatorCode() {
        System.out.println("*************++代码自动生成开始++******************");
        try {
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            File configFile = new File(getPath());
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("*************++代码自动生成结束++******************");
    }

    public static String getPath() {
        String str = CreateCode.class.getResource("/").getPath()+"resources/config/generatorConfig.xml";
        String path = str.substring(1,str.length());
        return path;
    }

    public static void main(String[] args) {
        generatorCode();
    }
}
