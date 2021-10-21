package com.java.question.file;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
		Ư�� ������ Ư�� ���ϸ��� ����Ͻÿ�.
		-Ȯ���� ��ҹ��� ���о���
		
		����>
		1. Scanner
		2. ������ Ȯ���� ���� ���� �� �Էµ� ������ �ʱ�ȭ��.
		3. ���� ��θ� ������ File ��ü ����.
		4. listFiles()�� File �迭 ������.
		5. for������ �迭 �ݺ�
			>if�� �ش� ������ �Է� ���� Ȯ���ڿ� ��ġ�ϴ���?
				>���ϸ� �����.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� : ");
		String path = scan.nextLine();
		System.out.print("���� Ȯ���� : ");
		String extention = scan.nextLine();
		
		File dir = new File(path);
		File[] list = dir.listFiles();
		
		for(int i=0; i<list.length; i++) {
			String name = list[i].getName();
			if(list[i].isFile() && 
					(name.substring(name.lastIndexOf(".") + 1).equalsIgnoreCase(extention))){
				System.out.print(name);
			}
		}
	}

}
