package com.review.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws Exception{
		/*
		컴퓨터가 1~10 사이의 숫자 1개를 생각하면 사용자가 맞추는 프로그램 구현하시오.
		
		1. BufferedReader
		2. Math.random() 메소드 이용해 1~10 중 하나 저장
		3. 멘트 출력
		4. sum 변수 선언
		5. while문 무한루프
			>숫자 입력
			>if문 숫자 == random? O/X출력
			>sum++
		6. 종료 멘트
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int random = (int)(Math.random() * 10) + 1;
		
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
		
		int sum = 0;
		
		while(true) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			sum++;
			
			if(num == random) {
				System.out.println("맞췄습니다.");
				break;
			} else {
				System.out.println("틀렸습니다.");
			}
			
		}
		
		
		System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.%n", random);
		System.out.printf("정답을 맞추는데 시도한 횟수는 %d입니다.%n%n", sum);
		System.out.println("프로그램을 종료합니다.");
		
	}

}
