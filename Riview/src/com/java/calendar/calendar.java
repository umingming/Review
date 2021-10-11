package com.java.calendar;

import java.util.Calendar;

public class calendar {

	public static void main(String[] args) {
		/*
		달력 만들기
		-해당 월의 마지막 일이 언제인지
		-해당 월의 1일이 무슨 요일인지
		
		설계>
		1. Calendar
		2. year, month 선언 후 값 저장
		3. 윤년 메소드 생성
			>if문(year%4==0&&year%100==0||year%400==0) >true 리턴
		4. 마지막 날 구하는 메소드 생성
			>switch문 >월별 마지막 일리턴, 2월은 윤년 메소드 사용
		5. 1일이 무슨 요일인지 구하는 메소드 생성
			>total 변수 선언
			>for문 year-1 반복
				>total += 윤년? 366 : 365;
			>for문 month-1 반복
				>total += 마지막 날 구하는 메소드(i)
			>total+1
			>total%7값 리턴. 
		6. month, 일~월 출력
		7. for문 마지막날 반복
			>for문 요일 리턴값 반복 공백 출력
			>i출력
			>if문(i+요일 리턴값 % 7 ==0) >개행
		 */
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month);
		
		System.out.printf("\t\t%d년\t%d월%n", year, month);
		System.out.println("[월]\t[화]\t[수]\t[목]\t[금]\t[토]\t[일]");

		for(int i=0; i<dayOfWeek; i++) {
			System.out.print("\t");
		}
		for(int i=1; i<=lastDay; i++) {
			System.out.printf("%3d\t", i);
			if((i + dayOfWeek) % 7 == 0) {
				System.out.println();
			}
		}

	}

	private static int getDayOfWeek(int year, int month) {
		int totalDays = 0;
		
		for(int i=1; i<year; i++) {
			totalDays += isLeapYear(i) ? 366 : 365;
		}
		
		for(int i=1; i<month; i++) {
			totalDays += getLastDay(year, i);
		}
		
		totalDays ++;
		
		return totalDays % 7;
	}

	private static boolean isLeapYear(int year) {
		if((year % 4 == 0 && year % 100 == 0) || year % 400 == 0) {
			return true;
		}
		return false;
	}

	private static int getLastDay(int year, int month) {
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12 : 
			return 31;
		case 4, 6, 9, 11 :
			return 30;
		case 2 :
			return isLeapYear(year) ? 29 : 28;
		}
		return 0;
	}
}
