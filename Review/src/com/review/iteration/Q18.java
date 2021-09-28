package com.review.iteration;

public class Q18 {

	public static void main(String[] args) {
		/*
		1부터 100사이의 완전수를 구하시오.
		-자기 자신을 제외한 나머지 약수들의 합이 자신과 동일한 수
		
		설계>
		1. divisor, sum, n 선언
		2. while n<=100
			>for문 i<n
				>if문 n % i == 0? sum, divisor += i
			>if문 sum == n? divisor 출력
			>n++
		 */
		
		int n = 1;
		
		while(n<=100) {
			int sum = 0;
			String divisor = "";
			
			for(int i=1; i<n; i++) {
				if(n % i == 0) {
					sum += i;
					divisor += ", " + i;
				}
			}
			
			if(sum == n) {
				System.out.printf("%d = [%s]%n", n, divisor.substring(2));
			}
			
			n++;
		}

	}

}
