package 课堂笔记;
import java.io.*;
public class 文件操作01 {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("reader.txt");
		FileWriter fw=new FileWriter("put.txt");
		LineNumberReader ir=new LineNumberReader(fr);
		ir.setLineNumber(0);
		String line=null;
		while((line=ir.readLine())!=null) {
			fw.write(ir.getLineNumber()+":"+line);
			fw.write("\r\n");
		}
		ir.close();
		fw.close();
		
		
	}

}
