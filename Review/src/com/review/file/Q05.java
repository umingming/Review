package com.review.file;

import java.io.File;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Q05 {

	public static void main(String[] args) {
		/*
		이미지 파일이 확장자별로 있다. 확장자 별로 파일이 몇개 있는지 세시오.
		>HashMap 이용
		
		설계>
		1. 이미지파일의 경로를 참조하는 File 객체 생성
		2. file의 목록으로 배열을 초기화함.
		3. Stirng과 Integer를 참조하는 HashMap 객체 생성
		4. 향상된 for문 배열 반복
			>index는 확장자를 구분하기 위한 "." 위치 값으로 초기화함.
			>index와 getName을 이용해 확장자 변수를 선언함.
			>if "확장자"를 key로 하는 값이 있는지?
				>기존 값에 +1함
				>없으면 1을 넣음.
		5. key 목록을 가진 Set 객체 생성
		6. 향상된 for문 set 반복
			>key와 값을 출력함.
		 */
		
		File dir = new File(Path.Q05);
		File[] files = dir.listFiles();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(File file : files) {
			int index = file.getName().lastIndexOf(".");
			String extention = file.getName().substring(index);
			if(map.containsKey(extention)) {
				map.put(extention, map.get(extention) + 1);
			} else {
				map.put(extention, 1);
			}
		}
		
		Set<Entry<String, Integer>> set = map.entrySet();
		
		for(Entry key : set) {
			System.out.println(key);
		}
		

	}

}
