package com.parkingslots;

import java.util.ArrayList;
import java.util.Scanner;

public class ForBikes {
	ArrayList<Integer> forBikes = new ArrayList<>();
	
	
	public void forBikes() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the slot number for bikes");
		int slot =sc.nextInt();
		if(slot <= 15) {
			while(slot<=15)
			{
				if(forBikes.contains(slot))
				{
					System.out.println("slot is already booked");
					break;
				}
				else
				{
					forBikes.add(slot);
					System.out.println("slot is booked for bikes");
					break;
				}
			}	
		}
		else {
			System.out.println("for bikes there are 15 slots");
		}
	}
	  
	public void toRemove()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the slot number to release");
		int slot =sc.nextInt();
		if(forBikes.contains(slot))
		{
			int slotToRelease = forBikes.indexOf(slot);
			forBikes.remove(slotToRelease);
			System.out.println("slot successfully released...");
		}
		else {
			System.out.println("enter the valid number to release");
		}
	}
}
