package com.review.file;

import java.io.File;

public class Q10 {

	public static void main(String[] args) {
		/*
		각 파일들을 아래의 조건에 따라 폴더를 나누어 정렬하시오.
		
		1. 직원 경로를 참조하는 File 객체 생성
		2. File 배열 생성
		3. 향상된 for문 배열 반복
			>index로 _위치를 저장함
			>이름_년도에 해당하는 file 생성
			>file을 renameTo함.
		 */
		
		File dir = new File(Path.Q10);
		File[] files = dir.listFiles();
		for(File file : files) {
			String[] temp = file.getName().split("_");
			String path = String.format("%s\\%s\\%s" 
										, Path.Q10, temp[0], temp[1]);
			File subdir = new File(path);
			subdir.mkdirs();
			path += String.format("\\%s", file.getName());  
			File subfile = new File(path);
			file.renameTo(subfile);
			
//			int index = file.getName().indexOf("_");
//			String path = Path.Q10 
//						+ "\\" + file.getName().substring(0, index)
//						+ "\\" + file.getName().substring(index + 1, index + 5);
//			File subdir = new File(path);
//			subdir.mkdirs();
//			File subfile = new File(path + "\\" + file.getName());
//			file.renameTo(subfile);
		}
		System.out.println("분류가 완료되었습니다.");

	}

}
