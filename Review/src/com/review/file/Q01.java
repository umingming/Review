package com.review.file;

import java.io.File;
import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		특정 파일의 경로를 입력 받아 정보를 출력하시오.
		
		설계>
		1. Scanner
		2. String path 변수에 경로 입력 받기
		3. 확장자 구분을 위해 int 변수 선언 후 lastIndexOf(".")의 값을 초기화함.
		4. paht를 참조하는 File 객체 생성
		5. 파일명, 종류, 파일 크기를 출력함(B) 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("파일 경로 : ");
		String path = scan.nextLine();
		
		File file = new File(path);
		int index = file.getName().lastIndexOf(".");

		System.out.printf("파일명 : %s%n", file.getName());
		System.out.printf("종류 : %s 파일%n", file.getName().substring(index + 1));
		System.out.printf("파일 크기 : %,dB%n", file.length());

	}

}
