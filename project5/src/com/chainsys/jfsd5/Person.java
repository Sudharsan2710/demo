package com.chainsys.jfsd5;

public class Person {
	String Name;
	int age;
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
		 if (name.matches("[a-zA-Z]+")) {
	            this.Name = name;
	        } else {
	            System.out.println("Invalid name. Please enter alphabetic characters only.");
	        }
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		 if (age > 0) {
	            this.age = age;
	        } else {
	            System.out.println("Invalid age. Please enter a value above zero.");
	        }
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", age=" + age + "]";
	}

}
