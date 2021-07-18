package 算法与数据结构;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class 数组队列test1 {
	public static void main(String[] args) {
		boolean tf=true;
		String choose;
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个整数  代表你队列的长度");
		 size=sc.nextInt();
		 Array1 arr=new Array1(size);
		 System.out.println("请输入一个字母代表你的操作");
			System.out.println("a为增加元素\n g为取出元素\n s为打印所有元素\n e为退出程序");
		
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
			default :System.out.println("无效操作");
			break;
		}
		}
		System.out.println("程序退出成功");
}
}


class Array1{
	int front=0;
	int head = -1;
	int size = 10;
	ArrayList array;

	public Array1(int size) {
		this.size = size;
		array = new ArrayList();
	}

	public Array1() {
	}

	public boolean add(Object o) {
		if (head < size) {
			array.add(o);
			head++;
			return true;
		} else {
			System.out.println("队列已满");
			return false;

		}

	}
	
	public Object get() {
		if(head>=0&&front<size) {
			Object o=array.get(front);
			front++;
			return o;
		}else if(head<0){
			System.out.println("队列为空");
			return null;
		}else {
			System.out.println("队列取完了");
			return null;
		}
		
	}
	
	public void show() {
		if(head==-1){
			System.out.println("队列为空，没有元素");
		}else
		{
			Iterator it=array.iterator();
		while(it.hasNext()) {
			Object o=it.next();
			System.out.println(o);
		}
		
		}
	}

}
