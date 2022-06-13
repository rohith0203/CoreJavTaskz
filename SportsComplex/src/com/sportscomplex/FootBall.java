package com.sportscomplex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FootBall {
	
	Scanner sc = new Scanner(System.in);
	HashMap<Integer, String> show;
	HashMap<Integer, String> bookedSlots = new HashMap<Integer, String>();

	public void createFootBallSlot() {
		show = new HashMap<Integer, String>();
		show.put(1, "8:00AM-8:30AM");
		show.put(2, "8:30AM-9:00AM");
		show.put(3, "9:00AM-9:30AM");
		show.put(4, "9:30AM-10:00PM");
		show.put(5, "10:00AM-10:30AM");
		show.put(6, "10:30AM-11:00AM");
		show.put(7, "11:00AM-11:30AM");
		show.put(8, "11:30AM-12:00PM");
		show.put(9, "12:00PM-12:30PM");
		show.put(10, "12:30PM-1:00PM");
		show.put(11, "1:00PM-1:30PM");
		show.put(12, "1:30PM-2:00PM");
		show.put(13, "2:00PM-2:30PM");
		show.put(14, "2:30PM-3:00PM");
		show.put(15, "3:00PM-3:30PM");
		show.put(16, "3:30PM-4:00PM");
		show.put(17, "4:00PM-4:30PM");
		show.put(18, "4:30PM-5:00PM");
		show.put(19, "5:00PM-5:30PM");
		show.put(20, "5:30PM-6:00PM");
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
