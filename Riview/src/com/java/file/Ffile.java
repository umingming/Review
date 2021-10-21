package com.java.file;

import java.io.File;

public class Ffile {

	public static void main(String[] args) {
		String path = "C:\\java\\AAA\\data.txt";
		String path2 = "C:\\java\\BBB\\data.txt";
		
		File file = new File(path);
		File file2 =  new File(path2);
		
		if(file.exists()) {
			//덮어쓰기; 기존 파일 삭제 후 새 파일 이동
			file2.delete();
			System.out.println(file.renameTo(file2));
			System.out.println("완료");
		}
	}

}
