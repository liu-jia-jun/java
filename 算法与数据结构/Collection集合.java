package javatest01;

import java.util.*;

/*
List��Set����ʵ����Collection�ӿ� 
ʵ����Collection�ӿڵľ���Iterate��������������

List���ϣ�ArrayList��LinkedList
 
Set���ϣ�HashSet,TreeSet

Map���ϣ�HashMap��TreeMap
 
 */






public class Collection����{
	public static void main(String[] args) {
	
	treemap.test();
		
	}
}



class arraylist{
	
	/*
	 
	 �������飬���±꣬���򣬿��ظ�
	 
	 Ĭ�ϳ�ʼ����Ϊ10��ÿ���������ӵ�����һ��������70%
	 
	 */
	
	 static void test() {
		//��������
		ArrayList<node> array=new ArrayList<>();
		
		//��ֵ
		array.add(new node(5));
		array.add(new node(5));
		array.add(new node(7));
		array.add(new node(2));

		//ȡֵ
		
		System.out.println("array�ĵ�һ��Ԫ���ǣ�"+array.get(0));
	  
		//����
		
		System.out.println("��ͨforѭ��");
		for(int i=0;i<array.size();i++) {
			System.out.println(array.get(i));
		}
		System.out.println("��ǿforѭ��");
		for(node data:array) {
			System.out.println(data);
		}
		
		System.out.println("����������");
		Iterator<node> it=array.iterator();	
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
}

class linkedlist{
	/*
	 ��������ṹ��������ظ�
	 */
	
	static void test() {
		//��������
		LinkedList<node> link=new LinkedList<>();
		//��ֵ
		link.add(new node(5));
		link.add(new node(5));
		link.add(new node(7));
		link.add(new node(2));
		//ȡֵ
		System.out.println("link�ĵ�һ��Ԫ����"+link.get(0));
		//����
		System.out.println("��ͨforѭ��");
		for(int i=0;i<link.size();i++) {
			System.out.println(link.get(i));
		}
		System.out.println("��ǿforѭ��");
		for(node data:link) {
			System.out.println(data);
		}
		
		System.out.println("����������");
		Iterator<node> it=link.iterator();	
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

class hashset{
	/*
	 ���򣬲����ظ�
	 */
	
	
	static void test() {
		//��������
		HashSet<node> hs=new HashSet<node>();
			//��ֵ
			
		hs.add(new node(5));
		hs.add(new node(5));
		hs.add(new node(7));
		hs.add(new node(2));
		
		
		//����
		System.out.println("��ͨforѭ��");
		 
		System.out.println("��ǿforѭ��");
		for(node data:hs) {
			System.out.println(data);
		}
		
		System.out.println("����������");
		Iterator<node> it=hs.iterator();	
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			 
	}
	
}

class treeset{
	 static void test() {
		//��������
		 TreeSet<node> treeset=new TreeSet<>();
			//��ֵ
			treeset.add(new node(5));
			treeset.add(new node(5));
			treeset.add(new node(7));
			treeset.add(new node(2));
			//ȡֵ
			
			//����
			System.out.println("��ͨforѭ��");
			 
			System.out.println("��ǿforѭ��");
			for(node data:treeset) {
				System.out.println(data);
			}
			
			System.out.println("����������");
			Iterator<node> it=treeset.iterator();	
			while(it.hasNext()) {
				System.out.println(it.next());
			}
	 }
}


class hashmap{
	
	 static void test() {
		//��������
		Map<Integer,String> hm=new HashMap<>();
		
			//��ֵ

		hm.put(1,"a");
		hm.put(2,"b");
		hm.put(2,"a");
		hm.put(8,"adf");
		hm.put(4,"love");
		
		
			//ȡֵ   ȡ��value
			System.out.println("ȡ��ֵΪ��"+hm.get(1));
			//����
			
			//�õ�map�����е�key����  ͨ��key�õ�value
			
			Set<Integer> set1=hm.keySet();
			
			for(Integer data:set1) {
				System.out.println(data+"="+hm.get(data));
			}
			
			
			
			//��map����ת����set����
			Set<Map.Entry<Integer, String>> set =hm.entrySet();
			for(Map.Entry<Integer, String> data:set) {
				System.out.println(data);
			}
			System.out.println("����������");
			Iterator<Map.Entry<Integer, String>> it =set.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
	 
	 }
}

class treemap{
	
	 static void test() {
		//��������
		 Map<Integer,String> treemap=new TreeMap<>();
		 
			
			//��ֵ
			
		 treemap.put(10, "a");
		 treemap.put(1, "b");
		 treemap.put(9, "c");
		 treemap.put(4, "d");
		 treemap.put(8, "e");
		 treemap.put(1, "f");
		 
			//ȡֵ
		 System.out.println("ȡ��ֵΪ��"+treemap.get(1));
		 
		 
		 
			//����
			//��map����ת����set����
		 Set<Integer> set1=treemap.keySet();
			
			for(Integer data:set1) {
				System.out.println(data+"="+treemap.get(data));
			}
			
			
			//��map����ת����set����
			Set<Map.Entry<Integer, String>> set =treemap.entrySet();
			for(Map.Entry<Integer, String> data:set) {
				System.out.println(data);
			}
			System.out.println("����������");
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