package com.review.file;

import java.io.File;

public class Q08 {
	/*
		delete 폴더를 삭제하시오.
		
		설계>
		1. field; count 변수 선언
		2. delete 폴더를 경로로 하는 File 객체 생성
		3. delete메소드 호출
		4. delete메소드 File을 매개변수로 함.
			>File 배열 선언
			>향상된 for문 배열 반복
				>if 파일인지?
					>삭제함
					>count++
			>향상된 for문 배열 반복
				>if 폴더인지?
					>삭제함
					>dcount++
					>delete메소드 호출
		5. 결과를 출력함
	 */
	static int count;
	static int dcount; 

	public static void main(String[] args) {
		
		File dir = new File(Path.Q08);
		delete(dir);
//		File[] files = dir.listFiles();
//		for(File file : files) {
//			System.out.println(file.getName());
//		}
		
		
		System.out.println("폴더를 삭제했습니다.");
		System.out.printf("삭제된 폴더는 %d개이고, 파일은 %d개 입니다.", dcount, count);

	}

	private static void delete(File dir) {
		File[] files = dir.listFiles();
		
		for(File file : files) {
			if(file.isFile()) {
				file.delete();
				count++;
			}
		}
		
		for(File file : files) {
			if(file.isDirectory()) {
				delete(file);
			}
		}
		
		dir.delete();
		dcount++;
		
	}

}
