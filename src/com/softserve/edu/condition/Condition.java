package com.softserve.edu.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Condition {
	
	public static void main(String[] args) throws Exception {
		int x = 5;
		int y = -5;
		boolean b =x<y;
		System.out.println("b= " + b); // false
		System.out.println(x == y); // false
		System.out.println(x != y); // true
		System.out.println(x >= y); // true

		System.out.println("compare test: ");
		int t = 5, s = 4, v = 7;
		System.out.println("proscent 7%5: "+ (double)(v%t));
		System.out.println(t > s && t > v || s < v);
		System.out.println((t < v || s > v) && t < s);

		System.out.println("Ternat operators: ");
		int a = 3, bb = 2;
		String str2;
		if (a-- == bb) {
			str2 = "yes";
		} else {
			str2 = "no";
		} 
		
		//nString str2 = a-- == b ? "yes" : "no";
		System.out.println("str2 = " + str2);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Do you enjoy Java? (yes/no/maybe)");
		String input = br.readLine();

		switch (input.toLowerCase()) {
		case "yes":
		case "maybe":
			System.out.println("Great!");
			break;
		case "no":
			System.out.println("Too bad!");
			break;
		default:
			System.out.println("Wrong!");
		}

	}
}
