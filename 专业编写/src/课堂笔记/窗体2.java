package 课堂笔记;

import javax.swing.*;
import java.awt.*;

/*

public class 窗体2 {

	public static void main(String[] args) {
		//设置窗体
		final Frame f = new Frame("刘佳俊");
		f.setLayout(new BorderLayout());
		f.setSize(300, 300);
		f.setLocation(300, 200);
		f.setVisible(true);
		//创建按钮
		Button but1 = new Button("东部");

		Button but2 = new Button("西部");

		Button but3 = new Button("南部");

		Button but4 = new Button("北部");

		Button but5 = new Button("中部");
//添加颜色
		but1.setBackground(Color.black);
		but2.setBackground(Color.BLUE);
		but3.setBackground(Color.pink);
		but4.setBackground(Color.green);
		but5.setBackground(Color.orange);
		//按钮布局
		f.add(but1, BorderLayout.EAST);
		f.add(but2, BorderLayout.WEST);
		f.add(but3, BorderLayout.SOUTH);
		f.add(but4, BorderLayout.NORTH);
		f.add(but5, BorderLayout.CENTER);
	}

}


package 课堂笔记;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class 窗体2 {
	public static void main(String[] args) {
		int width = 300;
		int height = 300;
		JFrame jf = new JFrame("刘佳俊");

		jf.setSize(width, height);

		jf.getColorModel();

		JButton btn0=new JButton("按钮1");
	JButton btn1 = new JButton("按钮2");
	JButton btn2=new JButton("按纽3");
		jf.add(btn0);
		jf.add(btn1);
		jf.add(btn2);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// 退出语句
		jf.setVisible(true);
	}
}




package 课堂笔记;

import java.awt.GridLayout;

import javax.swing.*;

import javax.swing.WindowConstants;

public class 窗体2 {
	public static void main(String[] args) {
		
	JFrame jf=new JFrame("刘佳俊");
	jf.setLayout(new GridLayout(3,3));
	jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// 退出语句
		jf.setLocation(300, 500);
		jf.setSize(400, 400);
		for(int i=0;i<9;i++) {
			JButton jb=new JButton("btn"+(i+1));
			jf.add(jb);
		}
		
		jf.setVisible(true);
	}
}





import java.awt.*;
class Layout extends Frame{
	public Layout (String title) {
		GridBagLayout layout =new GridBagLayout();
		GridBagConstraints c =new GridBagConstraints();
		this.setLayout(layout);
		c.fill=GridBagConstraints.BOTH;
		c.weightx=1;
		c.weighty=1;
		this.addComponent("btn1",layout,c);
		this.addComponent("btn2",layout,c);
		this.addComponent("btn3",layout,c);
		c.gridwidth=GridBagConstraints.REMAINDER;
		this.addComponent("btn4", layout, c);
		c.weightx=0;
		c.weighty=0;
		addComponent("btn5",layout,c);
		c.gridwidth=1;
		this.addComponent("btn6", layout, c);
		c.gridwidth=GridBagConstraints.REMAINDER;
		this.addComponent("btn7", layout, c);
		c.gridwidth=1;
		c.gridheight=2;
		c.weightx=2;
		c.weighty=2;
		this.addComponent("btn8", layout, c);
		c.gridwidth=GridBagConstraints.REMAINDER;
		c.gridheight=1;
		this.addComponent("btn9", layout, c);
		this.addComponent("btn10", layout, c);
		this.pack();
		this.setVisible(true);
		
		
		
		
		
	
				
	}
	private void addComponent(String name,GridBagLayout layout,GridBagConstraints c) {
		Button bt=new Button(name);
		layout.setConstraints(bt,c);
		this.add(bt);
	}
}


public class 窗体2{
	public static void main(String[] args) {
		new Layout("GridBagLayout");
	}
}







 import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;
 class Cardlayout extends Frame implements ActioinListener{
	 Panel cardPanel=new Panel();
	 Panel controlpanPanel=new Panel();
	 Button nextbutton,preButton;
	 CardLayout cardLayout =new CardLayout();
	 public Cardlayout() {
		 setSize(300,200);
		 setVisible(true);
		 this.addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e) {
				 Cardlayout.this.dispose();
			 }
		 });
		 
		 cardPanel.setLayout(cardLayout);
		 cardPanel.add(new Label("first",Label.CENTER));
		 cardPanel.add(new Label("second",Label.CENTER));
		 cardPanel.add(new Label("third",Label.CENTER));
		 nextbutton=new Button("next one");
		 preButton=new Button("last one");
		 nextbutton.addActionListener((ActionListener) this);
		 preButton.addActionListener((ActionListener) this);
		 controlpanPanel.add(preButton);
		 controlpanPanel.add(nextbutton);
		 this.add(controlpanPanel,BorderLayout.SOUTH);
		 
		 
	 }
	 
	 public void actionperformed(ActionEvent e) {
		 if(e.getSource()==nextbutton) {
			 cardLayout.next(cardPanel);
			 
		 }
		 if(e.getSource()==preButton) {
			 cardLayout.previous(cardPanel);
		 }
	 }
 }

 
 public class 窗体2{
	 public static void main(String[] args) {
		 new Cardlayout();
	 }
 }



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Cardlayout extends Frame implements ActionListener {
    Panel cardPanel = new Panel();
    Panel ControlpaPanel = new Panel();
    Button nextbutton, preButton;
    CardLayout cardLayout = new CardLayout();

    public Cardlayout() {
        setSize(400, 300);
        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Cardlayout.this.dispose();
            }
        });
        cardPanel.setLayout(cardLayout);
        cardPanel.add(new Label("first", Label.CENTER));
        cardPanel.add(new Label("second", Label.CENTER));
        cardPanel.add(new Label("third", Label.CENTER));

        nextbutton = new Button("next one");
        preButton = new Button("last one");


        nextbutton.addActionListener(this);
        nextbutton.addActionListener(this);

        ControlpaPanel.add(preButton);
        ControlpaPanel.add(nextbutton);
        this.add(cardPanel, BorderLayout.CENTER);
        this.add(ControlpaPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextbutton) {
            cardLayout.next(cardPanel);
        }
        if (e.getSource() == preButton) {
            cardLayout.previous(cardPanel);
        }
    }
}

public class 窗体2 {
    public static void main(String[] args){
        new Cardlayout();

    }
} 



public class 窗体2{
	
	//流式布局    JPanel
	
	public static void main(String[] args) {
		JFrame jf=new JFrame("刘佳俊");//new一个窗体
		jf.setSize(600, +600);//设置窗体大小
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭语句
		jf.setVisible(true);//设置窗体为可见
		jf.setLocation(200, 200);//设置窗体出现的位置
		
//创建内容面板  这里使用流式布局
 		FlowLayout  layout=new FlowLayout(FlowLayout.CENTER,10,0);//对齐方式，水平间隙，竖直间隙  默认为5个单位
		JPanel panel=new JPanel(layout);
		                                                                        
		for(int i=0;i<10;i++) {
			JButton jb=new JButton("btn");
			panel.add(jb);
		}
		jf.setContentPane(panel);//指定窗体的管理器为流式布局
		
	}
}



public class 窗体2 {

	// 网格布局 GridLayout

	public static void main(String[] args) {
		JFrame jf = new JFrame("刘佳俊");
		jf.setSize(600, +600);// 设置窗体大小
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// 关闭语句
		jf.setVisible(true);// 设置窗体为可见
		
		GridLayout layout=new GridLayout(3,3);//当组件数大于网格数   则以行数与总数优先
		                                        //设置三行三列 
		
//		layout.setColumns(3);设置行
//		layout.setRows(3);设置列
		
		
		JPanel panel=new JPanel(layout);
		for(int i=0;i<9;i++) {
			JButton jb=new JButton("btn"+(i+1));
			panel.add(jb);
		
		}
		jf.setContentPane(panel);//指定窗体的管理器为流式布局
		
	}
}

*/



public class 窗体2{
	
	//网格袋布局  GridBagLayout
	
	public static void main(String[] args) {
		JFrame jf=new JFrame("test");
		jf.setSize(300, 300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);//将窗体放置在中间
		
		GridBagLayout layout=new GridBagLayout();
		JPanel jp=new JPanel(layout);
		JButton jb1=new JButton("button");
		for(int i=0;i<10;i++) {
			JButton jb=new JButton("btn"+(i+1));
			jp.add(jb);
		}
		jp.add(jb1);
		jf.setContentPane(jp);
		
		
	}
}











