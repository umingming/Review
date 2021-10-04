package com.review.array;

import java.util.Arrays;

public class Q04 {

	public static void main(String[] args) {
		/*
		1. 길이가 20인 int 변수 선언
		2. min, max 변수 선언 
		3. for문 
			>난수를 배열에 저장
			>최대 최소 비교함.
		4. 결과 출력
		 */
		
		int[] nums = new int[20];
		int min = 20;
		int max = 1;
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random() * 20) + 1;
			
			if(min > nums[i]) {
				min = nums[i];
			}
			
			if(max < nums[i]) {
				max = nums[i];
			}
		}
		
		System.out.printf("원본 : %s%n", Arrays.toString(nums).substring(1, Arrays.toString(nums).length()-1));
		System.out.printf("최대값 : %s%n", max);
		System.out.printf("최소값 : %s%n", min);
	}
}
