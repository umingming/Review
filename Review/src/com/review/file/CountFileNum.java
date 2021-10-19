package com.review.file;

import java.io.File;

public class CountFileNum {
	/*
	1. field; static vairale count, dcount
	2. countable method(File dir)
		>file array 생성 list()로
		>if문 존재하는지?
			>향상된 for문 file elements 반복
				>if문 is it file?
					>count++
			>향상된 for문 file elemetns qksqhr
				>if문 is it dir?
					>dcount++
					>countable()
	3. main
		>git주소로 file 객체 생성
		>if문 존재하는지?
			>countable()
		>count 출력
	 */
	
	static int count;
	static int dcount;
	
	public static void main(String[] args) {
		File git = new File("C:\\Users\\u_011\\git");
		if(git.exists()) {
			countable(git);
		}
		System.out.println(count);
		System.out.println(dcount);

	}

	private static void countable(File git) {
		File[] temp = git.listFiles();
		for(File file : temp) {
			if(file.isFile()) {
				count++;
			}
		}
		
		for(File dir : temp) {
			if(!dir.isFile()) {
				dcount++;
				countable(dir);
			}
		}
	}

}
