package ljj.socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author 刘佳俊
 * @Date 2021/7/19
 * Udp协议中没有明确的服务端和客户端的区分，
 * 一个程序既可以服务端也可以作为服务端
 * <p>
 * <p>
 * 接收方
 */
public class UdpServerDemo01 {
    public static void main(String[] args) throws Exception {
//        开放端口，使得发送方能够发送到相应包到端口号
        DatagramSocket socket = new DatagramSocket(1025);

//        接收数据包
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);
        //阻塞接收
        socket.receive(packet);
        System.out.println(packet.getAddress().getHostName());
        System.out.println(new String(packet.getData(),0,packet.getLength()));

//关闭连接
        socket.close();
    }
}
