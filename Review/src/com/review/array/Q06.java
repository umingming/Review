package com.review.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q06 {

	public static void main(String[] args) throws Exception{
		/*
		1. BufferedReader
		2. 숫자의 범위, 개수 입력
		3. 입력 받은 길이인  int 배열 선언
		4. for문 개수
			>duplicate 변수 선언
			>for문 무한루프
				>배열에 난수 저장 
				>for문 i-1
					>if문 배열의 i번째와 j번째가 같은지? duplicate++
				>if문 중복이 없으면 break
		 */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("최대값 : ");
		int max = Integer.parseInt(reader.readLine());

		System.out.print("최소값 : ");
		int min = Integer.parseInt(reader.readLine());
		
		System.out.print("개수 : ");
		int num = Integer.parseInt(reader.readLine());

		int[] nums = new int[num];
		
		for(int i=0; i<nums.length; i++) {
			int n = (int)(Math.random() * (max - min + 1)) + min;
			boolean isDuplicate = false;
			
			for(int j=0; j<i; j++) {
				if(nums[j] == n) {
					isDuplicate = true;
				}
			}
			
			if(!isDuplicate) {
				nums[i] = n;
			} else {
				i--;
			}
		}
		
		System.out.println(Arrays.toString(nums));
	
	}

}
