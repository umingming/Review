package com.java.question.file;

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
		
		for(int i=0; i<list.length; i++) {
			System.out.printf("[%03d]%s%n", i+1, list[i].getName());
		}
	}
}
