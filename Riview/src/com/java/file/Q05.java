package com.java.file;

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
		HashMap<String,Integer> count = new HashMap<String,Integer>(4);
		
		for(File file : list) {
			if(file.isFile()) {
				String ext = getExtension(file.getName());
				
				if(!count.containsKey(ext)) {
					count.put(ext, 1);
				} else {
					count.put(ext, count.get(ext) + 1);
				}
			}
		}
		
		Set<String> set = count.keySet();
		for(String key : set) {
			System.out.printf("*%s : %d��%n", key, count.get(key));
		}
	}

	private static String getExtension(String name) {
		int index = name.lastIndexOf(".");
		return name.substring(index).toLowerCase();
	}
}
