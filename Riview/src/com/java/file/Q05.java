package com.java.file;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class Q05 {

	public static void main(String[] args) {
		/*
		이미지 파일이 확장자별로 있다. 몇 개씩 있는지 세시오.
		
		설계>
		1. 확장자별 카운트 폴더의 경로로 File 객체 생성
		2. File 배열 선언
		3. HashMap 객체 생성 
		4. gif, jpg, png, bmp의 count 변수 선언 후 0으로 초기화
		5. for문 배열의 길이
			>if문 파일인지?
				>확장자 변수 선언 후 파일의 확장자명 저장
				>switch문 확장자?
					>확장자별 케이스로 데이터 값 추가함.
						>key: 확장자, value: ++count
				>key는 확장자, value는 count로 추가.
		6. HashMap key 탐색하기 위해서 Set 객체 생성
		7. 향상된 for문 key값을 변수 사용
			>printf이용해 확장자별 count 출력
		 */
		
		File dir = new File("C:\\java\\file\\파일_디렉토리_문제\\확장자별 카운트");
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
			System.out.printf("*%s : %d개%n", key, count.get(key));
		}
	}

	private static String getExtension(String name) {
		int index = name.lastIndexOf(".");
		return name.substring(index).toLowerCase();
	}
}
