package com.java.file;

import java.io.File;

public class Q08 {
	
	private static int count;
	private static int dcount;

	public static void main(String[] args) {
		/*
		delete ���� �����Ͻÿ�.
		
		����>
		1. field; ���� ������ ������ count ���� ����
		2. delete �޼ҵ� ����
			>�Ű����� �̿��� ���� �迭 ����
			>���� for������ �迭 �ݺ�
				>if ��������?
					>delete, count++
			>���� for������ �迭 �ݺ�
				>if ��������?
					>delete, count++
					>�ٽ� delete �޼ҵ� ȣ��
		3. ���� ���� ���丮�� ��η� �ϴ� File ��ü ����
		4. delete �޼ҵ� ȣ��
		5. ��� ���
		 */
		
		File dir = new File("C:\\java\\file\\����_���丮_����\\���� ����");
		if(dir.exists()) {
			delete(dir);
		}
		
		System.out.println("������ �����߽��ϴ�.");
		System.out.printf("������ ������ %d���̰�, ������ %d���Դϴ�. %n", dcount, count);

	}
	
	private static void delete(File dir) {
		File[] list = dir.listFiles();
		
		for(File subfile : list) {
			if(subfile.isFile()) {
				subfile.delete();
				count++;
			}
		}
		
		for(File subdir : list) {
			if(subdir.isDirectory()) {
				subdir.delete();
				dcount++;
				delete(subdir);
			}
		}
		
		dir.delete();
	}
}
