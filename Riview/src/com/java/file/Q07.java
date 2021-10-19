package com.java.file;

import java.io.File;
import java.util.ArrayList;

public class Q07 {

	public static void main(String[] args) {
		/*
		���� ��� �����ϴ� ���ϸ��� ����Ͻÿ�
		
		����>
		1. musicA,B�� ��η� �ϴ� File ��ü ����
		2. 1�� ��ü�� �̿��Ͽ� File �迭 ����
		3. String�� �Ű��� �ϴ� ArrayList ��ü ����(����, A, B)
		4. for�� musicA �迭 �ݺ�
			>A��ü�� ����� ������ �߰�
		5. for�� musicB �迭 �ݺ�
			>boolean �ߺ� Ȯ�� ���� ���� �� false�� �ʱ�ȭ
			>for�� musicA �迭 �ݺ�
				>if�� B�� i��° �̸��� A�� j��° �̸��� ������?
					>�ߺ� ������ true ����
			>if A�� �ߺ��Ǵ� �̸�����?
				>���� ��ü�� ����� ������ �߰�
				>A ��ü�� j��° ����� ������ ����
			>���� ������ B��ü�� ����� ������ �߰�
		6. for�� ���� ��ü ���� �ݺ�
			>get�޼ҵ�� ���
		 */

		File dirA = new File("C:\\java\\file\\����_���丮_����\\���� ����\\MusicA");
		File dirB = new File("C:\\java\\file\\����_���丮_����\\���� ����\\MusicB");
		File[] listA = dirA.listFiles();
		File[] listB = dirB.listFiles();
		
		ArrayList<String> common = new ArrayList<String>();
		ArrayList<String> onlyA = new ArrayList<String>();
		ArrayList<String> onlyB = new ArrayList<String>();
		
		for(File fileA : listA) {
			
			boolean flag = false;
			
			for(File fileB : listB) {
				if(fileA.getName().equals(fileB.getName())) {
					flag = true;
					System.out.println(fileA.getName());
				}
			}
		}
		
		for(int i=0; i<listB.length; i++) {
			boolean isDuplicate = false;
			String name = listB[i].getName();
			
			for(int j=0; j<listA.length; j++) {
				if(name.equals(listA[j].getName())) {
					isDuplicate = true;
				}
			}

			if(isDuplicate) {
				common.add(name);
				onlyA.remove(onlyA.indexOf(name));
			}else {
				onlyB.add(name);
			}
		}
		
		System.out.println("========��� �����ϴ� ����========");
		for(int i=0; i<common.size(); i++) {
			System.out.println(common.get(i));
		}
		
		System.out.println("========A���� �����ϴ� ����========");
		for(int i=0; i<onlyA.size(); i++) {
			System.out.println(onlyA.get(i));
		}
		
		System.out.println("========B���� �����ϴ� ����========");
		for(int i=0; i<onlyB.size(); i++) {
			System.out.println(onlyB.get(i));
		}
		
	}
}
