package com.softserve.edu.array;
// LESSSON 4 !!!!!!!!!!========
import java.util.Arrays;
import java.util.Scanner;

public class AppArray {
	public static void main(String[] args) {
		String[] arr = new String[5];
		arr[0] = "January";
		arr[1] = "February";
		arr[2] = "March";
		arr[3] = "April";
		arr[4] = new String ("May");
		
		System.out.println("arr= " + Arrays.toString(arr)  );
		
		
		
		int[] numbers = {5, 6, 8, 3, 5, 7, 9};
		System.out.println("Origin Array:");
		for(int i = 0; i < numbers.length; i++){
		    System.out.print(numbers[i] + " ");
		}
		
		Arrays.sort(numbers);
		System.out.println("\nSorted Array (Arrays.sort(numbers)!!! ):");
		for(int i = 0; i < numbers.length; i++){
		    System.out.print(numbers[i] + " ");
		}
		System.out.println("\nSorted Array with the help (!for each!) :");
		for (int num : numbers) {
		    System.out.print(num + " ");		
		}
		
		
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int n = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("\nInput number");
			n = Integer.parseInt(sc.nextLine());
			
			if (n < 0){
				break;
				//continue;
			}
			//sum = sum +n;
			sum +=n;
		}
		
		System.out.println("n=" + n+ " sum=" +sum );
		sc.close();
		
		//MAx MIN
		
		int[] arr1 = {2, -5, 7, -4, 8};
		
		int max = arr1[0];
		int imax = 0;
		int i = 0;
		while (i < arr1.length) {
			if (arr1[i] > max) {
				max = arr1[i];
				imax = i;
			}
			i++;
		}
		System.out.print("Maximum = " + max 
				+" is in " + imax + " place");
		
		/////SORTING
		
		int[] arr2 = {2, -5, 7, -4, 8};
		int tmp;
		for (int d = 0; d < arr2.length - 1; d++) {
			for (int j = d + 1; j < arr2.length; j++) {
				if (arr2[d] < arr2[j]) {
					tmp = arr2[d];
					arr2[d] = arr2[j];
					arr2[j] = tmp;
				}
			}
		}
		for (int d = 0; i < arr2.length; d++) {
			System.out.println(arr2[d]);
		}
		
		
	}
}
