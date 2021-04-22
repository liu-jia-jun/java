package javatest01;

public class ·ºÐÍtest {//泛型机制

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal<String> a=new Animal();
		a.move("¶¯Îï");
		
		
		Bird bird=new Bird();
		bird.move("Äñ");
	}

}


class Animal<e>{
	void move(e s) {
		System.out.println(s+"ÔÚÒÆ¶¯");
	}
}

class Bird extends Animal{
	void move(String s) {
		System.out.println(s+"ÔÚ·É");
	}
}
	
