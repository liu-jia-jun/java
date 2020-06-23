package 方法;
import java.util.Scanner;
public class 选择排序 {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int number,temp=0;
		System.out.println("请输入你数组的长度");
		number=in.nextInt();
		
    int[] b= new int[number];
    for(int i=0;i<b.length;i++) {
    	System.out.println("请输入第"+(i+1)+"个数");
    	b[i]=in.nextInt();
    }
    System.out.println("结果为：");
		for(int i=0;i<b.length-1;i++) {
			int max=i;
			for(int j=i+1;j<b.length;j++) {

				if(b[max]<b[j]) {
					max=j;
				}
			}
			temp=b[i];
			b[i]=b[max];
			b[max] =temp;
			
		}
			
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
	}

}
