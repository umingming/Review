package com.review.file;

import java.io.File;
import java.util.ArrayList;

public class Q09 {

	public static void main(String[] args) {
		/*
		폴더의 위치와 상관없이 모든 폴더 내 파일들을 찾아 한 번에 크기를 비교하교하고,
		크기가 큰 순으로 정렬하시오.
		
		설계>
		1. 크기 정렬을 경로로 하는 File 객체 생성
		2. ArrayList 생성해서 File 저장
		3. list와 file을 매개로 하는 add 메소드 호출
		4. add 메소드
			>File 배열 선언
			>향상된 for문 배열 반복
				>if 파일인지?
					>list에 추가
			>향상된 for문 배열 반복
				>if 디렉토리인지?
					>add 메소드 호출
		5. 결과 출력
		 */
		
		File dir = new File(Path.Q09);
		ArrayList<File> list = new ArrayList<File>();
		add(list, dir);
		for(File file : list) {
			System.out.printf("%s\t%dKB\t%s%n"
								, file.getName()
								, file.length()/1024
								, file.getParent().substring(file.getParent().lastIndexOf("\\") +1));
		}

	}

	private static void add(ArrayList<File> list, File dir) {
		File[] files = dir.listFiles();
		for(File file : files){
			if(file.isFile()) {
				list.add(file);
			}
		}
		
		for(File file : files) {
			if(file.isDirectory()) {
				add(list, file);
			}
		}
	}

}
