package 算法与数据结构;

import java.util.*;

public class 单链表实现 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.test();
		
	}
}


/*出现的问题：nextLine() 无法正常输入值
 * 
 * 
 * 原因：nextLine() 只将enter（回车键）作为结束符
 * 
 * 		next的其他方法将空格键，Tab键，Enter键作为结束符
 * 
 * 		next方法的结束符会被在后面的nextLine()方法吸收   导致nextLine() 无法正常输入值
 * 
 * 注： nextLine()不要和next的其他方法一起用尤其是不要将nextLine()放在next的方法后面
 * 
 *      next->  nextInt() next()  nextDouble()  nextFloat()
 *      
 * 解决方法：
 * 		1.不使用nextLine()方法  用next()方法代替
 * 
 * 		2.在每个nextInt()  nextDouble()  next()  等方法后面添加nextLine()语句  来吸收其他方法多余的enter键
 * 
 */

class Test {

	public static void test() {
		boolean state = true;
		int n;
		int number;
		String name = null;
		int great = 0;
		String choose;

		Link link = new Link();
		Scanner sc = new Scanner(System.in);
		System.out.println("输入字母  表示你接下来的操作");
		System.out.println("a为顺序添加元素\ns为输出展示所以元素\nd为删除指定元素\nc为查询指定元素\nch为改变元素内容\nab为按序添加\ng为返回元素个数e为退出程序");
		while (state) {
			System.out.println("请输入字母操作，回车表示输入完成");
			choose = sc.next();
			
			switch (choose) {
			case "a":
				System.out.println("请输入序号，大于0的正整数");
				number = sc.nextInt();
				

				System.out.println("请输入成绩");
				
					great = sc.nextInt();

				System.out.println("请输入姓名");
				
					name = sc.next();

				link.add(name, number, great);
				System.out.println("添加成功");
				break;
			case "s":
				link.show();
				break;
			case "d":
				System.out.println("请输入你要删除数据的序号");
				n = sc.nextInt();

				link.deleat(n);
				break;
			case "c":
				System.out.println("请输入你要查询数据的序号");
				n = sc.nextInt();

				link.check(n);
				break;
			case "ch":
				System.out.println("请输入你要修改的数据的序号");
				n = sc.nextInt();

				System.out.println("请输入序号，大于0的正整数");
				number = sc.nextInt();

				System.out.println("请输入姓名");
				name = sc.next();

				System.out.println("请输入成绩");
				great = sc.nextInt();

				link.change(n, number, name, great);
				break;
			case "ab":
				System.out.println("请输入序号，大于0的正整数");
				number = sc.nextInt();

				System.out.println("请输入姓名");
				name = sc.next();

				System.out.println("请输入成绩");
				great = sc.nextInt();

				link.addBy(name, number, great);
				System.out.println("添加成功");
				break;
			case "g":
				System.out.println(link.getlength());
				break;
			case "e":
				state = false;
				break;
			default:
				System.out.println("无效操作");
				break;
			}

		}
		System.out.println("程序退出成功");
	}

}

class Link {
	Node head;

	public int getlength() {// 返回链表长度 除头节点外
		Node temp = head;
		int size = 0;
		while (true) {

			if (temp.next == null) {
				break;
			} else {
				size++;
				temp = temp.next;
			}
		}

		System.out.println("该链表的长度为：" + size);
		return size;
	}

	public Link() {
		head = new Node();
	}

	public void add(String name, int number, int great) {// 增 增加链表元素
		Node temp = head;
		while (true) {
			if (temp.next == null) {
				temp.next = new Node(name, number, great);
				break;

			} else {
				temp = temp.next;
			}
		}

	}

	public void addBy(String name, int number, int great) {
		// 按序添加
		Node temp = head;
		boolean flag = false;
		while (true) {
			if (temp.next == null) {

				break;
			} else if (temp.next.number > number) { // 用temp的后一个元素来比较如果大于number 就表示找到了
				// 位置找到
				break;
			} else if (temp.next.number == number) {
				flag = true;
				break;
			} else {
				temp = temp.next;
			}
		}
		if (flag) {
			System.out.println("该序号已有");
		} else {
			Node newnode = new Node(name, number, great);
			newnode.next = temp.next;
			temp.next = newnode;

		}

	}

