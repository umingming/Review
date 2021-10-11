package com.java.method.scanner;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		/*
		5!를 출력해보자.
		
		설계>
		1. 메인 메소드
			>int 변수 선언 후 원하는 값(5)으로 초기화
			>int 변수 선언 후 num을 매개값으로 하는 factorial메소드로 초기화
		2. factorial; int를 리턴함
			>if문 1인가? 리턴
				>1이 아니면 n*factorial(n-1)실행
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요. >");
		int n = scan.nextInt();
		int result = factorial(n);
		
		System.out.println(result);

	}

	private static int factorial(int n) {
		if(n == 1) {
			System.out.print(n + "=");
			return n;
		} else {
			System.out.print(n + "*");
			return n * factorial(n-1);
		}
	}

}
