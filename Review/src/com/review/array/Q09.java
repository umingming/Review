package com.review.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q09 {

	public static void main(String[] args) throws Exception{
		/*
		설계>
		1. BufferedReader
		2. 배열의 길이 입력 받음
		3. 입력한 길이와 그의 반의 길이인 배열 선언
		4. for문 난수 nums 저장
		5. for문 result
			>result[i] = nums[2*i] + nums[2*1+1]
		6. 결과 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("배열의 길이 : ");
		int length = Integer.parseInt(reader.readLine());

		int[] nums = new int[length];
		int[] result = new int[length/2];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random() * 20) + 1;
		}
		
		for(int i=0; i<result.length; i++) {
			result[i] = nums[2*i] + nums[2*i+1];
		}
		
		System.out.printf("nums = %s\n", Arrays.toString(nums));
		System.out.printf("result = %s", Arrays.toString(result));

	}

}
