package javatest01;
//��ֵ���
public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=i;
		j=1;
		System.out.println(i);
		
		String str ="null";
		String str1=str;
		str1="not null";
		
		System.out.println(str);
		
		A a=new A();
		a.str="kong";
		A a1;
		a1=a;
		a1.str="no null";
		System.out.print(a.str);
	/* 
	 * 1.����������������ֵ����  ����Ӱ������������ֵ
	 * 2.���������������ڵ�ַ����  �ײ�ָ�����ͬһ������
	 * 3.����String���͵��������������ͣ�����String���Ͳ���Ӱ������������ֵ
	 * ��ΪString���͵���������ָ������ַ���������
	 */
	}

}

class A{
	String str;
	
}