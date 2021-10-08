package com.review.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws Exception {
		/*
		숫자 1개를 입력 받아 1부터 입력한 숫자까지의 합을 출력하시오.
		-천단위 출력
		
		설계>
		1. BufferedReader
		2. 숫자 입력
		3. 루프, sum 변수 선언
		4. while문 입력 받은 숫자 까지
			>sum+=n
		5. sum 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자 : ");
		int num = Integer.parseInt(reader.readLine());

		int n = 1;
		int sum = 0;
		
		while(n<=num) {
			sum += n;
			n++;
		}
		
		System.out.printf("1 ~ %,d = %,d%n", num, sum);
	}

}
