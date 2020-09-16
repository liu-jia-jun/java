package javatest01;

public class 泛型test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal<String> a=new Animal();
		a.move("动物");
		
		
		Bird bird=new Bird();
		bird.move("鸟");
	}

}


class Animal<e>{
	void move(e s) {
		System.out.println(s+"在移动");
	}
}

class Bird extends Animal{
	void move(String s) {
		System.out.println(s+"在飞");
	}
}
	
