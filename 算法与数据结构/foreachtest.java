package javatest01;

import java.util.*;

public class foreachtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList array = new ArrayList();
	for(int i=1;i<=10;i++) {
		array.add(i);
		
	}
	
	//遍历数组array
		
	System.out.println("_____________________________________");
	//普通for循环
	
	
	for(int i=0;i<10;i++) {
		System.out.println(array.get(i));
		
	}
	System.out.println("_____________________________________");
	
	
	
	//增强for循环
	for(Object data: array) {
		System.out.println(data);
	}
	System.out.println("_____________________________________");
	
	
	//迭代器循环
	
	Iterator it=array.iterator();
	while(it.hasNext()) {
		Object o=it.next();
		System.out.println(o);
	}
	
	
	System.out.println("_____________________________________");
	}

}
