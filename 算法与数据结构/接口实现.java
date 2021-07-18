package javatest01;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] array=new Object[10];
		for(Object value:array) {
			System.out.println(value);
		}
	}

}

class Array implements test {

	private int size=10;
	private Object[] array;
	
	public Array() {
		
		array=new Object[size];
		
	}
	
	public Array(int size) {
		this.size=size;
		array=new Object[size];
	}
	
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	for(int i=0;i<size;i++) {
		if(array[i]==null) {
			break;
		}else {
			array[i]=null;
		}
	}
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(array[0]==null) {
			return true;
		}else {
				return false;
		}
	
	}

	@Override
	public int length() {
	
	
		// TODO Auto-generated method stub
		int number = 0;
		for(int i=0;i<size;i++) {
			if(array[i]!=null) {
				number++;
			}else {
				break;
			}
		}
		return number;
	}

	@Override
	public Object get(int pos) {
		// TODO Auto-generated method stub
		if(pos>size) {
			System.out.println("数组溢出");
			return null;
			}else
			{
				return array[pos];
			}
		
		
		
	}

	@Override
	public void insert(int i, Object x) {
		// TODO Auto-generated method stub
		int number=this.length();
		for(int j=number;j>=i;j--) {
			array[j+1]=array[j];
		}
		array[i]=x;
	}

	@Override
	public Object delete(int i) {
		// TODO Auto-generated method stub
		int number=this.length();
		for(int j=i;j<=number;j++) {
			array[j]=array[j+1];
		}
		array[number]=null
				;
		return null;
	}

	@Override
	public void remove(Object value) {
		// TODO Auto-generated method stub
		
		int i;
		while(true) {
			i=this.indexOf(value);
			if(i==-1) {
				break;
			}
			this.delete(i);
		}
	}

	@Override
	public Object getPre(Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getNext(Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object x) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++) {
			if(array[i]==x) {
				return i;
			}
		}
	return -1;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for(Object o:array) {
			System.out.println(0);
		}
	}
	
}

 interface test<T> {

    void clear(); //清空线性表

    boolean isEmpty(); //判空

    int length(); //线性表长度

    T get(int pos); //查询线性表位置pos的值

    void insert(int i, T x);// 在线性表的第i个数据元素之前插入一个值为x的数据元素。其中i取值范围为：0≤i≤length()。如果i值不在此范围则抛出异常,当i=0时表示在表头插入一个数据元素x,当i=length()时表示在表尾插入一个数据元素x

    T delete(int i);// 将线性表中第i个数据元素删除。其中i取值范围为：0≤i≤length()- 1,如果i值不在此范围则抛出异常

    void remove(T value);//删除值为value的元素

    T getPre(T value);

    T getNext(T value);

    int indexOf(T x);// 返回线性表中首次出现指定元素的索引，如果列表不包含此元素，则返回 -1

    void display();// 输出线性表中的数据元素
}

