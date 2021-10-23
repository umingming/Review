package com.review.file;

import java.io.File;

public class Q06 {
	
	public static void main(String[] args) {
		/*
		0byte 파일만 삭제하시오.
		
		설계>
		1. 파일 제거를 경로로 하는 File 객체 생성
		2. File 목록으로 File 배열 선언함.
		3. count를 확인할 int 변수 선언
		4. 향상된 for문 배열 반복
			>if 크키가 0인지?
				>삭제함, count++
		5. count 출력함.
		 */
		
		File dir = new File(Path.Q06);
		File[] files = dir.listFiles();
		int count = 0;
		
		for(File file : files) {
			if(file.length() == 0) {
				file.delete();
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}

}
