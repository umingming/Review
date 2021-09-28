package com.review.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q19 {

	public static void main(String[] args) throws Exception{
		/*
		숫자를 2개 입력 받아 각각의 약수와 두 숫자의 공약수를 구하시오
		
		설계>
		1. BufferedReader
		2. 숫자 입력
		3. low, n, divisor 선언
		4. for문 n <= num1, num2
			>if문 num1 % n == 0? divisor += n
		5. for문 n <= low
			>if문 num1 % n == 0 && num2 % n == 0? divisor += n
		6. 결과 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫번째 숫자 : ");
		int num1 = Integer.parseInt(reader.readLine());

		System.out.print("두번째 숫자 : ");
		int num2 = Integer.parseInt(reader.readLine());
		
		int low = (num1 > num2) ? num2 : num1;
		int n = 1;
		String divisor1 = "", divisor2 = "", commonDivi = "";
		
		while(n<=num1) {
			divisor1 += (num1 % n == 0)? ", " + n : "" ;
			n++;
		}

		n = 1;
		while(n<=num2) {
			divisor2 += (num2 % n == 0)? ", " + n : "" ;
			n++;
		}
		
		n = 1;
		while(n<=low) {
			commonDivi += (num1 % n == 0) && (num2 % n ==0)? ", " + n : "" ;
			n++;
		}
		
		System.out.println(divisor1);
		System.out.println(divisor2);
		System.out.println(commonDivi);
	}

}
