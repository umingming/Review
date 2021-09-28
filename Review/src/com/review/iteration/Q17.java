package com.review.iteration;

public class Q17 {

	public static void main(String[] args) {
		/* 2부터 100사이의 소수를 구하시오
		
		설계>
		1. result, n, count 변수 선언
		2. while문 n<100
			>for문 n-1
				>if문 n % i == 0? count ++
			>if문 count == 2? result에 추가
			>n++
		3. 결과 출력
		 */
		
		int n = 1;
		String result = "";
		
		while(n<=100) {
			int count = 0;
			for(int i=1; i<=n; i++) {
				if(n % i == 0) {
					count ++;
				}
			}
			
			if(count == 2) {
				result += ", " + n;
			}
			n++;
		}
		System.out.println(result.substring(2));
	}

}
