package com.java.question.file;

import java.io.File;
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		Ư�� ������ �̵��ϰ�, �ߺ��Ǵ� ��츦 ó���Ͻÿ�.
		
		����>
		1. Scanner
		2. AAA, BBB�� test.txt�� �����ϴ� ���� ��ü ����
		3. if �����ϴ���?
			>���� �̵��� �����Ѵٴ� ��Ʈ ���
			>if ���� �̵��� �Ǵ���? renameTo() ���
				>�̵� �Ϸ�
			>�� �Ǹ� ���� �̸��� �����Ѵٰ� �˸��� ���� ���� ���.
				>String ���� ���� �� nextLine()���� �Է� ����.
				>if�� y����? 
					>���� ���� �� rename
				>n�̸� �۾� ���
		 */
		Scanner scan = new Scanner(System.in);
		
		File originFile = new File("C:\\java\\AAA\\data.txt");
		File newFile = new File("C:\\java\\BBB\\data.txt");
		
		if(originFile.exists()) {
			System.out.println("���� �̵��� �����մϴ�.");
			if(originFile.renameTo(newFile)) {
				System.out.println("���� �̵� �Ϸ�");
			} else {
				System.out.println("���� �̸��� ������ ������ �̹� �����մϴ�.\r\n������?(y/n)");
				String select = scan.nextLine();
				
				if(select.equals("y")) {
					newFile.delete();
					originFile.renameTo(newFile);
					System.out.println("y. ������ �������ϴ�.");
				} else if(select.equals("n")) {
					System.out.println("n. �۾��� ����մϴ�.");
				}
			}
		} else {
			System.out.println("�������� �ʴ� �����Դϴ�.");
		}
	}
}
