package code.com.badpig.javacrazy.chapter_17_networkcode.demo_2_UrlDecoderEncoder;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * URLDecoder和URLEncoder用于完成普通字符串和application/x-www-form-urlencoded MIME字符串之间的相互转换
 */
public class URLDecoderAndURLEncoder_A {

    /**
     * 将普通字符串转为application/x-www-form-urlencoded MIME字符串
     */
    public void urlEncoder_Demo_1() {

        try {
            String urlEncoderString = URLEncoder.encode("中国","UTF-8");
            System.out.println("普通字符串转为MIME字符串：" + urlEncoderString);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    /**
     * 将地址中的乱码，转换为普通字符串
     */
    public void urlDecoder_Demo_1() {

        try {
            String urlDecoderString = URLDecoder.decode("%E4%B8%AD%E5%9B%BD","UTF-8");
            System.out.println("将MIME字符串转为普通字符串：" + urlDecoderString);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
