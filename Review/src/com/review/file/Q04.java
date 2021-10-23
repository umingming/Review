package com.review.file;

import java.io.File;

public class Q04 {

	public static void main(String[] args) {
		/*
		음악 파일이 100개 있다. 파일명 앞에 일련 번호를 붙이시오.
		
		설계>
		1. 음악 파일을 경로로 하는 File 객체 생성
		2. file의 목록으로 File 배열 선언
		3. 향상된 for문 배열 반복
			>파일명을 출력할 때 일련 번호를 부여함.
		 */
		
		File dir = new File(Path.Q04);
		File[] files = dir.listFiles();
		
		for(int i=0; i<files.length; i++) {
			System.out.printf("[%03d]%s%n", i+1, files[i].getName());
		}

	}

}
