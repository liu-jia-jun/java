package ljj.socket;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * @author 刘佳俊
 * @Date 2021/7/18
 */
public class TestinetSocketAddress {
    public static void main(String[] args) {
        /**
         * InetSocketAddress,通过有参构造来获取相应信息，
         *
         * 可以获取端口号和ip地址
         */

        InetSocketAddress address = new InetSocketAddress("localhost", 8080);
        System.out.println(address);

        int port = address.getPort();
        System.out.println(port);

        InetAddress inetAddress = address.getAddress();
        System.out.println(inetAddress);

    }
}
