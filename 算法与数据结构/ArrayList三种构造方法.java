package javatest01;

public class ArrayListÈýÖÖ¹¹Ôì·½·¨ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//无参构造,无参构造在添加第一个元素之后初始化容量为10
		ArrayList arr=new ArrayList();
		
		//有参构造，带一个int型参数  指定该集合的初始化容量
		ArrayList arr1=new ArrayList(15);
		
		Collection c=new HashSet();
		c.add(1);
		c.add(2);
		
		//有参构造，参数为一个集合  
       //这里将hashset类型的集合转换成ArrayList类型的集合
		
		ArrayList arr2=new ArrayList(c);
		
		System.out.println(arr2.get(0));
		System.out.println(arr2.get(1));
	}

}
