package 算法与数据结构;

public class 稀疏数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array=new int[8][10];//现在有一个存在较多单一数据的二维数组eg：数据0；
		array[1][2]=1;
		array[2][3]=2;
		
		//两个非0的 有效数据
		
		int count=0;//计算稀疏数组的行数——》count+1
		
	for(int i=0;i<8;i++) {
		for(int j=0;j<10;j++) {
			if(array[i][j]!=0) {
				count++;//计算稀疏数组的行数——》count+1
			}
			System.out.print(array[i][j]);
		}
		System.out.println();
	}
	System.out.println("count:"+count);
	int[][] array1=new int[count+1][3];
	array1[0][0]=8;
	array1[0][1]=10;
	array1[0][2]=count;//count为有效数据的个数
 
	
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
	//将二维数组转换为稀疏数组
	
	for(int i=0;i<count+1;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(array1[i][j]);
		}
		System.out.println();
	}
	//遍历稀疏数组
	
 int[][] array2=new int[array1[0][0]][array1[0][1]];
 array2[array1[1][0]][array1[1][1]]=array1[1][2];
 array2[array1[2][0]][array1[2][1]]=array1[2][2];
 
 
 for(int i=0;i<array1[0][0];i++) {
		for(int j=0;j<array1[0][1];j++) {
			System.out.print(array2[i][j]);
		}
		System.out.println();
	}
 
 //读取稀疏数组并还原为原来的二维数组

	}
}
/*
稀疏数组是为了将一些有较大单一数据的数组进行压缩  
稀疏数组的行数为二维数组有效数据的个数加一，列数为三
稀疏数组的第一行第一列为二维数组的行数，第一行第二列为二维数组的列数，第三列为有效数据的个数
稀疏数组的其他行第一列为二维数组有效数据的行数，其他行第二列为二维数组有效数据的列数，第三列为有效数据的值

*/







