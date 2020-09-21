package 算法与数据结构;

import java.util.*;

/*

(rear+maxsize-front)%maxsize    判断队列中有效数据的个数

front==rear  判断队列是否为空

(rear+1)%maxsize==front  判断队列是否已满

队列中存在一个空  rear 指向的就是空

*/
public class 环形数组队列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean tf=true;
		String choose;
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个整数  代表你队列的长度");
		 size=sc.nextInt();
		 ringArray arr=new ringArray(size);
		 System.out.println("请输入一个字母代表你的操作");
			System.out.println("a为增加元素\n g为取出元素\n s为打印所有元素\n i为判断队列是否为空\n l为返回队列有效元素个数\n e为退出程序");
		
		while(tf) {
			
			choose=sc.next();
			switch(choose) {
			case "a":
				String data;
				System.out.println("请输入你要输入的数据");
				data=sc.next();
				;
				if(arr.add(data)) {
					System.out.println("添加成功");
				}else {
					System.out.println("添加失败");
				}
				break;
			case "g":System.out.println(arr.get());
			break;
			case "s":arr.show();
			break;
			case "e": tf=false;
			break;
			case "i":arr.isEmpty();break;
			case "l":System.out.println(arr.length());;break;
			default :System.out.println("无效操作");
			break;
		}
		}
		System.out.println("程序退出成功");
		

	}

}

class ringArray {
	private int maxsize = 10;//队列长度  默认为10  构造参数中可以重新赋值
	private int front = 0;//队列首 指向第一个元素  默认值为0
	private int rear = 0;//队列尾 指向队列最后一个元素的后一个位置
	private Object[] array;

	public ringArray() {
		array = new Object[maxsize];
	}

	public ringArray(int maxsize) {
		this.maxsize = maxsize;
		array = new Object[maxsize];
	}

	// 添加元素
	public boolean add(Object o) {
		if ((rear + 1) % maxsize == front) {
			System.out.println("队列已满");
			return false;
		} else {
			array[rear] = o;

			rear = (rear + 1) % maxsize;
			return true;
		}
	}

	public Object get() {
		if (front == rear) {
			
			return "空队列";
		} else {
			Object temp = array[front];
			front = (front + 1) % maxsize;
			return temp;

		}
	}

	public boolean isEmpty() {
		if(front==rear) {
			System.out.println("空队列");
		}
		else {
			System.out.println("队列非空");
		}
		return front == rear;
	}

	public int length() {
		
		return (rear + maxsize - front) % maxsize;
	}

	public void show() {
		if (front == rear) {
			System.out.println("空队列");
		} else {
			for (int i = front; i <= this.length(); i++) {
				System.out.println(array[(i) % maxsize]);

			}
		}
	}
}
