package javatest01;

public class ����test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal<String> a=new Animal();
		a.move("����");
		
		
		Bird bird=new Bird();
		bird.move("��");
	}

}


class Animal<e>{
	void move(e s) {
		System.out.println(s+"���ƶ�");
	}
}

class Bird extends Animal{
	void move(String s) {
		System.out.println(s+"�ڷ�");
	}
}
	
