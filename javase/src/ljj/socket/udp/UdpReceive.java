package ljj.socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author 刘佳俊
 * @Date 2021/7/19
 *
 * 用于接收信息
 *
 */
public class UdpReceive implements Runnable{

    private String name;
    private int port;

    public UdpReceive(String name, int port) {
        this.name = name;
        this.port = port;
    }


    @Override
    public void run() {
        DatagramSocket socket=null;
        try {
            //        开放端口，使得发送方能够发送到相应包到端口号
            socket = new DatagramSocket(port);

//        接收数据包
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);

            while(true){
                //阻塞接收
                socket.receive(packet);

                String message=new String(packet.getData(),0,packet.getLength());
                System.out.println(name+": "+message);

                if(message.equals("bye")){
                    break;
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {

//关闭连接
            socket.close();
        }







    }
}
