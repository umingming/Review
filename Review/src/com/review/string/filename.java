package com.review.string;

public class filename {

	public static void main(String[] args) {
		String path = "D:\\class\\java\\JavaTest\\src\\Ex10.java";
		int index = path.lastIndexOf("\\");
		String filename = path.substring(index + 1, path.length());
		System.out.println(filename);
		
		index = filename.lastIndexOf(".");
		String filenameWithoutExt = filename.substring(0, index);
		System.out.println(filenameWithoutExt);
		
		String ext = filename.substring(index);
		System.out.println(ext);

	}

}
