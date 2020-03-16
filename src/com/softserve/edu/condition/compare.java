package com.softserve.edu.condition;

public class compare {
	 
	public static void main(String[] args) throws Exception {
	Student st1 = new Student("Ivan" , 22);
	Student st2 = new Student("Ivan" , 23);
	
	
	System.out.println("st1 == st2 is: " + (st1 == st2) );
	System.out.println("st1 equals is: " + st1.equals(st2) );
	System.out.println("st1.hashCode == " + st1.hashCode());
	System.out.println("st2.hashCode == " + st2.hashCode());
	System.out.println("compare by hashCode == " + (st2.hashCode() == st1.hashCode()) );
	
	Student[] arr1 = new Student[3];
	arr1[0] = new Student("Ivan" , 22);
	arr1[1] = new Student("Taras" , 20);
	arr1[2] = new Student("Vovan" , 21); 
	
	for (int i=0; i<arr1.length;i++) {
		System.out.println(arr1[i].toString());
	}
	
	}
	

}
