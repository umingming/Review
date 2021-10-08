package com.java.method.scanner;

import java.util.Scanner;

public class Check {
	public static void main(String[] args) {
		/*
		scanner next에 대해서 알아보자.
		
		next는 토큰 단위로 스페이스바를 기준으로 문자열을 끊어 저장한다.
		 */
		
//		Scanner scan = new Scanner(System.in);
//		String str1 = scan.next();
//		String str2 = scan.next();
//		String str3 = scan.next();
//		String str4 = scan.next();
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
//		System.out.println(str4);
//		
		/*
		split에 대해 알아보자.
		-String에서만 가능한지?
		 */
		
		String input = "10120123";
		String[] arr = input.split("0");
		int[] nums = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			nums[i] = Integer.parseInt(arr[i]);
			System.out.println(arr[i]);
			System.out.println(nums[i]);
		}
		
		
		
		
		
	}

}