	public void show() {// 输出 遍历链表
		Node temp = head.next;
		if (temp == null) {
			System.out.println("该链表为空 没有元素");
			return;
		}
		while (true) {
			if (temp == null) {
				break;
			} else {
				System.out.println(temp);
				temp = temp.next;
			}
		}

	}

	public void deleat(int n) {// 删 删除指定元素
		Node temp;
		temp = head;
		while (true) {
			if (n < 1) {
				System.out.println("删除有误 输入序号需要为大于0 的正整数");
				break;
			}

			if (temp.next.number == n) {
				temp.next = temp.next.next;
				System.out.println("删除成功");
				break;
			} else if (temp.next.next == null) {
				System.out.println("删除失败，未找到该元素");
				break;
			} else {
				temp = temp.next;
			}
		}
	}

	public void check(int n) {
		if (n < 1) {
			System.out.println("查询输入有误，请输入大于0的整数");
			return;
		}
		Node temp;
		temp = head;
		while (true) {
			if (temp.number == n) {
				System.out.println(temp);
				break;
			} else if (temp.next == null) {
				System.out.println("未找到该序号的元素");
				break;
			} else {
				temp = temp.next;
			}
		}

	}

	public void change(int n, int number, String name, int great) {
		Node temp;
		temp = head.next;
		if (n < 1) {
			System.out.println("改动输入有误，请输入大于0的正整数");
			return;
		}
		while (true) {

			if (temp.number == n) {
				temp.number = number;
				temp.great = great;
				temp.name = name;
				return;

			} else if (temp.next == null) {
				System.out.println("未找到该序号的元素");
				return;
			} else {
				temp = temp.next;
			}
		}
	}

	public Node checklast(int n) {// 查到倒数第n个元素

		Node temp = head.next;
		if (n <= 0 || n > this.getlength()) {
			System.out.println("查询有误");
			return null;
		}

		int size = this.getlength() - n + 1;
		while (true) {
			if (temp == null) {
				System.out.println("未找到");
				return null;
			} else {
				size--;
				if (size == 0) {
					break;
				} else {
					temp = temp.next;
				}
			}

		}
		System.out.println(temp);
		return temp;
	}

//链表的反转  头插法
	public void rever() {
		Node temp = head.next;
		Node temp1 = new Node();
		Node temp2;
		if (temp == null || temp.next == null) {

			return;
		}

		while (temp != null) {
			// 这里直接操作temp之后再运行temp=temp2；将temp准确的带回到原来的链表
			temp2 = temp.next;

			temp.next = temp1.next;
			temp1.next = temp;
			temp = temp2;
			/*
			 * 
			 * 这里将temp赋给temp2 是地址传递 之后的操作都会影响原来的单链表 之后链表就会只有一个有效节点和一个头节点 所以说这个操作是错误的
			 * temp2=temp; temp2.next=temp1.next; temp1.next=temp2; temp=temp.next;
			 */
		}

		this.head.next = temp1.next;

	}

	// 逆序打印链表不改变链表结构
	public void endput1() {
		// 数组实现
		Node[] nodes = new Node[this.getlength()];
		Node temp = head.next;
		for (int i = 0; i < this.getlength(); i++) {
			if (temp != null) {
				nodes[i] = temp;
				temp = temp.next;
			}
		}
		for (int i = nodes.length - 1; i >= 0; i--) {
			System.out.println(nodes[i]);
		}

	}

	public void endput2() {
		// 压栈实现
		Stack<Node> nodes = new Stack();
		Node temp = head.next;
		while (temp != null) {
			nodes.add(temp);
			temp = temp.next;
		}

		while (nodes.size() > 0) {
			System.out.println(nodes.pop());
		}
	}
}

class Node {
	Node next = null;
	Node pre = null;

	String name = null;
	int number = 0;
	int great = 0;

	public Node() {

	}

	public Node(String name, int number, int great) {
		this.great = great;
		this.name = name;
		this.number = number;
	}

	public String toString() {
		return "学号：" + this.number + "姓名：" + this.name + "成绩：" + this.great;

	}
}

 