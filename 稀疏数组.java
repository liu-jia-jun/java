package �㷨�����ݽṹ;

public class ϡ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array=new int[8][10];//������һ�����ڽ϶൥һ���ݵĶ�ά����eg������0��
		array[1][2]=1;
		array[2][3]=2;
		
		//������0�� ��Ч����
		
		int count=0;//����ϡ�����������������count+1
		
	for(int i=0;i<8;i++) {
		for(int j=0;j<10;j++) {
			if(array[i][j]!=0) {
				count++;//����ϡ�����������������count+1
			}
			System.out.print(array[i][j]);
		}
		System.out.println();
	}
	System.out.println("count:"+count);
	int[][] array1=new int[count+1][3];
	array1[0][0]=8;
	array1[0][1]=10;
	array1[0][2]=count;//countΪ��Ч���ݵĸ���
 
	
	for(int i=0,m=0;i<8;i++) {
		for(int j=0;j<10;j++) {
			if(array[i][j]!=0) {
				m++;
			array1[m][0]=i;
			array1[m][1]=j;
			array1[m][2]=array[i][j];
			
				}
		}
	}
	//����ά����ת��Ϊϡ������
	
	for(int i=0;i<count+1;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(array1[i][j]);
		}
		System.out.println();
	}
	//����ϡ������
	
 int[][] array2=new int[array1[0][0]][array1[0][1]];
 array2[array1[1][0]][array1[1][1]]=array1[1][2];
 array2[array1[2][0]][array1[2][1]]=array1[2][2];
 
 
 for(int i=0;i<array1[0][0];i++) {
		for(int j=0;j<array1[0][1];j++) {
			System.out.print(array2[i][j]);
		}
		System.out.println();
	}
 
 //��ȡϡ�����鲢��ԭΪԭ���Ķ�ά����

	}
}
/*
ϡ��������Ϊ�˽�һЩ�нϴ�һ���ݵ��������ѹ��  
ϡ�����������Ϊ��ά������Ч���ݵĸ�����һ������Ϊ��
ϡ������ĵ�һ�е�һ��Ϊ��ά�������������һ�еڶ���Ϊ��ά�����������������Ϊ��Ч���ݵĸ���
ϡ������������е�һ��Ϊ��ά������Ч���ݵ������������еڶ���Ϊ��ά������Ч���ݵ�������������Ϊ��Ч���ݵ�ֵ

*/







