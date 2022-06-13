package com.sportscomplex;

import java.util.Scanner;

public class User {
	Scanner sc = new Scanner(System.in);
	Batminton b = new Batminton();
	FootBall f = new FootBall();
	Cricket c = new Cricket();

	public void sportComplex() {
		b.createBatmintonSlot();
		f.createFootBallSlot();
		c.createCricketSlot();
		while (true) {
			System.out.println("enter 1 :for book slots  &&  enter 2:for release slots");
			int x = sc.nextInt();
			switch (x) {
			case 1: {
				System.out.println("Enter your name please ");
				String s = sc.next();
				String name = s;
				System.out.println("Enter 1 for Batminton:::2 for Football:::3 for Cricket");
				int i = sc.nextInt();
				switch (i) {
				case 1: {
					b.displaySlots();
					b.toBookSlot();
					break;
				}
				case 2: {
					f.displaySlots();
					f.toBookSlot();
					break;
				}
				case 3: {
					c.displaySlots();
					c.toBookSlot();
					break;
				}
				}
				break;
			}
			case 2: {
				System.out.println("Enter 1 for Batminton:::2 for Football:::3 for Cricket");
				int j = sc.nextInt();
				switch (j) {
				case 1: {
					b.toReleaseSlot();
					break;
				}
				case 2: {
					f.toReleaseSlot();
					break;
				}
				case 3: {
					c.toReleaseSlot();
					break;
				}
				}
			}
			}

		}

	}
}
