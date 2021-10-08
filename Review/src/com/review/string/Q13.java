package com.review.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q13 {

	public static void main(String[] args) throws Exception{
		/*
		1. BufferedReader
		2. 입력
		3. count 변수 선언
		4. if문 금지어? replace
		5. 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("입력 : ");
		String input = reader.readLine();

		String ban1 = "멍청이";
		String ban2 = "바보";
		int count = 0;
		
		if(input.indexOf(ban1) != -1) {
			count++;
			input = input.replace(ban1, "***");
		}
		
		if(input.indexOf(ban2) != -1) {
			count++;
			input = input.replace(ban2, "**");
		}
		
		System.out.println(input + count);

	}

}
