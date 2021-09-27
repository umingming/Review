package com.review.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {
	public static void main(String[] args) throws Exception {
		/*
		숫자를 입력 받아 짝수와 홀수의 합을 각각 출력하시오. 
		-입력 받을 숫자의 개수도 입력 받기
		-천단위 출력
		
		설계>
		1. BufferedReader
		2. 수 입력
		3. 루프, 짝수, 홀수 변수
		4. while문 입력 받은 숫자만큼
			>숫자 입력
			>if문 홀수인지 짝수인지에 따라 변수 += num
			>n++;
		5. 결과 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("입력 받을 숫자의 개수 : ");
		int input = Integer.parseInt(reader.readLine());

		int n = 0, even = 0, odd = 0;
		
		while(n < input) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());

			if(num % 2 == 0){
				even += num;
			} else {
				odd += num;
			}
			
			n++;
		}
		
		System.out.printf("짝수의 합 : %,d%n", even);
		System.out.printf("홀수의 합 : %,d%n", odd);
	}

}
