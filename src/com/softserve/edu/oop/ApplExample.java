package com.softserve.edu.oop;

import java.util.Arrays;

///LESSON 4!=======

class Student {
	public String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

}

class Person {
	String name;

	// overload
	public void print() {
		System.out.println(name);
	}

	public void print(String s) {
		System.out.println(s + " " + name);
	}

	public void print(int k, String... s) {
		System.out.println("k = " + k);
		System.out.println("name = " + name);
		System.out.println("parameters = " + Arrays.toString(s));
	}

}

public class ApplExample {
	
	private static int stkey = 123;
	private int key = 4321;
	

	public static void main(String[] args) {
		int i = 100;
		long l = i; // no implicit type casting required
		float f = l; // no explicit type casting required
		System.out.println("l= " + l + " f=" + f);

		double d = 100.04;
		l = (long) d; // explicit type casting required
		i = (int) l; // explicit type casting required
		System.out.println("d= " + d + " l= " + l + " i=" + i);

		Person person = new Person();
		person.name = "Ivan";
		person.print("111");
		person.print(007, "aaaa", "bbb", "ccc1");

		Student st1 = new Student("IVAN");
		System.out.println(st1);
		Student st2 = new Student("Lol");
		st2.setName("TEST");
		System.out.println(st2);
		///
		System.out.println("stkey = " +stkey);
		ApplExample app = new ApplExample();
		System.out.println("key = " +app.key);

	}
}
