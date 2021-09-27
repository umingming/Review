package com.review.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws Exception{
		/*
		1 - 2 + 3 - ... - 10 = -5
		-시작과 종료 숫자를 사용자에게 입력 받아 출력
		
		설계>
		1. BufferedReader
		2. 시작과 종료 숫자 입력
		3. n, sum, process 변수 선언
		4. while문 종료 숫자까지
			>if문 start % 2 == n % 2 ?
				>true면 sum, process += num
				>false면 sum, process -= num
			>n++
		5. substring과 indexOf로 시작 숫자부터 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("시작 숫자 : ");
		int start = Integer.parseInt(reader.readLine());

		System.out.print("종료 숫자 : ");
		int end = Integer.parseInt(reader.readLine());

		int n = start, sum = 0;
		String process = "";
		
		while(n<=end) {
			if(start % 2 == n % 2) {
				sum += n;
				process += " + " + n;
			} else {
				sum -= n;
				process += " - " + n;
			}
			n++;
		}
		
		System.out.printf("%s = %d%n", process.substring(process.indexOf(start+"")), sum);
	}

}
