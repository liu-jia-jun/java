package �㷨�����ݽṹ;

import java.util.*;

public class ����˳����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean state = true;
		int n;
		int number;
		String name;
		int great;
		String choose;
		
		String temp;
		Link link = new Link();
		Scanner sc = new Scanner(System.in);
		System.out.println("������ĸ  ��ʾ��������Ĳ���");
		System.out.println("aΪ���Ԫ��\nsΪ���չʾ����Ԫ��\ndΪɾ��ָ��Ԫ��\ncΪ��ѯָ��Ԫ��\nchΪ�ı�Ԫ������\neΪ�˳�����");
		while (state) {
			System.out.println("��������ĸ�������س���ʾ�������");
		
			choose = sc.nextLine();
			
			switch (choose) {
			case "a":
				System.out.println("��������ţ�����0��������");
				number = sc.nextInt();
				
				System.out.println("����������");
				name = sc.nextLine();
				temp=sc.next();
				System.out.println("������ɼ�");
				great = sc.nextInt();
			
				link.add(name, number, great);
				System.out.println("��ӳɹ�");
				break;
			case "s":
				link.show();
				break;
			case "d":
				System.out.println("��������Ҫɾ�����ݵ����");
				n = sc.nextInt();
				temp=sc.next();
				link.deleat(n);
				break;
			case "c":
				System.out.println("��������Ҫ��ѯ���ݵ����");
				n = sc.nextInt();
				temp=sc.next();
				link.check(n);
				break;
			case "ch":
				System.out.println("��������Ҫ�޸ĵ����ݵ����");
				n = sc.nextInt();
				temp=sc.next();
				System.out.println("��������ţ�����0��������");
				number = sc.nextInt();
				temp=sc.next();
				System.out.println("����������");
				name = sc.nextLine();
				temp=sc.next();
				System.out.println("������ɼ�");
				great = sc.nextInt();
				temp=sc.next();
				link.change(n, number, name, great);
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

	public void show() {// ��� ��������
		Node temp = head.next;
		if (head.next == null) {
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
				break;

			} else if (temp.next == null) {
				System.out.println("δ�ҵ�����ŵ�Ԫ��");
				break;
			} else {
				temp = temp.next;
			}
		}
	}

}

class Node {
	Node next = null;
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