package javatest01;

import java.util.*;
//实现二叉树中的比较器  将自定义类型的数据进行排序（两种方法，实现不同的接口）
public class Tree_comparable {
	public static void main(String[] args) {
		
		/*
		 * 实现了Comparable接口，
		 * 并重写了comparableto方法
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
		
	//实现了Comparator接口，重写了compare方法	
	TreeSet<Cat> cattree=new TreeSet<>(new Comparator<Cat>() {//匿名内部类  也可以在外面写

		@Override
		public int compare(Cat o1, Cat o2) {
			// TODO Auto-generated method stub
			return o1.age-o2.age;
		}});
	
//	TreeSet<Cat> catree=new TreeSet<>(new Catcomparator());
//	采用传参的方式（与匿名内部类区别）
	
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

//如果这里不采用泛型则会出现类型转换
//	自定义的比较器可以有多个，实现不同的比较逻辑  用哪个直接传参就行
	@Override
	public int compare(Cat o1, Cat o2) {
		// TODO Auto-generated method stub
		return o1.age-o2.age;
	}
	
}