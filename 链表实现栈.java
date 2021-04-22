package 算法与数据结构;

public class 链表实现栈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stacktest s=new stacktest();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		System.out.println(s.put());
		System.out.println(s.put());
		s.add(0);
		System.out.println(s.put());
	}

}

class stacktest {
	StackNode head;
	StackNode seek;

	stacktest() {
		head = new StackNode();

	}

	stacktest(int data) {
		head = new StackNode(data);
	
	}

	void add(int data) {
		StackNode newnode = new StackNode(data);
		newnode.next = head.next;
		head.next = newnode;
		seek=head.next;
	}

	StackNode put() {

		if (seek == null) {
			return null;
		} else {
			StackNode temp = seek;
			seek=seek.next;
			return temp;
		}

	}
}

class StackNode {
	StackNode next = null;
	int data = 0;

	StackNode() {
	}

	StackNode(int data) {
		this.data = data;
	}

	public String toString() {
		return "数据：" + data;
	}
}