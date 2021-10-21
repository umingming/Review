package com.review.collection;

public class AnnonymousEx2 {

	public static void main(String[] args) {
		AAA a = new AAA() {
			
			@Override
			public void test() {
				System.out.println("AAA");
			}
		};
		a.test();
		
		BBB b1 = new BBB();
		AAA b2 = b1;
		b1.test();
		((BBB)b2).hi();
	}

}

interface AAA{
	void test();
}

class BBB implements AAA{

	@Override
	public void test() {
		System.out.println("BBB");
	}
	
	void hi() {
		System.out.println("hi");
	}
}