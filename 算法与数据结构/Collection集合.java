package javatest01;

import java.util.*;

/*
List与Set集合实现了Collection接口 
实现了Collection接口的具有Iterate方法（迭代器）

List集合：ArrayList，LinkedList
 
Set集合：HashSet,TreeSet

Map集合：HashMap，TreeMap
 
 */






public class Collection集合{
	public static void main(String[] args) {
	
	treemap.test();
		
	}
}



class arraylist{
	
	/*
	 
	 有限数组，有下标，有序，可重复
	 
	 默认初始容量为10，每次扩容增加的是上一次容量的70%
	 
	 */
	
	 static void test() {
		//创建对象
		ArrayList<node> array=new ArrayList<>();
		
		//存值
		array.add(new node(5));
		array.add(new node(5));
		array.add(new node(7));
		array.add(new node(2));

		//取值
		
		System.out.println("array的第一个元素是："+array.get(0));
	  
		//遍历
		
		System.out.println("普通for循环");
		for(int i=0;i<array.size();i++) {
			System.out.println(array.get(i));
		}
		System.out.println("增强for循环");
		for(node data:array) {
			System.out.println(data);
		}
		
		System.out.println("迭代器遍历");
		Iterator<node> it=array.iterator();	
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
}

class linkedlist{
	/*
	 无限链表结构，有序可重复
	 */
	
	static void test() {
		//创建对象
		LinkedList<node> link=new LinkedList<>();
		//存值
		link.add(new node(5));
		link.add(new node(5));
		link.add(new node(7));
		link.add(new node(2));
		//取值
		System.out.println("link的第一个元素是"+link.get(0));
		//遍历
		System.out.println("普通for循环");
		for(int i=0;i<link.size();i++) {
			System.out.println(link.get(i));
		}
		System.out.println("增强for循环");
		for(node data:link) {
			System.out.println(data);
		}
		
		System.out.println("迭代器遍历");
		Iterator<node> it=link.iterator();	
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

class hashset{
	/*
	 无序，不可重复
	 */
	
	
	static void test() {
		//创建对象
		HashSet<node> hs=new HashSet<node>();
			//存值
			
		hs.add(new node(5));
		hs.add(new node(5));
		hs.add(new node(7));
		hs.add(new node(2));
		
		
		//遍历
		System.out.println("普通for循环");
		 
		System.out.println("增强for循环");
		for(node data:hs) {
			System.out.println(data);
		}
		
		System.out.println("迭代器遍历");
		Iterator<node> it=hs.iterator();	
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			 
	}
	
}

class treeset{
	 static void test() {
		//创建对象
		 TreeSet<node> treeset=new TreeSet<>();
			//存值
			treeset.add(new node(5));
			treeset.add(new node(5));
			treeset.add(new node(7));
			treeset.add(new node(2));
			//取值
			
			//遍历
			System.out.println("普通for循环");
			 
			System.out.println("增强for循环");
			for(node data:treeset) {
				System.out.println(data);
			}
			
			System.out.println("迭代器遍历");
			Iterator<node> it=treeset.iterator();	
			while(it.hasNext()) {
				System.out.println(it.next());
			}
	 }
}


class hashmap{
	
	 static void test() {
		//创建对象
		Map<Integer,String> hm=new HashMap<>();
		
			//存值

		hm.put(1,"a");
		hm.put(2,"b");
		hm.put(2,"a");
		hm.put(8,"adf");
		hm.put(4,"love");
		
		
			//取值   取出value
			System.out.println("取得值为："+hm.get(1));
			//遍历
			
			//得到map集合中的key部分  通过key得到value
			
			Set<Integer> set1=hm.keySet();
			
			for(Integer data:set1) {
				System.out.println(data+"="+hm.get(data));
			}
			
			
			
			//将map集合转换成set集合
			Set<Map.Entry<Integer, String>> set =hm.entrySet();
			for(Map.Entry<Integer, String> data:set) {
				System.out.println(data);
			}
			System.out.println("迭代器遍历");
			Iterator<Map.Entry<Integer, String>> it =set.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
	 
	 }
}

class treemap{
	
	 static void test() {
		//创建对象
		 Map<Integer,String> treemap=new TreeMap<>();
		 
			
			//存值
			
		 treemap.put(10, "a");
		 treemap.put(1, "b");
		 treemap.put(9, "c");
		 treemap.put(4, "d");
		 treemap.put(8, "e");
		 treemap.put(1, "f");
		 
			//取值
		 System.out.println("取得值为："+treemap.get(1));
		 
		 
		 
			//遍历
			//将map集合转换成set集合
		 Set<Integer> set1=treemap.keySet();
			
			for(Integer data:set1) {
				System.out.println(data+"="+treemap.get(data));
			}
			
			
			//将map集合转换成set集合
			Set<Map.Entry<Integer, String>> set =treemap.entrySet();
			for(Map.Entry<Integer, String> data:set) {
				System.out.println(data);
			}
			System.out.println("迭代器遍历");
			Iterator<Map.Entry<Integer, String>> it =set.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
	 }
}


class node{
	
	
	int number;
	
	node() {}
	node(int number){
		this.number=number;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		node other = (node) obj;
		return number == other.number;
	}
	@Override
	public String toString() {
		return "node [number=" + number + "]";
	}
}