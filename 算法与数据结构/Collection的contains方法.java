package javatest01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Collection��contains���� {

	public static void main(String[] args) {
		Collection c=new ArrayList();
				user user1=new user("jack");
				
				user user2=new user("jack");
			
				c.add(user1);
				
			System.out.println(c.contains(user2));//����false  ��Ϊû����дequals����
			
			
			answer an1=new answer("john");
			answer an2=new answer("john");
			
			c.add(an1);
			
			System.out.println(c.add(an2));//����true   answer����д��equals����
			
			
			
			System.out.println(user1.A1());
			System.out.println(user2.A1());
			// ����getClass()���� ���ص��ø÷�������
		}
	}

	class user{
		String name;
		
		public user(String name) {
			this.name=name;
		}//�вι��췽��
		
		public user() {}//�޲ι��췽��
		
		
		
		//�÷���δ��дequals����
		
		
		public Class<? extends user> A1() {
			return getClass();
		}//���ڵ���getClass
	}




	class answer{
		String name;
		public answer(String name) {
			this.name=name;
		}
		
		public answer() {}
		
		
		public boolean equals(Object o) {
		if(o==this) {return true;}
		
		if(o==null || getClass()!=o.getClass()) {
			return false;
		}
		
		user user =(user) o;
		return Objects.equals(name, user.name);
			
			//����дequals����	
		}
		
	}

