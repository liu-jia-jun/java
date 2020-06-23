package 课堂笔记;

import java.util.Arrays;

public class 接口text01 {

	public static void main(String[] args) {
		int[] a = { 3, 5, 8, 2 };
		pai p = new pai();
		p.px(a);
		System.out.println(p.a);
		
		
		
		
		
	}

}

interface paixu {
	public void px(int[] a);

	int a = 1;
}

class pai implements paixu {

	public void px(int[] a) {
		Arrays.parallelSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
