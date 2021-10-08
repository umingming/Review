package com.review.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception{
		/*
		설계>
		1. BufferedReader
		2. 길이가 5인 int 배열 선언
		3. for문 0~4
			>숫자 : 라벨 출력
			>readLine이용해 숫자 입력 받기
		4. for문 4~0
			>배열 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int[] nums = new int[5];
		
		for(int i=0; i<nums.length; i++) {
			System.out.print("숫자 : ");
			nums[i] = Integer.parseInt(reader.readLine());
		}
		
		for(int i=0; i<nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", nums.length -1 -i, nums[nums.length -1 -i]);
		}

	}

}
