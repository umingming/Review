package com.review.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception{
		/*
		1 + 2 + 3 + 4 + .. + 10 = 55
		-시작과 종료 숫자를 사용자에게 입력 받아 출력하시오.
		
		설계>
		1. BufferedReader
		2. 시작과 종료 숫자 입력
		3. 루프, process, sum 변수 선언
		4. while문 종료 까지
			>process, sum += n
			>n++
		5. process.substring으로 숫자부터 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("시작 숫자 : ");
		int start = Integer.parseInt(reader.readLine());

		System.out.print("종료 숫자 : ");
		int end = Integer.parseInt(reader.readLine());

		int n = start, sum = 0;
		String process = "";
		
		while(n<=end) {
			process += " + " + n;
			sum += n;
			n++;
		}
		
		System.out.printf("%s = %d", process.substring(process.indexOf(start+"")), sum);
	}

}
