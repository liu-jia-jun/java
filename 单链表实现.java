package �㷨�����ݽṹ;

import java.util.*;

public class ������ʵ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.test();
		
	}
}


/*���ֵ����⣺nextLine() �޷���������ֵ
 * 
 * 
 * ԭ��nextLine() ֻ��enter���س�������Ϊ������
 * 
 * 		next�������������ո����Tab����Enter����Ϊ������
 * 
 * 		next�����Ľ������ᱻ�ں����nextLine()��������   ����nextLine() �޷���������ֵ
 * 
 * ע�� nextLine()��Ҫ��next����������һ���������ǲ�Ҫ��nextLine()����next�ķ�������
 * 
 *      next->  nextInt() next()  nextDouble()  nextFloat()
 *      
 * ���������
 * 		1.��ʹ��nextLine()����  ��next()��������
 * 
 * 		2.��ÿ��nextInt()  nextDouble()  next()  �ȷ����������nextLine()���  �������������������enter��
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
		System.out.println("������ĸ  ��ʾ��������Ĳ���");
		System.out.println("aΪ˳�����Ԫ��\nsΪ���չʾ����Ԫ��\ndΪɾ��ָ��Ԫ��\ncΪ��ѯָ��Ԫ��\nchΪ�ı�Ԫ������\nabΪ�������\ngΪ����Ԫ�ظ���eΪ�˳�����");
		while (state) {
			System.out.println("��������ĸ�������س���ʾ�������");
			choose = sc.next();
			
			switch (choose) {
			case "a":
				System.out.println("��������ţ�����0��������");
				number = sc.nextInt();
				

				System.out.println("������ɼ�");
				
					great = sc.nextInt();

				System.out.println("����������");
				
					name = sc.next();

				link.add(name, number, great);
				System.out.println("��ӳɹ�");
				break;
			case "s":
				link.show();
				break;
			case "d":
				System.out.println("��������Ҫɾ�����ݵ����");
				n = sc.nextInt();

				link.deleat(n);
				break;
			case "c":
				System.out.println("��������Ҫ��ѯ���ݵ����");
				n = sc.nextInt();

				link.check(n);
				break;
			case "ch":
				System.out.println("��������Ҫ�޸ĵ����ݵ����");
				n = sc.nextInt();

				System.out.println("��������ţ�����0��������");
				number = sc.nextInt();

				System.out.println("����������");
				name = sc.next();

				System.out.println("������ɼ�");
				great = sc.nextInt();

				link.change(n, number, name, great);
				break;
			case "ab":
				System.out.println("��������ţ�����0��������");
				number = sc.nextInt();

				System.out.println("����������");
				name = sc.next();

				System.out.println("������ɼ�");
				great = sc.nextInt();

				link.addBy(name, number, great);
				System.out.println("��ӳɹ�");
				break;
			case "g":
				System.out.println(link.getlength());
				break;
			case "e":
				state = false;
				break;
			default:
				System.out.println("��Ч����");
				break;
			}

		}
		System.out.println("�����˳��ɹ�");
	}

}

class Link {
	Node head;

	public int getlength() {// ���������� ��ͷ�ڵ���
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

		System.out.println("������ĳ���Ϊ��" + size);
		return size;
	}

	public Link() {
		head = new Node();
	}

	public void add(String name, int number, int great) {// �� ��������Ԫ��
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
		// �������
		Node temp = head;
		boolean flag = false;
		while (true) {
			if (temp.next == null) {

				break;
			} else if (temp.next.number > number) { // ��temp�ĺ�һ��Ԫ�����Ƚ��������number �ͱ�ʾ�ҵ���
				// λ���ҵ�
				break;
			} else if (temp.next.number == number) {
				flag = true;
				break;
			} else {
				temp = temp.next;
			}
		}
		if (flag) {
			System.out.println("���������");
		} else {
			Node newnode = new Node(name, number, great);
			newnode.next = temp.next;
			temp.next = newnode;

		}

	}

	public void show() {// ��� ��������
		Node temp = head.next;
		if (temp == null) {
			System.out.println("������Ϊ�� û��Ԫ��");
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

	public void deleat(int n) {// ɾ ɾ��ָ��Ԫ��
		Node temp;
		temp = head;
		while (true) {
			if (n < 1) {
				System.out.println("ɾ������ ���������ҪΪ����0 ��������");
				break;
			}

			if (temp.next.number == n) {
				temp.next = temp.next.next;
				System.out.println("ɾ���ɹ�");
				break;
			} else if (temp.next.next == null) {
				System.out.println("ɾ��ʧ�ܣ�δ�ҵ���Ԫ��");
				break;
			} else {
				temp = temp.next;
			}
		}
	}

	public void check(int n) {
		if (n < 1) {
			System.out.println("��ѯ�����������������0������");
			return;
		}
		Node temp;
		temp = head;
		while (true) {
			if (temp.number == n) {
				System.out.println(temp);
				break;
			} else if (temp.next == null) {
				System.out.println("δ�ҵ�����ŵ�Ԫ��");
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
			System.out.println("�Ķ������������������0��������");
			return;
		}
		while (true) {

			if (temp.number == n) {
				temp.number = number;
				temp.great = great;
				temp.name = name;
				return;

			} else if (temp.next == null) {
				System.out.println("δ�ҵ�����ŵ�Ԫ��");
				return;
			} else {
				temp = temp.next;
			}
		}
	}

	public Node checklast(int n) {// �鵽������n��Ԫ��

		Node temp = head.next;
		if (n <= 0 || n > this.getlength()) {
			System.out.println("��ѯ����");
			return null;
		}

		int size = this.getlength() - n + 1;
		while (true) {
			if (temp == null) {
				System.out.println("δ�ҵ�");
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

//����ķ�ת  ͷ�巨
	public void rever() {
		Node temp = head.next;
		Node temp1 = new Node();
		Node temp2;
		if (temp == null || temp.next == null) {

			return;
		}

		while (temp != null) {
			// ����ֱ�Ӳ���temp֮��������temp=temp2����temp׼ȷ�Ĵ��ص�ԭ��������
			temp2 = temp.next;

			temp.next = temp1.next;
			temp1.next = temp;
			temp = temp2;
			/*
			 * 
			 * ���ｫtemp����temp2 �ǵ�ַ���� ֮��Ĳ�������Ӱ��ԭ���ĵ����� ֮������ͻ�ֻ��һ����Ч�ڵ��һ��ͷ�ڵ� ����˵��������Ǵ����
			 * temp2=temp; temp2.next=temp1.next; temp1.next=temp2; temp=temp.next;
			 */
		}

		this.head.next = temp1.next;

	}

	// �����ӡ�����ı�����ṹ
	public void endput1() {
		// ����ʵ��
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
		// ѹջʵ��
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
		return "ѧ�ţ�" + this.number + "������" + this.name + "�ɼ���" + this.great;

	}
}

 