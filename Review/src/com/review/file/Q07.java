package com.review.file;

import java.io.File;
import java.util.ArrayList;

public class Q07 {

	public static void main(String[] args) {
		/*
		모두 존재하는 파일만 출력하시오.
		
		설계>
		1. 동일 파일의 MusicA,B을 경로로 하는 File 객체 생성
		2. File 객체를 참조하는 File 배열 선언
		3. ArrayList 3개 생성
		4. 향상된 for문 A배열 반복
			>listA에 배열의 이름 추가함.
		5. 향상된 for문 B배열 반복
			>listB에 배열 이름 추가함.
			>if 해당 이름이 listA에도 있는지?
				>listAll에 추가함
		6. 결과 출력
		 */
		
		File dirA = new File(Path.Q07 + "\\MusicA");
		File dirB = new File(Path.Q07 + "\\MusicB");
		
		File[] filesA = dirA.listFiles();
		File[] filesB = dirB.listFiles();
		
		ArrayList<String> listA = new ArrayList<String>();
		ArrayList<String> listB = new ArrayList<String>();
		ArrayList<String> listAll = new ArrayList<String>();
		
		for(File file : filesA) {
			listA.add(file.getName());
		}
		
		for(File file : filesB) {
			listB.add(file.getName());
			if(listA.contains(file.getName())) {
				listAll.add(file.getName());
			}
		}
		
		for(String name : listB) {
			System.out.println(name);
		}
		
	}

}
