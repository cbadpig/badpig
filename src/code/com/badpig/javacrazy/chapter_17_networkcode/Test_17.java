package code.com.badpig.javacrazy.chapter_17_networkcode;

import code.com.badpig.javacrazy.chapter_17_networkcode.demo_1_InetAddress.InetAddress_A;
import code.com.badpig.javacrazy.chapter_17_networkcode.demo_2_UrlDecoderEncoder.URLDecoderAndURLEncoder_A;
import org.junit.jupiter.api.Test;

public class Test_17 {

    @Test
    public void inetAddress_A_demo_a () {
        InetAddress_A inetAddress_A = new InetAddress_A();
        inetAddress_A.InetAddressDemo_1();
    }

    @Test
    public void URLDecoderAndURLEncoder_A () {
        URLDecoderAndURLEncoder_A urlDecoderAndURLEncoder_A = new URLDecoderAndURLEncoder_A();
        urlDecoderAndURLEncoder_A.urlDecoder_Demo_1();
        urlDecoderAndURLEncoder_A.urlEncoder_Demo_1();
    }


}
