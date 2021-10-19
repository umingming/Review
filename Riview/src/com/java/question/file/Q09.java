package com.java.question.file;

import java.io.File;
import java.util.ArrayList;

public class Q09 {

	public static void main(String[] args) {
		/*
		��� ���� ���� ���ϵ��� �ѹ��� ũ�⸦ ���ϰ� ũ�Ⱑ ū ������ ����
		
		����>
		1. ũ�� ���� ���丮�� ��η� �ϴ� File ��ü ����
		2. ��ü�� �̿��� File �迭 ����
		3. File�� �Ű��� �ϴ� ArrayList ��ü ����
		4. for�� �迭 �ݺ�
			>ArrayList�� �迭�� ��� �߰�
		5. for�� ArrayList�� ũ�� -1 �ݺ�
			>for�� ArrayList�� ũ�� -1 -i �ݺ�
				>if j�� j+1��° ��Һ��� ū��?
					>temp File ������ j��° ��� ����
					>set�޼ҵ�� j��°�� j+1, j+1�� temp�� ����
		6. for�� ArrayList ��ü �ݺ�
			>���ϸ�, ũ��, ���� ���
		 */
		
		File dir = new File("C:\\java\\file\\����_���丮_����\\ũ�� ����");
		File[] list = dir.listFiles();
		
		ArrayList<File> file = new ArrayList<File>();
		
		for(int i=0; i<list.length; i++) {
			file.add(list[i]);
		}
		
		for(int i=0; i<file.size()-1; i++) {
			for(int j=0; j<file.size()-1-i; j++) {
				if(file.get(j).length() < file.get(j+1).length()) {
					File temp = file.get(j);
					file.set(j, file.get(j+1));
					file.set(j+1, temp);
				}
			}
		}
		
		for(int i=0; i<file.size(); i++) {
			System.out.printf("%s\t%.1fKB\t%s%n", 
					file.get(i).getName(), 
					((double)file.get(i).length()/1024), 
					file.get(i).getParent());
		}
		

	}

}
