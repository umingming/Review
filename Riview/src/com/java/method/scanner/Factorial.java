package com.java.method.scanner;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		/*
		5!�� ����غ���.
		
		����>
		1. ���� �޼ҵ�
			>int ���� ���� �� ���ϴ� ��(5)���� �ʱ�ȭ
			>int ���� ���� �� num�� �Ű������� �ϴ� factorial�޼ҵ�� �ʱ�ȭ
		2. factorial; int�� ������
			>if�� 1�ΰ�? ����
				>1�� �ƴϸ� n*factorial(n-1)����
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ּ���. >");
		int n = scan.nextInt();
		int result = factorial(n);
		
		System.out.println(result);

	}

	private static int factorial(int n) {
		if(n == 1) {
			System.out.print(n + "=");
			return n;
		} else {
			System.out.print(n + "*");
			return n * factorial(n-1);
		}
	}

}
