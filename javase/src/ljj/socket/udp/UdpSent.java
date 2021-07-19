package ljj.socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author 刘佳俊
 * @Date 2021/7/19
 *
 * 用于发送信息
 *
 *
 */
public class UdpSent implements Runnable {

    private String inetAddress;

    private int port;

    public UdpSent(String inetAddress, int port) {
        this.inetAddress = inetAddress;
        this.port = port;
    }

    @Override
    public void run() {
        DatagramSocket datagramSocket=null;
        try {
            //        1. 建立一个Socket
             datagramSocket = new DatagramSocket();

            Scanner scanner = new Scanner(System.in);


//        2.建个包
            String message;
            InetAddress localhost = InetAddress.getByName(inetAddress);

            while (true) {

                message = scanner.nextLine();
                DatagramPacket packet = new DatagramPacket(message.getBytes(), 0, message.getBytes().length, localhost, port);

//        3.发送包
                datagramSocket.send(packet);

                if (message.trim().equals("bye")) {
                    break;
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //        4.关闭流
            if(datagramSocket!=null){
                datagramSocket.close();
            }

        }




    }
}
