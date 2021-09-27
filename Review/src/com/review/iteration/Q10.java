package com.review.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10 {

	public static void main(String[] args) throws Exception{
		/*
		숫자 N개를 입력 받아 아래와 같이 출력하시오.
		4 - 7 + .. - 15 + 12 = 1XX
		-루프를 종료할 누적값을 사용자가 입력
		-짝수는 더하고 홀수는 빼기

		설계>
		1. BufferedReader
		2. 종료값 입력
		3. sum, process 변수 선언
		4. while문 종료값까지
			>숫자 입력
			>if문 짝홀? 결과에 따라 sum,process +/-= num
		5. if문 substring(2)가 양수인지 음수인지
			>양수면 indexOf로 + 다다음부터 출력
			>음수면 그냥 출력
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("루프를 종료할 누적값 : ");
		int over = Integer.parseInt(reader.readLine());
		
		int sum = 0;
		String process = "";
		
		while(sum<over) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			
			if(num % 2 == 0) {
				sum += num;
				process += " + " + num;
			} else {
				sum -= num;
				process += " - " + num;
			}
		}
		if(process.trim().substring(0).equals("+")) {
			System.out.printf("%s = %d%n", process.trim().substring(1), sum);
		} else {
			System.out.printf("%s = %d%n", process.trim().substring(0), sum);
		}
	}
}
