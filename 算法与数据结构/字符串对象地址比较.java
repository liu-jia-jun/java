package javatest01;
import java.util.*;
public class �ַ��������ַ�Ƚ� {
	public static void main(String[] args) {
		String s1="abc";
		String s3="abc";
		
//s2Ϊnew�������¶���   s1��s3Ϊ��ͬ�ڴ��ַָ��ͬһ���ַ����������е�ͬһ������
		
		String s2=new String("abc");
		
		
		
		System.out.println(s2);
		
		if(s1==s2) {
			System.out.println("common");
		}else {
			System.out.println("no common");
		}//��ͬ
		
		if(s1==s3) {
			System.out.println("common");
		}else {
			System.out.println("no common");
		}//��ͬ
		
		
		if(s1.equals(s2)) {
			System.out.println("common");
		}else {
			System.out.println("no common");
		}//��ͬ
		
		
}
}




