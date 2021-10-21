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
		4. for�� �迭�� ����
			>if ��������?
				>Ȯ���� ���� ���� �� ������ Ȯ���ڸ� ����
				>if Ȯ���ڸ� key�� �ϴ� value�� ������?
					>1�� HashMap�� �߰���
					>������ Ȯ���ڿ� ���� value���� 1�� ���� �߰���.
		5. HashMap key Ž���ϱ� ���ؼ� Set ��ü ����
		6. ���� for�� key���� ���� ���
			>printf�̿��� Ȯ���ں� count ���
		 */
		
		File dir = new File("C:\\java\\file\\����_���丮_����\\Ȯ���ں� ī��Ʈ");
		File[] list = dir.listFiles();
		HashMap<String,Integer> map = new HashMap<String,Integer>(4);
		
		for(int i=0; i<list.length; i++) {
			if(list[i].isFile()) {
				String extention = list[i].getName().substring(list[i].getName().lastIndexOf("."));
				
				if(!map.containsKey(extention)) {
					map.put(extention, 1);
				} else {
					map.put(extention, map.get(extention) + 1);
				}
			}
		}
		
		Set<String> set = map.keySet();
		for(String key : set) {
			System.out.printf("*%s : %d��%n", key, map.get(key));
		}
	}
}
