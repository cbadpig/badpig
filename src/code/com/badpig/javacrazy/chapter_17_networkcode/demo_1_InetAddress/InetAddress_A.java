package code.com.badpig.javacrazy.chapter_17_networkcode.demo_1_InetAddress;

import java.net.InetAddress;

/**
 * Java提供了InetAddress类来代表IP地址，其包括两个子类：Inet4Address、Inet6Address
 */
public class InetAddress_A {

    public void InetAddressDemo_1 () {

        try {
            //根据主机名来获取InetAddress实例
            InetAddress inetAddress = InetAddress.getByName("www.baidu.com");
            System.out.println("是否可以访问：" + inetAddress.isReachable(2000));
            System.out.println(inetAddress.getHostAddress());

            InetAddress inetAddress1 = InetAddress.getByAddress(new byte[]{127,0,0,1});
            System.out.println("本机是否可以访问：" + inetAddress1.isReachable(2000));
            System.out.println(inetAddress1.getCanonicalHostName());



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
