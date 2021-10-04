package com.review.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception{
		/*
		설계>
		1. BufferedReader
		2. 최대, 최소 범위 입력
		3. 길이가 20인 int 배열 선언
		4. String 변수 선언
		5. for문 
			>배열에 1~20 난수 저장 
			>array에 추가
			>if문 범위 내면 result에 추가
		6. 결과 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("최대 범위 : ");
		int max = Integer.parseInt(reader.readLine());
		System.out.print("최소 범위 : ");
		int min = Integer.parseInt(reader.readLine());
		
		int[] nums = new int[20];
		String array = "";
		String result = "";
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random() * 20) + 1;
			
			if(nums[i] >= min && nums[i] <= max) {
				result += nums[i] + ", ";
			}
			
			array += nums[i] + ", ";
		}

		System.out.printf("원본 : %s%n", array.substring(0, array.length() -2));
		System.out.printf("결과 : %s%n", result.substring(0, result.lastIndexOf(",")));

	}

}
