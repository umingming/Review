package com.review.file;

import java.io.File;
import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
		특정 폴더의 특정 파일만을 출력하시오.
		1. Scanner
		2. 폴더와 확장자를 입력 받음.
		3. 해당 폴더의 경로를 참조하는 File 객체 생성
		4. File 배열을 폴더의 목록으로 초기화함.
		5. 향상된 for문 File 배열 반복
			>index 변수 선언 후 "."의 위치로 값을 초기화함.
			>if문 입력 받은 확장자와 같은지?
				>대소문자 구분 없이
				>파일의 이름 출력함.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("폴더 선택 : ");
		String path = scan.nextLine();
		System.out.println("파일 확장자 : ");
		String inputExtention = scan.nextLine();
		
		File dir = new File(path);
		File[] files = dir.listFiles();
		
		for(File file : files) {
//			int index = file.getName().lastIndexOf(".");
//			String extention = file.getName().substring(index + 1);
//			if(extention.equals(inputExtention)) {
				System.out.println(file.getName());
//			}
		}
	}

}
