package javatest01;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		File f1 = new File("F:\\���������ļ�\\f1");

		try {
			// existes(); �ж�f1�ļ��Ƿ����
			if (f1.exists() != true) {

				// f1.createNewFile(); ����f1����ļ�
				f1.createNewFile();
			}

			// f1.getAbsolutePath(); ��ȡf1�ľ���·��
			System.out.println("f1�ľ���·����" + f1.getAbsolutePath());

			// f1.getName(); ��ȡf1���ļ���
			System.out.println("f1���ļ�����" + f1.getName());

			// f1.getParent(); ��ȡf1�ĸ����ļ��е�·��
			System.out.println("f1�ĸ����ļ��е�·��" + f1.getParent());

			// f1.length(); ��ȡ�ļ���С���ļ����ֽ���
			System.out.println(f1.length());
			// f1.isDirectory(); �ж�f1�Ƿ�Ϊ�ļ���
			System.out.println("��������ļ���" + f1.isDirectory());

		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		File f2 = new File("F:\\���������ļ�\\f2");
		f2.mkdir();// ��������Ŀ¼

		File f3 = new File("F:\\���������ļ�");
		f3.mkdirs();// �����㼶Ŀ¼
		
		
		// ��f3�е��ļ���Ŀ¼��Ϊһ�����鷵��
		File[] files = f3.listFiles();

		for (File file : files) {
			System.out.println(file.getName());
		}
	}

}
