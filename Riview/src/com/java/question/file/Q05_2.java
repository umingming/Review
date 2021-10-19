package com.java.question.file;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class Q05 {

	public static void main(String[] args) {
		/*
		�̹��� ������ Ȯ���ں��� �ִ�. �� ���� �ִ��� ���ÿ�.
		
		����>
		1. Ȯ���ں� ī��Ʈ ������ ��η� File ��ü ����
		2. File �迭 ����
		3. HashMap ��ü ���� 
		4. gif, jpg, png, bmp�� count ���� ���� �� 0���� �ʱ�ȭ
		5. for�� �迭�� ����
			>if�� ��������?
				>Ȯ���� ���� ���� �� ������ Ȯ���ڸ� ����
				>switch�� Ȯ����?
					>Ȯ���ں� ���̽��� ������ �� �߰���.
						>key: Ȯ����, value: ++count
				>key�� Ȯ����, value�� count�� �߰�.
		6. HashMap key Ž���ϱ� ���ؼ� Set ��ü ����
		7. ���� for�� key���� ���� ���
			>printf�̿��� Ȯ���ں� count ���
		 */
		
		File dir = new File("C:\\java\\file\\����_���丮_����\\Ȯ���ں� ī��Ʈ");
		File[] list = dir.listFiles();
		HashMap<String,Integer> map = new HashMap<String,Integer>(4);
		
		int gifCount = 0;
		int jpgCount = 0;
		int pngCount = 0;
		int bmpCount = 0;
		
		for(int i=0; i<list.length; i++) {
			if(list[i].isFile()) {
				String extention = list[i].getName().substring(list[i].getName().lastIndexOf("."));
				
				switch(extention) {
				case ".gif" : 
					map.put(extention, ++gifCount);
					break;
				case ".jpg" : 
					map.put(extention, ++jpgCount);
					break;
				case ".png" : 
					map.put(extention, ++pngCount);
					break;
				case ".bmp" : 
					map.put(extention, ++bmpCount);
					break;
				}
			}
		}
		
		Set<String> set = map.keySet();
		for(String key : set) {
			System.out.printf("*%s : %d��%n", key, map.get(key));
		}
	}
}
