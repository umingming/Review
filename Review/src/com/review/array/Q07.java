package com.review.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q07 {

	public static void main(String[] args) throws Exception{
		/*
		1. BufferedReader
		2. 삽입 위치와 값 입력
		3. 길이가 10인 배열 선언
		4. for문으로 난수 대입
		5. 원본 출력
		6. for문 삽입 위치 전까지 
			>i = i-1
		7. 결과 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("삽입 위치 : ");
		int insert = Integer.parseInt(reader.readLine());

		System.out.print("값 : ");
		int value = Integer.parseInt(reader.readLine());
		
		int[] nums = new int[10];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random() * 20) + 1;
		}
		
		System.out.printf("원본 : %s%n", Arrays.toString(nums));
		
		for(int i=nums.length-1; i>insert; i--) {
			nums[i] = nums[i-1];
		}
		
		nums[insert] = value;
		
		System.out.printf("결과 : %s%n", Arrays.toString(nums));
	}

}
