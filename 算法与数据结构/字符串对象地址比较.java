package javatest01;
import java.util.*;
public class 字符串对象地址比较 {
	public static void main(String[] args) {
		String s1="abc";
		String s3="abc";
		
//s2为new出来的新对象   s1，s3为不同内存地址指向同一个字符串常量池中的同一个对象
		
		String s2=new String("abc");
		
		
		
		System.out.println(s2);
		
		if(s1==s2) {
			System.out.println("common");
		}else {
			System.out.println("no common");
		}//不同
		
		if(s1==s3) {
			System.out.println("common");
		}else {
			System.out.println("no common");
		}//相同
		
		
		if(s1.equals(s2)) {
			System.out.println("common");
		}else {
			System.out.println("no common");
		}//相同
		
		
}
}




