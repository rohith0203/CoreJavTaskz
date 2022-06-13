package com.lowercaseuppercase;

import java.util.Arrays;
import java.util.Scanner;

public class ProcessingArrays {

	public void processingArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");

		int a = sc.nextInt();
		String[] arr = new String[a];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the strings");
			String b = sc.next();
			arr[i] = b;
		
		}

		Arrays.sort(arr);
		System.out.println("after sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------------------------------------------------");

		for (int i = 0; i < arr.length; i++) {
			if (i < (arr.length / 2) + arr.length % 2) {
				System.out.println(arr[i].toUpperCase());
			} else {
				System.out.println(arr[i].toLowerCase());
			}
		}

	}
}
