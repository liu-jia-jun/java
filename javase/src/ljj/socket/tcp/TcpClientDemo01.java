package ljj.socket.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 刘佳俊
 * @Date 2021/7/19
 * <p>
 * 客户端
 * <p>
 * <p>
 * 注意:获取InetAddress对象不能使用new来得到对象实例，必须要通过调用InetAddress的静态方法来获取
 */
public class TcpClientDemo01 {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream outputStream = null;
        Scanner scanner = null;

        try {

            scanner = new Scanner(System.in);
//获取服务器的地址和端口号来创建一个socket连接
            socket = new Socket(InetAddress.getByName("localhost"), 8081);

            outputStream = socket.getOutputStream();

            String message = null;
            while (true) {
                message = scanner.nextLine();
//发送消息的IO流，将message转换成byte数组
                outputStream.write(message.getBytes());

                if (message.trim().equals("bye")) {
                    break;
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (scanner != null) {
                scanner.close();
            }

            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
