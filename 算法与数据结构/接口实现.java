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
			System.out.println("�������");
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

    void clear(); //������Ա�

    boolean isEmpty(); //�п�

    int length(); //���Ա���

    T get(int pos); //��ѯ���Ա�λ��pos��ֵ

    void insert(int i, T x);// �����Ա�ĵ�i������Ԫ��֮ǰ����һ��ֵΪx������Ԫ�ء�����iȡֵ��ΧΪ��0��i��length()�����iֵ���ڴ˷�Χ���׳��쳣,��i=0ʱ��ʾ�ڱ�ͷ����һ������Ԫ��x,��i=length()ʱ��ʾ�ڱ�β����һ������Ԫ��x

    T delete(int i);// �����Ա��е�i������Ԫ��ɾ��������iȡֵ��ΧΪ��0��i��length()- 1,���iֵ���ڴ˷�Χ���׳��쳣

    void remove(T value);//ɾ��ֵΪvalue��Ԫ��

    T getPre(T value);

    T getNext(T value);

    int indexOf(T x);// �������Ա����״γ���ָ��Ԫ�ص�����������б�������Ԫ�أ��򷵻� -1

    void display();// ������Ա��е�����Ԫ��
}

