package com.java.string;

public class StringBuilder {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		String s1 = "this is str";
		str.append(s1);
		//왜 안 되지..?
		System.out.println(str.toString());
		
	}
}
