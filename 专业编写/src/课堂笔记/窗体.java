package 课堂笔记;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class 窗体 {

	public static void main(String[] args) {
		Frame f = new Frame("刘佳俊");
		Color color=Color.pink;
		f.setSize(400,300);
		f.setLocation(300, 200);
		f.setVisible(true);
		f.setBackground(color);
		Button but=new Button("see you later");
		f.add(but);
		f.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		

	}

}
