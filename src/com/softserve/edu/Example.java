package com.softserve.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		System.out.println("Firsr look on JAVA!");
		// test for
		for (int i = 0; i < args.length; i++) {
			System.out.println("arg i = " + i + " value = " + args[i]);
		}

		double x = 1;
		double y = 1;

		/*-
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("x=");
			String text = br.readLine();
			x = Integer.parseInt(text);
			System.out.print("y=");
			y = Integer.parseInt(br.readLine());
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ERROR! ");
		}
		
		System.out.println("x / y = " + (double) (x / y));
		try {
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("x=");
			x = sc.nextDouble();
			System.out.print("y=");
			y = sc.nextDouble();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ERROR! in Scanner! ");
		}
		System.out.println("x / y = " + (x / y));
	}
}