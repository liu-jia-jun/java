package 方法;

import java.util.Random;

public class 产生五个不同的随机数 {// [0-5];

	public static void main(String[] args) {

		Random ran=new Random();
		int[] arr =new int [5];
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			arr[i]=-1;
			System.out.println("数组为："+arr[i]);
		}
		
		for(int i=0;i<arr.length;) {
			int number=ran.nextInt(5);
			
			if(CheckRepeat(arr,number)) {
				arr[i]=number;
				System.out.println("第"+i+"个产生的随机数:"+arr[i]);
				i++;
			}
		}
		
	}
	

		
		
	public static Boolean CheckRepeat(int number[], int key) {
		for(int i=0;i<number.length;i++) {
			if(number[i]==key) {
				return false;
			}
		
		}
		
		return true;
	}

}
