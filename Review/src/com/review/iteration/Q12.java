package com.review.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q12 {

	public static void main(String[] args) throws Exception{
		/*
		숫자를 10개 입력 받아 한글로 변환 후 출력하시오.
		-2자리 이상 숫자를 입력하면 결과없이 프로그램을 중지시키시오.
		
		1. 숫자->한글 메소드 생성
			>switch문으로
		2. BufferedReader
		3. 루프, result 변수 생성
		4. while문 10번 반복
			>숫자 입력
			>if문 2글자인지? 
				>아니면 한글메소드로 변경후 result에 저장
				>맞으면 break;
			>n++
		5. 결과 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int n = 0;
		String result = "";
		
		while (n<10) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());

			if(num >= 10) {
				break;
			} else {
				result += setKor(num);
			}
			
			n++;
		}

		if(result.length() == 10) {
			System.out.printf("결과 : %s", result);
		}
	}

	private static String setKor(int num) {
		switch(num) {
		case 1 : return "일";
		case 2 : return "이";
		case 3 : return "삼";
		case 4 : return "사";
		case 5 : return "오";
		case 6 : return "육";
		case 7 : return "칠";
		case 8 : return "팔";
		case 9 : return "구";
		default : return "공";
		}
		
	}

}
