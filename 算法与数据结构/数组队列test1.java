package �㷨�����ݽṹ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class �������test1 {
	public static void main(String[] args) {
		boolean tf=true;
		String choose;
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("����һ������  ��������еĳ���");
		 size=sc.nextInt();
		 Array1 arr=new Array1(size);
		 System.out.println("������һ����ĸ������Ĳ���");
			System.out.println("aΪ����Ԫ��\n gΪȡ��Ԫ��\n sΪ��ӡ����Ԫ��\n eΪ�˳�����");
		
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
			default :System.out.println("��Ч����");
			break;
		}
		}
		System.out.println("�����˳��ɹ�");
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
			System.out.println("��������");
			return false;

		}

	}
	
	public Object get() {
		if(head>=0&&front<size) {
			Object o=array.get(front);
			front++;
			return o;
		}else if(head<0){
			System.out.println("����Ϊ��");
			return null;
		}else {
			System.out.println("����ȡ����");
			return null;
		}
		
	}
	
	public void show() {
		if(head==-1){
			System.out.println("����Ϊ�գ�û��Ԫ��");
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
