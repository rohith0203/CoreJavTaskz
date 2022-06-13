package com.parkingslots;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ForBikes b = new ForBikes();
		ForCars c = new ForCars();
		while (true) {
			System.out.println("Enter 1 for bikes slots and 2 for car slots");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			switch (i) {
			case 1: {
				System.out.println("enter 1 for bookslot and 2 for releaseslot");
				int j = sc.nextInt();
				switch (j) {
				case 1: {
					b.forBikes();
					break;
				}
				case 2: {
					b.toRemove();
					break;
				}
				}
				break;
			}
			case 2: {
				System.out.println("enter 1 for bookslot and 2 for releaseslot");
				int j = sc.nextInt();
				switch (j) {
				case 1: {
					c.forCars();
					break;
				}
				case 2: {
					c.toRemove();
					break;
				}
				}
				break;
			}
			}
		}

	}
}
