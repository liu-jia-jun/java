package javatest01;
//赋值详解
public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=i;
		j=1;
		System.out.println(i);
		
		String str ="null";
		String str1=str;
		str1="not null";
		
		System.out.println(str);
		
		A a=new A();
		a.str="kong";
		A a1;
		a1=a;
		a1.str="no null";
		System.out.print(a.str);
	/* 
	 * 1.基本数据类型属于值传递  不会影响其他变量的值
	 * 2.引用数据类型属于地址传递  底层指向的是同一个对象
	 * 3.但是String类型的是引用数据类型，但是String类型不会影响其他变量的值
	 * 因为String类型的数据类型指向的是字符串常量池
	 */
	}

}

class A{
	String str;
	
}