package com.review.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception{
		/*
		1. BufferedReader
		2. 문장 입력
		3. 역순 결과
		4. for문 
			>charAt(str.length-1-i) 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("문장 입력 : ");
		String str = reader.readLine();
		
		System.out.print("결과 출력 : ");
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(str.length()-1-i));
		}

	}

}
