package �㷨�����ݽṹ;



public class ����ģ����� {

	public static void main(String[] args) {
		
		array arr=new array(3);
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		for(int i=0;i<4;i++) {
			arr.get();
		}
		arr.put();
	}

}
class array{
	private int maxsize=10;//��ʾ������������
	private int front;//����ͷ
	private int rear;//����β
	
	private int[] arr;//���������ڴ�����ݣ�ģ�����
	
	public array() {}//�޲ι���
	
	public array(int maxsize) {//�вι���
		this.maxsize=maxsize;
		this.front=-1;
		this.rear=-1;
		arr=new int[maxsize];
		
	}
	
	public void add(int data) {
		
		if(rear==maxsize-1) {
			System.out.println("��������");
		}else {
			rear++;
		arr[rear]=data;
		}
		
	}
	
	public void get() {
		if(rear==front) {
			System.out.println("�����Կ�");
			
		}else {
			System.out.println(arr[++front]);
		}
		
	}
	
	public void put() {
		for(int i=0;i<maxsize;i++) {
			System.out.println(arr[i]);
		}
		
	}
}



