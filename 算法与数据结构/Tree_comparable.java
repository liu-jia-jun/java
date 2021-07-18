package javatest01;

import java.util.*;
//ʵ�ֶ������еıȽ���  ���Զ������͵����ݽ����������ַ�����ʵ�ֲ�ͬ�Ľӿڣ�
public class Tree_comparable {
	public static void main(String[] args) {
		
		/*
		 * ʵ����Comparable�ӿڣ�
		 * ����д��comparableto����
		 * */
		TreeSet<Birds> birdtree =new TreeSet<>();
	
		birdtree.add(new Birds(3));
		birdtree.add(new Birds(1));
		birdtree.add(new Birds(8));
		birdtree.add(new Birds(4));
		birdtree.add(new Birds(6));
		
		for(Birds data:birdtree) {
			System.out.println(data);
		}	
		
	//ʵ����Comparator�ӿڣ���д��compare����	
	TreeSet<Cat> cattree=new TreeSet<>(new Comparator<Cat>() {//�����ڲ���  Ҳ����������д

		@Override
		public int compare(Cat o1, Cat o2) {
			// TODO Auto-generated method stub
			return o1.age-o2.age;
		}});
	
//	TreeSet<Cat> catree=new TreeSet<>(new Catcomparator());
//	���ô��εķ�ʽ���������ڲ�������
	
      cattree.add(new Cat(1));
      cattree.add(new Cat(8));
      cattree.add(new Cat(6));
      cattree.add(new Cat(100));
      cattree.add(new Cat(1123));
     
	
	for(Cat data:cattree) {
		System.out.println(data);
	}
	
	}
}




class Birds implements Comparable<Birds>{
	int age;
 Birds(){
		
	}

Birds(int age) {
	this.age=age;
}



@Override
public int compareTo(Birds o) {
	// TODO Auto-generated method stub
	return this.age-o.age;
}

public String toString() {
	return "bird"+"="+this.age;
}

}


class Cat{
	int age;
	Cat(){}
	Cat(int age){
		this.age=age;
	}
	
	public String toString() {
		return "cat"+"="+this.age;
	}
}



class Catcomparator implements Comparator<Cat>{

//������ﲻ���÷�������������ת��
//	�Զ���ıȽ��������ж����ʵ�ֲ�ͬ�ıȽ��߼�  ���ĸ�ֱ�Ӵ��ξ���
	@Override
	public int compare(Cat o1, Cat o2) {
		// TODO Auto-generated method stub
		return o1.age-o2.age;
	}
	
}