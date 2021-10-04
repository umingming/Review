package com.review.string;

public class Q05 {

	public static void main(String[] args) {
		/*
		설계>
		1. content, word, count 변수 선언
		2. for문 content.length
			>if문 substring(i, word.length) = word? 
				>count++
		3. 결과 출력
		 */
		
		String content = "안녕~ 길동아~ 잘가~ 길동아~";
		String word = "길동";
		int count = 0;
		
		for(int i=0; i<content.length() - 1; i++) {
			if(content.substring(i, word.length()).equals(word)) {
				count++;
			}
		}
		
		System.out.printf("'%s'을 총 %d회 발견했습니다.", word, count);
	}

}
