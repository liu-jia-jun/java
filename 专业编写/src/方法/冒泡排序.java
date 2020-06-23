package 方法;

import java.util.Scanner;

public class 冒泡排序 {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int number,temp=0;
		System.out.println("请输入你数组的长度");
		number=in.nextInt();
		
    int[] a= new int[number];
    for(int i=0;i<a.length;i++) {
    	System.out.println("请输入第"+(i+1)+"个数");
    	a[i]=in.nextInt();
    }
    System.out.println("结果为：");
	

	for(int i=a.length-1;i>0;i--) {
		for(int j=0;j<i;j++) {
			if(a[j]>a[j+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	
	}
}
