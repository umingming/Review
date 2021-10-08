package com.review.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception{
		/*
		설계>
		1. BufferedReader
		2. 이메일 주소 입력
		3. 아이디 출력 @전까지
		4. 도메인 출력 @후
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이메일 : ");
		String email = reader.readLine();

		System.out.printf("아이디 : %s", email.substring(0, email.lastIndexOf("@")));
		System.out.printf("도메인 : %s", email.substring(email.lastIndexOf("@")+1));

	}

}
