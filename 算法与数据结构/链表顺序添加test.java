package �㷨�����ݽṹ;

public class ����˳�����test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Link link=new Link();
link.add("���ѿ�", 01, 100);
link.add("������", 02, 99);
link.add("¬˼��", 03, 98);
link.add("��ΰ��", 04, 97);
link.add("����ƽ", 05, 96);
link.add("�Ʊ�", 06, 95);
link.add("������", 07, 98);



link.show();
link.check(006);
	}

}


class Link{
	Node head;
	public Link() {
		 head=new Node();
	}
	
	
	public void add(String name, int number ,int great) {//��   ��������Ԫ��
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
	
	public void show() {//���   ��������
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

	
	//?????????????????????????????????????????????????????????????δ���
	public void deleat(int n) {//ɾ  ɾ��ָ��Ԫ��
		Node temp;
		temp=head.next;
		while(true) {
			if(temp.number==n) {
				
			}
		}
	}
	
	public void check(int n) {
		if(n<1) {
			System.out.println("��ѯ�����������������0������");
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
		return "ѧ�ţ�"+this.number+"������"+this.name+"�ɼ���"+this.great;
		
	}
}