package javatest01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList方法与注释 {
public void main(String[] args) {

	ArrayList a1=new ArrayList();
	a1.add("love");
	
	System.out.println(a1.add("world"));//ArrayList添加元素返回布尔类型成功为true
	
	//集合a1中添加元素
	for (int i = 0; i < 11; i++) {
		a1.add(i);
		
	}
	
//	遍历集合
	
	for(int i=0;i<a1.size();i++) {//a1.size() 获取集合元素的数量，不能返回容量
		System.out.println(a1.get(i));
		
		//a1.get(int index)   获取ArrayList中某个下标的元素   index是下标的意思
		
	}
	
	//遍历集合
	
	Iterator it1 =a1.iterator();
	
	//集合的迭代器对象   迭代器在集合元素结构和数量改变时要及时更新  否则迭代器依旧指向原来的集合

	while(it1.hasNext()) {
		Object o=it1.next();
		System.out.println(o);
	}
	
//	注：ArrayList在定义时是一个空数组，在添加第一个元素之后ArrayList的容量初始化为10
	
	a1.clear();//清除元素
a1.add("已清除");
Iterator it2 =a1.iterator();//上面清除元素原来的迭代器不可用
	while(it2.hasNext()) {
		Object o1=it2.next();
		System.out.println(o1);
	}
}
}
