package javatest01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Collection的contains方法 {

	public static void main(String[] args) {
		Collection c=new ArrayList();
				user user1=new user("jack");
				
				user user2=new user("jack");
			
				c.add(user1);
				
			System.out.println(c.contains(user2));//返回false  因为没有重写equals方法
			
			
			answer an1=new answer("john");
			answer an2=new answer("john");
			
			c.add(an1);
			
			System.out.println(c.add(an2));//返回true   answer类重写了equals方法
			
			
			
			System.out.println(user1.A1());
			System.out.println(user2.A1());
			// 调试getClass()方法 返回调用该方法的类
		}
	}

	class user{
		String name;
		
		public user(String name) {
			this.name=name;
		}//有参构造方法
		
		public user() {}//无参构造方法
		
		
		
		//该方法未重写equals方法
		
		
		public Class<? extends user> A1() {
			return getClass();
		}//用于调试getClass
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
			
			//已重写equals方法	
		}
		
	}

