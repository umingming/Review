package com.java.file;

import java.io.File;

public class Q04 {

	public static void main(String[] args) {
		/*
		���� ���ϸ� �տ� �Ϸ� ��ȣ�� ���̽ÿ�.
		
		����>
		1. ���� ���丮 ��θ� �����ϴ� ���� ��ü ����
		2. ���� ���� ���� �� ��ü�� ����Ʈ�� �ʱ�ȭ
		3. for�� �迭�� ����
			>printf�� �Ϸù�ȣ�� �Բ� ��� %03d���
		 */
		
		File dir = new File("C:\\java\\file\\����_���丮_����\\���� ����\\Music");
		File[] list = dir.listFiles();
		
		int n = 1;
		for(File file : list) {
			if(file.isFile() 
					&& file.getName().toLowerCase().endsWith(".mp3")) {
				System.out.printf("[%03d]%s%n", n, file.getName());
				n++;
			}
		}
	}
}
