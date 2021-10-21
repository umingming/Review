package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;

public class Sort {
	
	public static void main(String[] args) {
		//버블 정렬
//		m1();
//		m2();
//		m3();
//		m4();
		m5();
		
	}

	private static void m5() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(5);
		nums.add(2);
		nums.add(3);
		nums.add(1);
		nums.add(4);
		
		System.out.println(nums);
		System.out.println(nums);
		
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("홍길동", 5, 1998, 6, 10));
		users.add(new User("이유미", 2, 1994, 3, 10));
		users.add(new User("홍상순", 3, 1993, 1, 10));
		users.add(new User("아무개", 4, 1992, 4, 10));
		users.add(new User("호호호", 1, 1995, 2, 10));
		Collections.sort(users);
		System.out.println(users);
	}

	private static void m4() {
		
		User[] list = new User[5];
		list[0] = new User("홍길동", 5, 1998, 6, 10);
		list[1] = new User("이유미", 2, 1994, 3, 10);
		list[2] = new User("홍상순", 3, 1993, 1, 10);
		list[3] = new User("아무개", 4, 1992, 4, 10);
		list[4] = new User("호호호", 1, 1995, 2, 10);
		
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
	}

	private static void m3() {
		int[] nums = {5, 1, 3, 4, 2};
		Arrays.sort(nums);
		String[] names = {"홍길동", "아무개", "하하하", "김길동", "홍길순"};
		Arrays.sort(names);
		
		
		User[] list = new User[5];
		list[0] = new User("홍길동", 5, 1998, 6, 10);
		list[1] = new User("이유미", 2, 1994, 3, 10);
		list[2] = new User("홍상순", 3, 1993, 1, 10);
		list[3] = new User("아무개", 4, 1992, 4, 10);
		list[4] = new User("호호호", 1, 1995, 2, 10);
		
		for(int i=0; i<list.length-1; i++) {
			for(int j=0; j<list.length-1-i; j++) {
				if(list[j].getBirthDay().getTimeInMillis() > list[j+1].getBirthDay().getTimeInMillis()) {
					User temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(list));
	}

	private static void m2() {
		String[] names = {"홍길동", "아무개", "하하하", "김길동", "홍길순"};
		System.out.println(Arrays.toString(names));
		
		for(int i=0; i<names.length-1; i++) {
			for(int j=0; i<names.length-i-1;j++) {
				if(names[i].compareTo(names[i+1])>0){
					String temp = names[j+1];
					names[j] = names[j+1];
					names[j+1] = temp;
				}
			}
		}
	
		
	}

	private static void m1() {
		int[] nums = {5, 1, 3, 4, 2};
		System.out.println(Arrays.toString(nums));
		
		for(int i=0; i<nums.length-1; i++) {
			System.out.println("Step" + (i + 1));
			
			for(int j=0; j<nums.length-i-1; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
				System.out.println(Arrays.toString(nums));
			}
			
		}
		
	}

}

class User implements Comparable<User>{
	private String name;
	private int level;
	private Calendar birthDay;
	
	public Calendar getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Calendar birthDay) {
		this.birthDay = birthDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public User(String name, int level, int year, int month, int data) {
		this.name = name;
		this.level = level;
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, data);
		this.birthDay = c;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append("name: " + this.name);
		sb.append(",level: " + this.level);
		sb.append(",birthday: " + String.format("%tF", this.birthDay));
		sb.append("]\n");
		
		return sb.toString();
	}
	@Override
	public int compareTo(User user) {
		return this.getBirthDay().compareTo(user.getBirthDay());
	}
	
	
}
