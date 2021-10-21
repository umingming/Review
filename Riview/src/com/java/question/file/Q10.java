package com.java.question.file;

import java.io.File;

public class Q10 {

	public static void main(String[] args) {
		/*
		�� ���ϵ��� �Ʒ��� ���ǿ� ���� ������ ������ �����Ͻÿ�.
		-1�� : ���� �̸� ���� ����
		-2�� : �⵵���� ���� ����
		-3�� : �� ������ ���� > �⵵ ������ �̵�
		
		����>
		1. ������ ��θ� �����ϴ� File ��ü ����
		2. ��ü�� ����� �迭 ����
		3. for�� ��ü �ݺ�
			>���ο� ��� ���� �� �� ��ο� �̸�, �⵵ �߰�
			>substring���� ��ο� �̸� �߰�
			>�� ��θ� �����ϴ� ���� ���� �� mkdirs�� ���丮 �����
			>�� ��ο� ���ϸ� �߰�
			>��θ� �����ϴ� ��ü ����� ���� �̵���.
		 */
		
		String path = "C:\\java\\file\\����_���丮_����\\����";
		File dir = new File(path);
		File[] file = dir.listFiles();
		
		for(int i=0; i<file.length; i++) {
			String newPath = String.format("%s\\%s\\%s",
						path,
						file[i].getName().substring(0,3),
						file[i].getName().substring(4,8));
					
			File newDir = new File(newPath);
			newDir.mkdirs();
			
			newPath += file[i].getName();
			File newFile = new File(newPath);
			file[i].renameTo(newFile);
		}
		
		System.out.println("�з��� �Ϸ�Ǿ����ϴ�.");

	}

}
