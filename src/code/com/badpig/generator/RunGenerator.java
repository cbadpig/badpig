package code.com.badpig.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RunGenerator {

    public static void generator(){
        System.out.println("*************++代码自动生成开始++******************");
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File(getConfigPath());
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = null;
        MyBatisGenerator myBatisGenerator = null;
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        try {
            config = cp.parseConfiguration(configFile);
            myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("*************++代码自动生成结束++******************");
    }

    public static String getConfigPath() {
        String str = RunGenerator.class.getResource("/").getPath()+"config/generatorConfig.xml";
        String path = str.substring(1,str.length());
        return path;
    }

    public static void main(String args[]) {
        generator();
        //System.out.println(getConfigPath());
    }

}
