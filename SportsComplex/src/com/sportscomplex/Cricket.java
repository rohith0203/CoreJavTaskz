package com.sportscomplex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cricket {
	
	Scanner sc = new Scanner(System.in);
	HashMap<Integer, String> show;
	HashMap<Integer, String> bookedSlots = new HashMap<Integer, String>();

	public void createCricketSlot() {
		show = new HashMap<Integer, String>();
		show.put(1, "8:00AM-10:00AM");
		show.put(2, "10:00AM-12:00PM");
		show.put(3, "12:00PM-2:00PM");
		show.put(4, "2:00PM-4:00PM");
		show.put(5, "4:00PM-6:00PM");
		
	}

	public void displaySlots() {
		for (Map.Entry<Integer, String> b1 : show.entrySet()) {
			System.out.println("list of slot timmings:" + b1.getKey() + "<------->" + b1.getValue());
		}
	}

	public void toBookSlot() {
		
		System.out.println("enter the slot number");
		int slotno = sc.nextInt();
		if (bookedSlots.containsKey(slotno)) {
			System.out.println("slot is already booked");
			
		} else {
			String time = show.get(slotno);
			bookedSlots.put(slotno, time);
			show.remove(slotno);
			System.out.println("slot is sucessfully booked");
		}

	}
	
	
	public void toReleaseSlot()
	{
		for(Map.Entry<Integer,String>b1:bookedSlots.entrySet())
		{
			System.out.println(b1.getKey()+" "+b1.getValue());
		}
		System.out.println("enter your slot no to release");
		int y=sc.nextInt();
		String time=bookedSlots.get(y);
		show.put(y, time);
		bookedSlots.remove(y);
	}


}
