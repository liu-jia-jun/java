package 方法;

public class StringBuffer与StringBuilder {
	public static void main(String[] args) {
		
		//StringBuffer型
		StringBuffer strb=new StringBuffer();//创建一个空的字符串StringBuffer型
		System.out.println(strb);
		strb.append("i ");
		System.out.println(strb);
		strb.append("love ");
		System.out.println(strb);
		strb.append("you");
		System.out.println(strb);
		
		
		//StringBuilder型
		StringBuilder strb2=new StringBuilder();
		
		System.out.println(strb2);
		strb2.append("i ");
		System.out.println(strb2);
		strb2.append("love ");
		System.out.println(strb2);
		strb2.append("you");
		System.out.println(strb2);
		
	}
	
}
