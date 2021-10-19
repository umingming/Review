package com.java.question.file;

import java.io.File;
import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		Ư�� ������ ��θ� �Է� �޾� ������ ����Ͻÿ�.
		-���� ũ�� ���� ��ȯ ���(1024����)
		
		����>
		1. Scanner
		2. String ���� ���� �� �Է� ����
		3. File ��ü�� ���� 
		4. if �����ϴ� "����"����?
			>���ϸ� ��� getName()
			>���� ��� subString()
			>size ������ overThousand�޼ҵ��� ���� ������ �ʱ�ȭ
			>swtich�� count
			>0~4 -> B~TB ��ȯ
			>size ��½� �Ҽ����� 1�ڸ���
		5. void overThousand
			>count static ���� ����
			>while (size > 1000)
				>size/1024
				>count++
			>size�� ������.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ��� : ");
		String path = scan.nextLine();
		File file = new File(path);
		
		if(file.exists() && file.isFile()) {
			String fileName = file.getName();
			System.out.printf("���ϸ� :%s%n", fileName);
			System.out.printf("���� :%s ����%n", fileName.substring(fileName.indexOf(".") + 1));
			
			double sizeNum = overthousand(file.length());
			String sizeStr = "";
			
			switch (count) {
			case 0 : sizeStr = "B"; break;
			case 1 : sizeStr = "KB"; break;
			case 2 : sizeStr = "MB"; break;
			case 3 : sizeStr = "GB"; break;
			case 4 : sizeStr = "TB"; break;
			}
			
			System.out.printf("���� ũ�� : %.1f%s%n", sizeNum, sizeStr);
		} else {
			System.out.println("�߸��� ���� ����Դϴ�.");
		}

	}
	
	private static int count;
	
	private static double overthousand(double size){
		while(size > 1000) {
			size /= 1024;
			count++;
		}	
		return size;
	}
}
