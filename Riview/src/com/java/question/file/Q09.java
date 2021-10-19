package com.java.question.file;

import java.io.File;
import java.util.ArrayList;

public class Q09 {

	public static void main(String[] args) {
		/*
		��� ���� ���� ���ϵ��� �ѹ��� ũ�⸦ ���ϰ� ũ�Ⱑ ū ������ ����
		
		����>
		1. ũ�� ���� ���丮�� ��η� �ϴ� File ��ü ����
		2. File�� �Ű��� �ϴ� ArrayList ��ü ����
		3. addFile, bubbleFile �޼ҵ� ȣ��
		4. addFile �޼ҵ� 
			>File ��ü�� File �迭 ����
			>���� for������ �迭 �ݺ�
				>if file�ΰ�?
					>ArrayList�� ����
			>���� for������ �迭 �ݺ�
				>if dir�ΰ�?
					>addFile �޼ҵ� ȣ��
		5. bubbleFile�޼ҵ� 
			>for�� ArrayList�� ũ�� -1 �ݺ�
				>for�� ArrayList�� ũ�� -1 -i �ݺ�
					>if j�� j+1��° ��Һ��� ū��?
						>temp File ������ j��° ��� ����
						>set�޼ҵ�� j��°�� j+1, j+1�� temp�� ����
		6. for�� ArrayList ��ü �ݺ�
			>���ϸ�, ũ��, ���� ���
				>ũŰ�� KB�� �ٲ� ��.
		 */
		
		File dir = new File("C:\\java\\file\\����_���丮_����\\ũ�� ����");
		ArrayList<File> file = new ArrayList<File>();
		
		addFile(dir, file);
		bubbleFile(file);
		
		System.out.println("[���ϸ�]\t[ũ��]\t[������ ����ִ� ����]");
		for(int i=0; i<file.size(); i++) {
			System.out.printf("%s\t%.1fKB\t%s%n", 
					file.get(i).getName(), 
					((double)file.get(i).length()/1024), 
					file.get(i).getParent().substring(file.get(i).getParent().lastIndexOf("\\")+1));
		}

	}

	private static void bubbleFile(ArrayList<File> file) {
		for(int i=0; i<file.size()-1; i++) {
			for(int j=0; j<file.size()-1-i; j++) {
				if(file.get(j).length() < file.get(j+1).length()) {
					File temp = file.get(j);
					file.set(j, file.get(j+1));
					file.set(j+1, temp);
				}
			}
		}
	}

	private static void addFile(File dir, ArrayList<File> file) {
		File[] list = dir.listFiles();
		for(File subfile : list) {
			if(subfile.isFile()) {
				file.add(subfile);
			}
		}
		for(File subdir : list) {
			if(subdir.isDirectory()) {
				addFile(subdir, file);
			}
		}
	}
}
