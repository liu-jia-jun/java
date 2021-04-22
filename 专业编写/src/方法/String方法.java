package 方法;

public class String方法 {

	
	public static void main(String[] args) {
		// str01指向堆内存中的对象
		String str01 = new String("abcd");

		// str02指向方法区中字符串常量池中的元素
		String str02 = "abcd";

		if (str01 == str02) {// 不相等
			System.out.println("相等");
		} else {
			System.out.println("不相等");
		}

		if (str01.equals(str02)) {// 相等
			System.out.println("相等");
		} else {
			System.out.println("不相等");
		}

		// String的构造函数
		byte[] bytes = { 97, 98, 99, 100 };
		String s1 = new String(bytes);
		System.out.println(s1);// 输出abcd

		System.out.println("_______________________________________");
		// 1.返回一个字符串中指定下标的元素 返回 char 型
		// charAt();
		char s2 = "abcd".charAt(2);// 输出c
		System.out.println(s2);

		System.out.println("_______________________________________");
		// 2.判断字符1中是否存在字符串2 返回布尔型
		// contains();
		Boolean judgment = "i love you ".contains("you");// 返回true
		System.out.println(judgment);

		System.out.println("_______________________________________");
		// 3.判断字符串1是否以字符串2结尾 返回布尔型
		// endWith();
		judgment = "i love you".endsWith("you");
		System.out.println(judgment);

		System.out.println("_______________________________________");
		// 4.忽略字母大小写来判断字符串是否相等 返回布尔型
		// equalsIgnoreCase();
		judgment = "i love you".equalsIgnoreCase("I LOVE YOU");
		System.out.println(judgment);

		System.out.println("_______________________________________");
		// 5.将字符串对象转换成字节数组 返回一个byte型数组
		//getBytes();
		byte[] bytes2 = "abcdefg".getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes2[i]);
		}

		System.out.println("_______________________________________");
		// 6.判断某个字符床在父级字符串中第一次出现的索引即下标 返回一个数字 -1为未找到
		//indexOf();
		int num = "i love you".indexOf("you");
		System.out.println(num);

		
		System.out.println("_______________________________________");
		// 7.判断某个字符床在父级字符串中最后一次出现的索引即下标 返回一个数字 -1为未找到
		//lastIndexOf();
		num = "i love you do you love me ".lastIndexOf("love");
		System.out.println(num);

		
		System.out.println("_______________________________________");
		// 8.判断某个字符串是否为空 返回布尔型
		//isEmpty();
		judgment = "".isEmpty();
		System.out.println(judgment);

		
		System.out.println("_______________________________________");
		//9.将某个字符串中的某种元素全部替换为另一种元素  返回一个数组
		//replace();
		System.out.println("abacad".replace("a","e"));//输出ebeced
		
		
		System.out.println("_______________________________________");
		//10.拆分字符串：以字符串中的某个元素为基准分割 返回一个字符串数组
		String[] stra="2020,05,17".split(",");//注：    不能以"."为分割
		for(int i=0;i<stra.length;i++) {
			System.out.println(stra[i]);
		}
		
		System.out.println("_______________________________________");
		//11.判断某个字符串是否以一个子字符串开头    返回一个布尔型
		//startsWith();
		judgment="i love you".startsWith("i");
		System.out.println(judgment);
		
		
		System.out.println("_______________________________________");
		//12.判断某个字符串是否以一个子字符串结尾     返回一个布尔型
		//endWith();
		judgment="i love you".endsWith("you");
		
		
		System.out.println("_______________________________________");
		//13.截取字符串中的一段作为一个新的字符串返回
		//substring();
		System.out.println("i love you".substring(0));//函数中一个参数：从该参数开始一直截取到最好
		System.out.println("i love you".substring(2,6));//函数中有俩个参数：从begin到end 但不包括end
		
		System.out.println("_______________________________________");
		//14.将字符串转换成一个char类型的数组  即将字符串元素一个一个存储到char数组中   返回一个char数组
		//toCharArray();
		char[] ch="刘佳俊".toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}

		System.out.println("_______________________________________");
		//15.将字符串转换成小写   返回一个字符串  中文不转换
		//toLowerCase();
		System.out.println("LOVE".toLowerCase());//输出love   
		System.out.println("刘佳俊".toLowerCase());
		
		System.out.println("_______________________________________");
		//16.将字符串转换成大写  返回一个字符串   中文不转换
		//toUpperase();
		System.out.println("love".toUpperCase());//输出LOVE
		System.out.println("刘佳俊".toUpperCase());
		
		
		System.out.println("_______________________________________");
		//17.将字符串的前后空白去除
		//trim();
		System.out.println("       hello     ".trim());//输出hello
		
		
		
		System.out.println("_______________________________________");
		//将非字符串转换为字符串       该方法为静态方法
		//valueof();
		String s=String.valueOf(100);
		System.out.println(s);//此时输出的100为字符串
		Test test=new Test();
		Test2 test2=new Test2();
		//输出对象地址
		System.out.println(String.valueOf(test));
		//已经重写了同string();方法   输出toString();方法中的内容
		System.out.println(String.valueOf(test2));
		
	}

}


class Test{
	
}

class Test2{
	public String toString() {
		return "刘佳俊";
	}
}

















