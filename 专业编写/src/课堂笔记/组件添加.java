package 课堂笔记;

import java.awt.*;
import java.awt.event.*;

public class 组件添加 {

	public static void main(String[] args) {
		final Frame f = new Frame("ljj");

		f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
		f.setLocation(0, 0);
		f.setSize(400, 400);
		f.setVisible(true);
		Button but2=new Button("exit");
		Button but1 = new Button("" + 1);
		f.add(but1);
		

		but1.addActionListener(new ActionListener() {
			int i = 2;

			@Override
			public void actionPerformed(ActionEvent e) {
				f.add(new Button("" + i));
				f.setVisible(true);
				i++;
			}

		});
	}

}
