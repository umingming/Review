package com.java.question.file;

import java.io.File;

public class Q06 {
	/*
	������ ũ�Ⱑ 0byte�� �����Ͻÿ�.
	
	����>
	1. ���� ���� ���丮�� ��θ� �����ϴ� File ��ü ����
	2. listFiles�� File �迭 ����
	3. Count ���� ����
	4. for�� �迭 �ݺ�
		>if 0byte ��������?
			>delete
	5. �� �� �����ߴ��� ���
	 */
	
	File dir = new File("C:\\java\\file\\����_���丮_����\\���� ����");
	File[] list = dir.listFiles();
	int count = 0;
	
	for(int i=0; i<list.length; i++) {
		if(list[i].isFile() && list[i].length() == 0) {
			list[i].delete();
			count++;
		}
	}
	
	System.out.printf("�� %d���� ������ �����߽��ϴ�.%n", count);

}
