package com.review.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception {
		/*
		1. BufferedReader.
		2. 학생 수 이름 입력
		3. 입력 받은 수를 길이로 하는 String 배열 선언
		4. for문 학생 수
			>학생명 입력 받음
		5. 학생 수 출력
		6. for문 학생 수
			>배열 거꾸로 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("학생 수 : ");
		int students = Integer.parseInt(reader.readLine());

		String[] names = new String[students];
		
		for(int i=0; i<names.length; i++) {
			System.out.print("학생명 : ");
			names[i] = reader.readLine();
		}
		
		System.out.printf("입력한 학생은 총 %d명 입니다.%n", names.length);
		
		for(int i=0; i<names.length; i++) {
			System.out.printf("%d. %s%n", i+1, names[names.length-1-i]);
		}

	}

}
