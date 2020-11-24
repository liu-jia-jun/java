package javatest01;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File f1 = new File("F:\\代码运行文件\\f1");

		try {
			// existes(); 判断f1文件是否存在
			if (f1.exists() != true) {

				// f1.createNewFile(); 创建f1这个文件
				f1.createNewFile();
			}

			// f1.getAbsolutePath(); 获取f1的绝对路径
			System.out.println("f1的绝对路径：" + f1.getAbsolutePath());

			// f1.getName(); 获取f1的文件名
			System.out.println("f1的文件名：" + f1.getName());

			// f1.getParent(); 获取f1的父级文件夹的路径
			System.out.println("f1的父级文件夹的路径" + f1.getParent());

			// f1.length(); 获取文件大小即文件的字节数
			System.out.println(f1.length());
			// f1.isDirectory(); 判断f1是否为文件夹
			System.out.println("这个不是文件夹" + f1.isDirectory());

		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		File f2 = new File("F:\\代码运行文件\\f2");
		f2.mkdir();// 单个创建目录

		File f3 = new File("F:\\代码运行文件");
		f3.mkdirs();// 创建层级目录
		
		
		// 将f3中的文件或目录作为一个数组返回
		File[] files = f3.listFiles();

		for (File file : files) {
			System.out.println(file.getName());
		}
	}

}
