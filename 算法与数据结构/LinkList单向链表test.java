package javatest01;

public class LinkList单向链表test {

	public static void main(String[] args) {

		Link link = new Link();
		link.add("hello world");
		link.add("love");
		System.out.println(link.add(1));
		Node node=link.head;
		
		//自己写的遍历链表
		for(int i=0;i<link.size;i++) {
			System.out.println(node.o);
			node=node.next;
			
		}

	}

}





class Link {

	Node head=null;
    int size=0;//记录链表元素个数
	public boolean add(Object o) {

		if (head == null) {//如果头节点为空  则直接创建一个节点给头节点
			head= new Node(o, null);
			size++;
			return true;
			
		} else {
			
//			如果头节点不为空 ，则让最后一个节点的next指向下一个新节点
			LastNode(head).next = new Node(o, null);
			size++;
			return true;
		}
		
	}

	//使用递归方法查询最后一个节点并返回该节点的next好让next指向下一个节点
	private Node LastNode(Node head) {
		if (head.next == null) {
			return head;
		}
		return LastNode(head.next);
	}
	
	
}

class Node {

	Object o;//数据项

	Node next;//指针项

	public Node() {
	}

	public Node(Object o, Node next) {//构造方法
		this.o = o;
		this.next = next;//这里为什么不直接为NULL     ：是为了下次的随机增加元素或者删除元素
	}
}


//注:如果是创建的第一个节点直接让head指向它，如果不是第一个节点让上一个节点的next指向它

