package com.student.model;

public class Student {
	private int rollNo;
	private String name;
	private int age;
	private String className;
	public Student(int rollNo, String name, int age, String className) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.className = className;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
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
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public static void add(Student studentlist) {
		// TODO Auto-generated method stub
		
	}
	

}