package com.review.iteration;

public class Q16 {

	public static void main(String[] args) {
		/*
		1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 = 232
		-N이 100이 넘기 전까지 출력
		
		설계>
		1. num1 = 0, num2 = 1, process, sum 선언
		2. while문 무한루프
			>temp = num2
			>num2 += num1
			>num1 = temp
			>if문 num1 > 100 break
			>sum, process += num1
		3. 출력
		 */
		
		int num1 = 0, num2 = 1, sum = 0;
		String process = "";
		
		while(true) {
			int temp = num1;
			num1 = num2;
			num2 += temp;
			
			if(num1 > 100) {
				break;
			}
			
			sum += num1;
			process += " + " + num1;
		}
		
		System.out.println(process.substring(3) + " = " + sum);
	}

}
