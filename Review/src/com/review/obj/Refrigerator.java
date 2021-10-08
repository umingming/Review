package com.review.obj;

public class Refrigerator {
	/*
	설계>
	1. 길이가 100인 item 배열 선언
	2. itme 클래스
		>setExpiration 매개변수 Stirng인 메소드
			>replace로 "-" 제거
			>Calendar.set으로 날짜 수정
				>Intager.ParseInt, substring 사용
	3. add 메소드 items[i]에 순서대로 넣기
		>for문 100
			>if문 items[i]가 비었는지?
				>item 저장하고 break
	4. item get메소드 매개변수와 이름이 같으면 꺼내기
		>item 변수 선언
		>for문 100
			>if문 items[i] 이름이 매겨변수와 같은지?
				>item에 items[i] 저장
				>items[i] 초기화 후 break
		>item 리턴
	5. int count 메소드
		>count 변수 선언
		>for문 100
			>if문 items[i]가 있는지? count++
		>count 리턴
	6. 아이템 목록 메소드
		>for문 
			>if문 items[i]가 있는지?
				>printf 이용해 음식 정보 출력
	 */

}

