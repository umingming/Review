package com.review.array;

public class Q03 {

	public static void main(String[] args) {
		/*
		설계>
		1. dump메소드 선언
		2. temp 변수 선언
		3. for문 list길이 만큼
			>temp에 추가 저장
		4. temp리턴
		 */
		
		int[] list = new int[4];
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;
		String result = dump(list);
		System.out.printf("nums = %s\n", result);

	}

	private static String dump(int[] list) {
		String temp = "[ ";
		
		for(int i=0; i<list.length; i++) {
			temp += list[i] + ", ";
		}
		
		temp = temp.substring(0, temp.lastIndexOf(",")) + " ]";
		
		return temp;
	}

}
