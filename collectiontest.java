package javatest01;

import java.util.*;
public class collectiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
		c.add(1);//���Ԫ��
		c.add("���ѿ�");
		c.add("abc");
		
		System.out.println(c.size());
		//c.size()��ȡ�ü���Ԫ�صĸ���
		
		c.clear();
		//��ոü����е�ȫ��Ԫ��

		c.add("���ѿ�");
		c.add("love");
		c.add(new Object());
		c.add("123");
		
		System.out.println(c.contains("love"));
		
		//c.contains( object ) �жϸü����Ƿ������Ԫ�ط��ز�����
		
		System.out.println(c.isEmpty());
		
		//c.isEmpty() �жϼ��ϸ����Ƿ�Ϊ0�� ���ز�����
		
		Iterator it =c.iterator();
		
		//��ü���c�ĵ�����
		
		System.out.println(it.hasNext());
		
		// it.hasNext() �жϼ������Ƿ񻹴���Ԫ��  ���ز�����
		 
		System.out.println(it.next());
		//it.next() ʹ������ǰ��һλ������ָ���Ԫ�� 
		
		
		
		//��������
	for(int i=1;i<c.size();i++) {
		//i��1��ʼ����Ϊǰ�������ǰ����һλ
		System.out.println(it.next());
	}
		
		Iterator it2=c.iterator();//����c�ĵڶ���������
		
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
	}

}
