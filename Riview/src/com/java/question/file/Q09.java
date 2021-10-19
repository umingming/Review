package com.java.question.file;

import java.io.File;
import java.util.ArrayList;

public class Q09 {

	public static void main(String[] args) {
		/*
		모든 폴더 내의 파일들을 한번에 크기를 비교하고 크기가 큰 순으로 정렬
		
		설계>
		1. 크기 정렬 디렉토리를 경로로 하는 File 객체 생성
		2. 객체를 이용해 File 배열 선언
		3. File을 매개로 하는 ArrayList 객체 생성
		4. for문 배열 반복
			>ArrayList에 배열의 요소 추가
		5. for문 ArrayList의 크기 -1 반복
			>for문 ArrayList의 크기 -1 -i 반복
				>if j가 j+1번째 요소보다 큰지?
					>temp File 생성해 j번째 요소 저장
					>set메소드로 j번째에 j+1, j+1에 temp값 저장
		6. for문 ArrayList 객체 반복
			>파일명, 크기, 폴더 출력
		 */
		
		File dir = new File("C:\\java\\file\\파일_디렉토리_문제\\크기 정렬");
		File[] list = dir.listFiles();
		
		ArrayList<File> file = new ArrayList<File>();
		
		for(int i=0; i<list.length; i++) {
			file.add(list[i]);
		}
		
		for(int i=0; i<file.size()-1; i++) {
			for(int j=0; j<file.size()-1-i; j++) {
				if(file.get(j).length() < file.get(j+1).length()) {
					File temp = file.get(j);
					file.set(j, file.get(j+1));
					file.set(j+1, temp);
				}
			}
		}
		
		for(int i=0; i<file.size(); i++) {
			System.out.printf("%s\t%.1fKB\t%s%n", 
					file.get(i).getName(), 
					((double)file.get(i).length()/1024), 
					file.get(i).getParent());
		}
		

	}

}
