package �㷨�����ݽṹ;

import java.util.*;

public class ����������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean tf=true;
		String choose;
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("����һ������  ��������еĳ���");
		 size=sc.nextInt();
		 ringArray arr=new ringArray(size);
		 System.out.println("������һ����ĸ������Ĳ���");
			System.out.println("aΪ����Ԫ��\n gΪȡ��Ԫ��\n sΪ��ӡ����Ԫ��\n iΪ�ж϶����Ƿ�Ϊ��\n lΪ���ض�����ЧԪ�ظ���\n eΪ�˳�����");
		
		while(tf) {
			
			choose=sc.next();
			switch(choose) {
			case "a":
				String data;
				System.out.println("��������Ҫ���������");
				data=sc.next();
				;
				if(arr.add(data)) {
					System.out.println("��ӳɹ�");
				}else {
					System.out.println("���ʧ��");
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
			default :System.out.println("��Ч����");
			break;
		}
		}
		System.out.println("�����˳��ɹ�");
		

	}

}

class ringArray {
	private int maxsize = 10;
	private int front = 0;
	private int rear = 0;
	private Object[] array;

	public ringArray() {
		array = new Object[maxsize];
	}

	public ringArray(int maxsize) {
		this.maxsize = maxsize;
		array = new Object[maxsize];
	}

	// ���Ԫ��
	public boolean add(Object o) {
		if ((rear + 1) % maxsize == front) {
			System.out.println("��������");
			return false;
		} else {
			array[rear] = o;

			rear = (rear + 1) % maxsize;
			return true;
		}
	}

	public Object get() {
		if (front == rear) {
			
			return "�ն���";
		} else {
			Object temp = array[front];
			front = (front + 1) % maxsize;
			return temp;

		}
	}

	public boolean isEmpty() {
		if(front==rear) {
			System.out.println("�ն���");
		}
		else {
			System.out.println("���зǿ�");
		}
		return front == rear;
	}

	public int length() {
		
		return (rear + maxsize - front) % maxsize;
	}

	public void show() {
		if (front == rear) {
			System.out.println("�ն���");
		} else {
			for (int i = front; i <= this.length(); i++) {
				System.out.println(array[(i) % maxsize]);

			}
		}
	}
}