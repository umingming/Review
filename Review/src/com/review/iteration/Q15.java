package com.review.iteration;

public class Q15 {

	public static void main(String[] args) {
		/*
		1 + 2 + 4 + 7 + 11 + 16 + ... + N = 469
		-N이 100이 넘기 전까지 출력하시오.
		
		설계>
		1. process, sum, 루프, add 변수 선언
		2. while문 N < 100
			>for문 add
				>N += i
			>add ++
			>sum, process += n
		3. 결과 출력
		 */

		int add = 0, sum = 0;
		String process = "";
		
			while(true) {
				int n = 1;
				for(int i=0; i<=add; i++) {
					n += i;
				}
				
				if(n > 100) {
					break;
				}
				
				add++;
				sum += n;
				process += " + " + n;
			}
		System.out.println(process.substring(3) + " = " + sum);
	}

}
