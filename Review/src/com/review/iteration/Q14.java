package com.review.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q14 {

	public static void main(String[] args) throws Exception{
		/*
		최대 9자리의 정수를 입력 받아 각자리의 홀수 숫자합과 짝수 숫자함을 구하시오.
		-9자리가 넘어가면 동작 금지
		
		설계>
		1. BufferedReader
		2. 숫자 입력
		3. 홀수, 짝수, 루프 변수 선언
		4. 9자리 숫자인지 확인하는 메소드 생성
			>루프 변수 선언
			>if문 길이가 <= 9
			>while문 9
				charAt이 0~9인지?
				맞아야 true 리턴
			>그 외는 false
		5. if문 올바른 숫자?
			>while문 length까지
				>if문 charAt(i) 홀짝? 해당 변수에 저장
			>결과 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("9자리 숫자 입력 : ");
		String input = reader.readLine();
		
		int even = 0, odd = 0, n = 0;
		
		if(isRightNumber(input)) {
			while(n<input.length()) {
				if(input.charAt(n) % 2 == 0) {
					even += Integer.parseInt(input.charAt(n)+"");
				} else {
					odd += Integer.parseInt(input.charAt(n)+"");
				}
				n++;
			}
			System.out.println("짝수의 합 : " + even);
			System.out.println("홀수의 합 : " + odd);
		}

		

	}

	private static boolean isRightNumber(String input) {
		if(input.length() <= 9) {
			int n = 0;
			while(n<input.length()) {
				if(input.charAt(n) < '0' || input.charAt(n) > '9') {
					return false;
				}
				n++;
			}
			return true;
		}
		return false;
	}

}
