package com.review.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11 {

	public static void main(String[] args) throws Exception{
		/*
		사용자가 입력한 범위의 숫자까지 369게임의 결과를 출력하시오.
		-최대 3자리
		
		설계>
		1. BufferedReader
		2. 최대 숫자 입력
		4. 루프 변수 선언
		5. while문 최대 숫자 만큼
			>if문 n%10%3==0 && n%10!=0
			>true면 "짝" false면 숫자 리턴 
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("최대 숫자 : ");
		int max = Integer.parseInt(reader.readLine());
		
		int n = 1;
		while(n<=max) {
			String result = "";
			for(int i=0; i<(n+"").length(); i++) {
				if((n+"").charAt(i) == '3' || (n+"").charAt(i) == '6' || (n+"").charAt(i) == '9') {
					if(result.indexOf("짝") == -1) {
						result = "짝";
					} else {
						result = "짝짝";
					}
				} else {
						result += (n+"").charAt(i);
				}
			}
			System.out.print(result + " ");
			n++;
		}
	}

}
