package com.java.method.scanner;

import java.util.Scanner;

public class Check {
	public static void main(String[] args) {
		/*
		scanner next�� ���ؼ� �˾ƺ���.
		
		next�� ��ū ������ �����̽��ٸ� �������� ���ڿ��� ���� �����Ѵ�.
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
		split�� ���� �˾ƺ���.
		-String������ ��������?
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
