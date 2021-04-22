package 算法与数据结构;



public class 数组模拟队列 {

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
	private int maxsize=10;//表示数组的最大容量
	private int front;//队列头
	private int rear;//队列尾
	
	private int[] arr;//该数据用于存放数据，模拟队列
	
	public array() {}//无参构造
	
	public array(int maxsize) {//有参构造
		this.maxsize=maxsize;
		this.front=-1;
		this.rear=-1;
		arr=new int[maxsize];
		
	}
	
	public void add(int data) {
		
		if(rear==maxsize-1) {
			System.out.println("队列已满");
		}else {
			rear++;
		arr[rear]=data;
		}
		
	}
	
	public void get() {
		if(rear==front) {
			System.out.println("队列以空");
			
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



