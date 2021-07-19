package ljj.socket.udp;

/**
 * @author 刘佳俊
 * @Date 2021/7/19
 *
 * 通过udp进行实时对话，用户1
 *
 */
public class UdpDialogUser2 {
    public static void main(String[] args) {
        new Thread(new UdpReceive("user2",1025)).start();
        new Thread(new UdpSent("localhost",1024)).start();
    }
}
