package com.review.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception{
		/*
		사용자의 이름과 인사할 횟수를 입력 받아 출력하시오
		
		설계>
		1. BufferedReader
		2. 이름, 횟수 입력
		3. 루프 변수 선언
		4. while문 횟수 반복
			>이름님 안녕하세요~ 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이름 : ");
		String name = reader.readLine();

		System.out.print("횟수 : ");
		int num = Integer.parseInt(reader.readLine());

		int n = 0;
		
		while(n++<num) {
			System.out.printf("%s님 안녕하세요~%n", name);
		}
	}

}
