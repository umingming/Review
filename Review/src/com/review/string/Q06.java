package com.review.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws Exception{
		/*
		설계>
		1. BufferedReader
		2. 숫자 입력
		3. resutl 변수 선언
		4. for
			>if문 length-1-i % 3 == 2 > 앞에 , 붙여서 result에 저장
				>아니면 그냥 저장
		5. 결과 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자 : ");
		String num = reader.readLine();
		String result = "";
		
		for(int i=0; i<num.length(); i++) {
			if(i % 3 == num.length() % 3) {
				result += "," +num.charAt(i);
			} else {
				result += num.charAt(i);
			}
		}
		
		System.out.println(result);
	}

}
