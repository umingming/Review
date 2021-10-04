package com.review.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q08 {

	public static void main(String[] args) throws Exception{
		/*
		설계>
		1. BufferedReader
		2. 삭제위치 입력 받기
		3. 길이가 5인 배열 선언
		4. for문 난수 입력
		5. 원본 출력
		6. for문 삭제위치 이후
			>i = i+1
			>마지막은 0
		7. 결과 출력
		 */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("삭제 위치 : ");
		int delete = Integer.parseInt(reader.readLine());

		int[] nums = new int[5];
		
		for(int i=0; i<nums.length; i++) {
			nums[i]	= (int)(Math.random() * 10) + 1;
		}
		
		System.out.printf("원본 : %s\n", Arrays.toString(nums));
		
		for(int i= delete; i<nums.length; i++) {
			if(i == nums.length - 1) {
				nums[i] = 0;
			} else {
				nums[i] = nums[i+1];
			}
		}
	
		System.out.printf("결과 : %s", Arrays.toString(nums));
	}

}
