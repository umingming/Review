package com.review.file;

import java.io.File;
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		특정 파일을 이동하고, 중복되는 경우를 처리하시오.
		
		설계>
		1. Scanner
		2. 파일의 다른 경로를 갖는 File 객체 생성
		3. if A파일이 존재하는지?
			>if B파일이 존재하는지?
				>덮어쓸 건지 입력 받음.
				>if y? B파일 삭제
					>renameto로 A경로를 B로 수정함.
					>n면 작업 취소.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		File fileA = new File("C:\\class\\java\\file\\A\\Hello.txt");
		File fileB = new File("C:\\class\\java\\file\\B\\Hello.txt");
		
		if(fileA.exists()) {
			if(fileB.exists()) {
				System.out.println("파일 이동을 실행합니다.");
				System.out.printf("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n)");
				String answer = scan.nextLine();
				
				if(answer.equalsIgnoreCase("Y")) {
					fileB.delete();
					fileA.renameTo(fileB);
					System.out.println("y.파일을 덮어썼습니다.");
				}else if(answer.equalsIgnoreCase("Y")) {
					System.out.println("n.작업을 취소합니다.");
				}
			}
		}
	}
}
