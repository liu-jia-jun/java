package javatest01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList������ע�� {
public void main(String[] args) {

	ArrayList a1=new ArrayList();
	a1.add("love");
	
	System.out.println(a1.add("world"));//ArrayList���Ԫ�ط��ز������ͳɹ�Ϊtrue
	
	//����a1�����Ԫ��
	for (int i = 0; i < 11; i++) {
		a1.add(i);
		
	}
	
//	��������
	
	for(int i=0;i<a1.size();i++) {//a1.size() ��ȡ����Ԫ�ص����������ܷ�������
		System.out.println(a1.get(i));
		
		//a1.get(int index)   ��ȡArrayList��ĳ���±��Ԫ��   index���±����˼
		
	}
	
	//��������
	
	Iterator it1 =a1.iterator();
	
	//���ϵĵ���������   �������ڼ���Ԫ�ؽṹ�������ı�ʱҪ��ʱ����  �������������ָ��ԭ���ļ���

	while(it1.hasNext()) {
		Object o=it1.next();
		System.out.println(o);
	}
	
//	ע��ArrayList�ڶ���ʱ��һ�������飬����ӵ�һ��Ԫ��֮��ArrayList��������ʼ��Ϊ10
	
	a1.clear();//���Ԫ��
a1.add("�����");
Iterator it2 =a1.iterator();//�������Ԫ��ԭ���ĵ�����������
	while(it2.hasNext()) {
		Object o1=it2.next();
		System.out.println(o1);
	}
}
}
