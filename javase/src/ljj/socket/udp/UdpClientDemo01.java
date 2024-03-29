package ljj.socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @author 刘佳俊
 * @Date 2021/7/19
 * <p>
 * Udp协议中没有明确的服务端和客户端的区分，
 * 一个程序既可以作为服务端也可以作为服务端
 * <p>
 * <p>
 * 发送方
 */
public class UdpClientDemo01 {
    public static void main(String[] args) throws Exception {


//        1. 建立一个Socket
        DatagramSocket datagramSocket = new DatagramSocket();

        Scanner scanner= new Scanner(System.in);




//        2.建个包
        String message ;
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 1025;
while (true){

    message=scanner.nextLine();
    DatagramPacket packet = new DatagramPacket(message.getBytes(), 0, message.getBytes().length, localhost, port);

//        3.发送包
    datagramSocket.send(packet);

    if (message.trim().equals("bye")){
        break;
    }
}

//        4.关闭流
        datagramSocket.close();
    }
}
