package com.review.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws Exception{
		/*
		1 + 2 + 3 + 4 + 5 + ... + XX = 10XX
		-루프를 종료할 누적값을 사용자가 입력
		
		설계>
		1. BufferedReader
		2. 종료값 입력
		3. n, sum, process 
		4. do while문 sum < 1000
			>sum, process += n
			>n++
		5. substring, indexOf로 1부터 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("루프를 종료할 누적값 : ");
		int over = Integer.parseInt(reader.readLine());
		
		int n = 1, sum = 0;
		String process = "";
		
		do {
			sum += n;
			process += " + " + n;
			n++;
		}while(sum<over);
		
		System.out.printf("%s = %d",process.substring(process.indexOf(1+"")), sum);
		
		
			

		

	}

}
