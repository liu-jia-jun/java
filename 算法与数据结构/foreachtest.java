package javatest01;

import java.util.*;

public class foreachtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList array = new ArrayList();
	for(int i=1;i<=10;i++) {
		array.add(i);
		
	}
	
	//��������array
		
	System.out.println("_____________________________________");
	//��ͨforѭ��
	
	
	for(int i=0;i<10;i++) {
		System.out.println(array.get(i));
		
	}
	System.out.println("_____________________________________");
	
	
	
	//��ǿforѭ��
	for(Object data: array) {
		System.out.println(data);
	}
	System.out.println("_____________________________________");
	
	
	//������ѭ��
	
	Iterator it=array.iterator();
	while(it.hasNext()) {
		Object o=it.next();
		System.out.println(o);
	}
	
	
	System.out.println("_____________________________________");
	}

}
