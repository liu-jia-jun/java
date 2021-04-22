package 方法;

import java.util.Scanner;

public class 二分法查找 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number;
		System.out.println("请输入你想要的数组的长度");
		number=in.nextInt();
		int[] a =new int[number];
		
		for(int i=0;i<a.length;i++) {
			a[i]=i;
		}
		int first,mind,last,num;
		
		while(true) {
			
		System.out.println("请输入你想查找的数");
		num=in.nextInt();
		first=0;
		last=a.length-1;
		while(true) {
			mind=(first+last)/2;
			if(a[mind]==num) {
				System.out.println(num+"的下标为"+(mind));
				break;
			}
			else if(a[mind]>num) {
				last=mind-1;
				
			}
			else if(a[mind]<num) {
				first=mind+1;
			}
			if(first>last) {
				System.out.println("数据中未查找到数字"+num);
				break;
			}
		}
		System.out.println("是否继续查找，输入一个整数，0为退出，其他为继续");
		int choose;
		choose=in.nextInt();
		if(choose==0) {
			break;
		}
	}
	System.out.println("成功退出");
	}
}
