package 课堂笔记;
import java.io.*;
public class 文件操作 {

	public static void main(String[] args) throws Exception {
		FileReader reader =new FileReader("reader.txt");
		int ch;
		while((ch=reader.read())!=-1) {
			System.out.print((char)ch);
		}
		reader.close();
		FileWriter writer=new FileWriter("reader.txt");
		String str="江西软件大学，你好";
		writer.write(str);
		writer.write("\r\n");
		writer.close();
	}

}
