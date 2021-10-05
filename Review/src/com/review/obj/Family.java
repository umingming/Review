package com.review.obj;

public class Family {
	Person[] parent = new Person[2];

	public Person[] getParent() {
		return parent;
	}

	public void setMother(Person mother) {
		this.parent[0] = mother;
	}
	
	

}

class Person{
	private String name;
	private int age;
	private String hometown;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
}
