package �㷨�����ݽṹ;

public class ˫������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLink link = new DoubleLink();
		link.add(1);
		link.add(7);
		link.addby(3);

		link.addby(6);
		link.addby(5);
		link.show();
	}

}

class DoubleLink {
	WaysNode head;

	public DoubleLink() {
		// �޲ι���
		head = new WaysNode();
	}

//	��
	public void add(int data) {
		WaysNode temp = head;
		while (temp.next != null) {
			temp = temp.next;

		}
		WaysNode newnode = new WaysNode(data);
		newnode.pre = temp;
		temp.next = newnode;

	}

//show����
	public void show() {
		WaysNode temp = head.next;
		if (temp == null) {
			System.out.println("����Ϊ��");
		}
		while (temp != null) {
			System.out.println(temp);
			temp = temp.next;
		}
	}

//ɾ
	public void deleat(int data) {
		WaysNode temp = head.next;
		while (temp != null) {
			if (temp.data == data) {
				break;
			} else {
				temp = temp.next;
			}
		}
		if (temp.next == null) {
			temp.pre.next = null;

		} else {
			temp.next.pre = temp.pre;
			temp.pre.next = temp.next;
		}
	}

//��
	public void change(int number, int data) {
		WaysNode temp = head.next;
		while (temp != null) {
			if (temp.data == number) {
				temp.data = data;
				return;

			} else {
				temp = temp.next;
			}
		}
		System.out.println("δ�ҵ�");
	}

//��
	public WaysNode check(int number) {
		WaysNode temp = head.next;
		while (temp != null) {
			if (temp.data == number) {
				System.out.println(temp);
				return temp;
			} else {
				temp = temp.next;
			}
		}
		System.out.println("δ�ҵ�");
		return null;

	}

//�������

	public void addby(int data) {
		WaysNode temp = head;
		WaysNode newnode;
		if (temp.next == null) {

			newnode = new WaysNode(data);
			newnode.pre = temp;
			temp.next = newnode;
			return;
		}
		while (temp.next != null) {
			if (temp.next.data == data) {
				System.out.println("�����Ѵ���");
				return;
			} else if (temp.next.data < data) {
				if(temp.next.next==null) {
					newnode =new WaysNode(data);
					newnode.pre=temp.next;
					temp.next.next=newnode;
				}else {
					temp = temp.next;
				}
				

			} else if (temp.next.data > data) {
				newnode = new WaysNode(data);
				temp.next.pre = newnode;
				newnode.next = temp.next;
				temp.next = newnode;
				newnode.pre = temp;
				break;
			}
		}
	}
}

class WaysNode {
	WaysNode next = null;
	WaysNode pre = null;
	int data;

	public WaysNode(int data) {
		this.data = data;
	}

	public WaysNode() {

	}

	public String toString() {
		return "��ţ�" + this.data;
	}
}