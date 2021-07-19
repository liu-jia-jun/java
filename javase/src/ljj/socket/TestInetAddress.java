package ljj.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 刘佳俊
 * @Date 2021/7/18
 *
 * 用于测试InetAddress类
 *
 *
 */
public class TestInetAddress {
    public static void main(String[] args) throws UnknownHostException {

        /**
         * 此类表示Internet协议（IP）地址。
         * IP地址是由IP使用的32位或128位无符号数字，构建UDP和TCP协议的低级协议。
         * IP地址结构由定义RFC 790: Assigned Numbers ， RFC 1918: Address Allocation for Private Internets ， RFC 2365: Administratively Scoped IP Multicast和RFC 2373: IP Version 6 Addressing Architecture 。
         * InetAddress的一个实例由一个IP地址和可能的相应主机名组成（取决于它是用主机名构造还是已经完成了反向主机名解析）。
         *
         * InetAddress 该实例通过主机名或者ip地址来获取其相关信息(该类提供了将主机名解析为其IP地址的方法，反之亦然。 )
         */



        InetAddress inetAddress = InetAddress.getByName("localhost");
        System.out.println(InetAddress.getLocalHost());
        System.out.println(inetAddress.getAddress());
        System.out.println(inetAddress.getCanonicalHostName());
        System.out.println(inetAddress.getHostAddress());
        System.out.println(inetAddress.getHostName());

    }
}
