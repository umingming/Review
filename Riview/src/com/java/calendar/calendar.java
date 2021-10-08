package com.java.calendar;

import java.util.Calendar;

public class calendar {

	public static void main(String[] args) {
		/*
		�޷� �����
		-�ش� ���� ������ ���� ��������
		-�ش� ���� 1���� ���� ��������
		
		����>
		1. Calendar
		2. year, month ���� �� �� ����
		3. ���� �޼ҵ� ����
			>if��(year%4==0&&year%100==0||year%400==0) >true ����
		4. ������ �� ���ϴ� �޼ҵ� ����
			>switch�� >���� ������ �ϸ���, 2���� ���� �޼ҵ� ���
		5. 1���� ���� �������� ���ϴ� �޼ҵ� ����
			>total ���� ����
			>for�� year-1 �ݺ�
				>total += ����? 366 : 365;
			>for�� month-1 �ݺ�
				>total += ������ �� ���ϴ� �޼ҵ�(i)
			>total+1
			>total%7�� ����. 
		6. month, ��~�� ���
		7. for�� �������� �ݺ�
			>for�� ���� ���ϰ� �ݺ� ���� ���
			>i���
			>if��(i+���� ���ϰ� % 7 ==0) >����
		 */
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month);
		
		System.out.printf("\t\t%d��\t%d��%n", year, month);
		System.out.println("[��]\t[ȭ]\t[��]\t[��]\t[��]\t[��]\t[��]");

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
