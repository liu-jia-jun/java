package �㷨�����ݽṹ;

public class Լɪ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoyTest bt =new BoyTest(10);
		
		bt.put(2);
		
	}

}

class BoyTest {
	Boy first;
	Boy last;
	Boy boy;
	
	public BoyTest(int number) {
		Boy temp=first;
		for(int i=1;i<=number;i++) {
		if(i==1) {
			boy=new Boy(i);
			first=boy;
			boy.next=first;
			last=boy;
		}else  {
			temp=first;
			
			
			
			while(true) {
				if(temp.next==first) {
					boy=new Boy(i);
					last=boy;
					temp.next=last;
					last.next=first;
					break;
				}else {
					temp=temp.next;
				}
			}
			
		}
		}	
	}
	
	
	public void show() {
		Boy temp=first;
		if(temp==null) {
			System.out.println("����Ϊ��");
		}else {
			while(true) {
				if(temp.next==first) {
					System.out.println(temp);
					break;
				}else {
					System.out.println(temp);
					temp=temp.next;
				}
			}
		}
		
	}
	
	
	public void put(int number) {
		int n=1;
		while(first!=last) {
			for(int i=0;i<number;i++) {
				if(i==number-1) {
					System.out.println("��"+n+"�����У�"+first);
					n++;
					first=first.next;
					last.next=first;
					break;
				}else {
					first=first.next;
					last=last.next;
				}
			}
		}
		
		System.out.println("��"+n+"�����У�"+first);
	}
	
}


class Boy{
	int number;
	Boy next;
	
	public Boy(int number) {
		this.number=number;
	}
	
	public String toString () {
		return "��ţ�"+this.number;
	}
}