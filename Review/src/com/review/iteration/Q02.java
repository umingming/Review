package com.review.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception{
		/*
		숫자 2개를 입력 받아 시작 숫자에서 종료 숫자까지 증가치만큼 증가하며 출력함.
		
		설계>
		1. BufferedReader
		2. 두 숫자, 증가치 입력
		3. 루프 변수 선언
		4. while문 종료 숫자까지 반복
			>증가치
			>숫자 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("시작 숫자 : ");
		int start = Integer.parseInt(reader.readLine());

		System.out.print("종료 숫자 : ");
		int end = Integer.parseInt(reader.readLine());

		System.out.print("증가치 : ");
		int add = Integer.parseInt(reader.readLine());
		
		int n = start;
		
		while(n<=end) {
			System.out.println(n);
			n += add;
		}

	}

}
