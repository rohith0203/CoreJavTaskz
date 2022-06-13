package com.parkingslots;

import java.util.ArrayList;
import java.util.Scanner;

public class ForCars {
ArrayList<Integer> forcars = new ArrayList<>();
	
	
	public void forCars() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the slot number for cars");
		int slot =sc.nextInt();
		for(int i=0; i<=15; i++)
		{
			if(forcars.contains(slot))
			{
				System.out.println("slot is already booked");
				break;
			}
			else
			{
				forcars.add(slot);
				System.out.println("slot is booked for cars");
				return;
			}
		}
	}
	
	public void toRemove()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the slot number to release");
		int slot =sc.nextInt();
		if(forcars.contains(slot))
		{
			int slotToRelease = forcars.indexOf(slot);
			forcars.remove(slotToRelease);
			System.out.println("slot successfully released...");
		}
		else {
			System.out.println("enter the valid number to release");
		}
	}
}

