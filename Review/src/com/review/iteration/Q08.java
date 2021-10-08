package com.review.iteration;

public class Q08 {

	public static void main(String[] args) {
		/*
		서기 1.1.1 부터 오늘이 며칠째인지 합을 구하시오
		-오늘이 무슨 요일인지도 구하기
		
		설계>
		1. 년, 월, 일, 총 일수 변수 생성
		2. 윤년 메소드 생성
			>if문 윤년인지? 맞으면 true 리턴
		3. 루프 변수 y, m 선언
		4. while문 해당 년까지
			>윤년인가? +366 : 365
			>y++
		5. while문 해당 월까지
			>switch문 월별 마지막 일 더하기
			>m++
		6. 총 일 수에 오늘 일 더하기
		7. 요일 구하는 메소드
			>switch문 총 일수 % 7 case 0~6 : 일~토
		8. 결과 출력
		 */
		
		int year = 2021;
		int month = 9;
		int date = 28;
		int totalDays = 0;
		
		int y = 1, m = 1;
		
		while(y<year) {
			totalDays += isLeapYear(year) ? 366 : 365;
			y++;
		}
		
		while(m<month) {
			switch(m) {
			case 1, 3, 5, 7, 8, 10, 12 :
				totalDays += 31;
				break;
			case 4, 6, 9, 11 : 
				totalDays += 30;
				break;
			case 2 :
				totalDays += isLeapYear(year) ? 29 : 28;
				break;
			}
			m++;
		}
		
		totalDays += date;
		String dayOfWeek = getDayOfWeek(totalDays);
		
		System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날입니다.%n", year, month, date, totalDays);
		System.out.printf("%d년 %d월 %d일은 %s요일입니다.%n", year, month, date, dayOfWeek);

	}

	private static String getDayOfWeek(int totalDays) {
		switch(totalDays % 7) {
		case 0 : return "일";
		case 1 : return "월";
		case 2 : return "화";
		case 3 : return "수";
		case 4 : return "목";
		case 5 : return "금";
		default : return "토";
		}
		
	}

	private static boolean isLeapYear(int year) {
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			return true;
		}
		return false;
	}

}
