package com.sportscomplex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Create an application to book slots at a Sports complex
//1. On load(execution) create data 
//A. Badminton court - 10 slots each with timings against each ( 1 hour per each slot)
//B. Football slots - 20 slots (30 mins for each slot)
//C. Box cricket -5 slots ( 2 hours each)
//
//2. User needs to enter his/her name
//3. Show the list of sports
//4. Maintain the timing slots against each sport in other list.
//5. Once user gives input of which sport he/she wants on the next step show the sport name and available slots.
//6. Once the user selects a slot and enters the data , show a success message with his booking details and delete the slot record from the list.
//7. Then when they hit enter again ask for new user details until the data is empty / program is terminated
//8.The booking details need to be store in excel file

public class Batminton {
	Scanner sc = new Scanner(System.in);
	HashMap<Integer, String> show;
	HashMap<Integer, String> bookedSlots = new HashMap<Integer, String>();

	public void createBatmintonSlot()
	{
		show = new HashMap<Integer, String>();
		show.put(1, "8:00AM-9:00AM");
		show.put(2, "9:00AM-10:00AM");
		show.put(3, "10:00AM-11:00AM");
		show.put(4, "11:00AM-12:00PM");
		show.put(5, "12:00PM-1:00PM");
		show.put(6, "1:00PM-2:00PM");
		show.put(7, "2:00PM-3:00PM");
		show.put(8, "3:00PM-4:00PM");
		show.put(9, "4:00PM-5:00PM");
		show.put(10, "5:00PM-6:00PM");
	}

	public void displaySlots() {
		for (Map.Entry<Integer, String> b1 : show.entrySet()) {
			System.out.println("list of slot timmings:" + b1.getKey() + "<------->" + b1.getValue());
		}
	}

	public void toBookSlot() 
	{
		
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
		System.out.println("slot is sucessfully removed");
	}

}
