package javatest01;

public class LinkList��������test {

	public static void main(String[] args) {

		Link link = new Link();
		link.add("hello world");
		link.add("love");
		System.out.println(link.add(1));
		Node node=link.head;
		
		//�Լ�д�ı�������
		for(int i=0;i<link.size;i++) {
			System.out.println(node.o);
			node=node.next;
			
		}

	}

}





class Link {

	Node head=null;
    int size=0;//��¼����Ԫ�ظ���
	public boolean add(Object o) {

		if (head == null) {//���ͷ�ڵ�Ϊ��  ��ֱ�Ӵ���һ���ڵ��ͷ�ڵ�
			head= new Node(o, null);
			size++;
			return true;
			
		} else {
			
//			���ͷ�ڵ㲻Ϊ�� ���������һ���ڵ��nextָ����һ���½ڵ�
			LastNode(head).next = new Node(o, null);
			size++;
			return true;
		}
		
	}

	//ʹ�õݹ鷽����ѯ���һ���ڵ㲢���ظýڵ��next����nextָ����һ���ڵ�
	public Node LastNode(Node head) {
		if (head.next == null) {
			return head;
		}
		return LastNode(head.next);
	}
	
	
}

class Node {

	Object o;//������

	Node next;//ָ����

	public Node() {
	}

	public Node(Object o, Node next) {//���췽��
		this.o = o;
		this.next = next;//����Ϊʲô��ֱ��ΪNULL     ����Ϊ���´ε��������Ԫ�ػ���ɾ��Ԫ��
	}
}


//ע:����Ǵ����ĵ�һ���ڵ�ֱ����headָ������������ǵ�һ���ڵ�����һ���ڵ��nextָ����

