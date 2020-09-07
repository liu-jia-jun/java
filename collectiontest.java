package javatest01;

import java.util.*;
public class collectiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
		c.add(1);//添加元素
		c.add("刘佳俊");
		c.add("abc");
		
		System.out.println(c.size());
		//c.size()获取该集合元素的个数
		
		c.clear();
		//清空该集合中的全部元素

		c.add("刘佳俊");
		c.add("love");
		c.add(new Object());
		c.add("123");
		
		System.out.println(c.contains("love"));
		
		//c.contains( object ) 判断该集合是否包含该元素返回布尔型
		
		System.out.println(c.isEmpty());
		
		//c.isEmpty() 判断集合个数是否为0个 返回布尔型
		
		Iterator it =c.iterator();
		
		//获得集合c的迭代器
		
		System.out.println(it.hasNext());
		
		// it.hasNext() 判断集合中是否还存在元素  返回布尔型
		 
		System.out.println(it.next());
		//it.next() 使迭代器前进一位并返回指向的元素 
		
		
		
		//遍历集合
	for(int i=1;i<c.size();i++) {
		//i从1开始是因为前面迭代器前进了一位
		System.out.println(it.next());
	}
		
		Iterator it2=c.iterator();//集合c的第二个迭代器
		
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
	}

}
