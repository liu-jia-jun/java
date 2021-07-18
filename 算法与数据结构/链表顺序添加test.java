package 算法与数据结构;

public class 链表顺序添加test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Link link=new Link();
link.add("刘佳俊", 01, 100);
link.add("寇兰青", 02, 99);
link.add("卢思琪", 03, 98);
link.add("黄伟豪", 04, 97);
link.add("戴彪平", 05, 96);
link.add("黄彪", 06, 95);
link.add("郭建雄", 07, 98);



link.show();
link.check(006);
	}

}


class Link{
	Node head;
	public Link() {
		 head=new Node();
	}
	
	
	public void add(String name, int number ,int great) {//增   增加链表元素
	Node	temp=head;
		while(true) {
			if(temp.next==null) {
				temp.next=new Node(name,number,great);
				break;
		
			}else {
				temp=temp.next;
			}
		}
		
	}
	
	public void show() {//输出   遍历链表
		Node temp=head.next;
		
		while(true) {
			if(temp==null) {
				break;
			}else {
				System.out.println(temp);
				temp=temp.next;
			}
		}
	
	}

	
	//?????????????????????????????????????????????????????????????未完成
	public void deleat(int n) {//删  删除指定元素
		Node temp;
		temp=head.next;
		while(true) {
			if(temp.number==n) {
				
			}
		}
	}
	
	public void check(int n) {
		if(n<1) {
			System.out.println("查询输入有误，请输入大于0的整数");
			return ;
		}
		Node temp;
		temp=head;
		while(true) {
			if(temp.number==n) {
			System.out.println(temp);
			break;
		}else {
			temp=temp.next;
		}
		}
		
	}
	
	
}

 
class Node{
	Node next=null;
	String name=null;
	int number=0;
	int great=0;
	public Node() {
	}
	public Node(String name,int number,int great) {
		this.great=great;
		this.name=name;
		this.number=number;
	}
	
	public String toString() {
		return "学号："+this.number+"姓名："+this.name+"成绩："+this.great;
		
	}
}