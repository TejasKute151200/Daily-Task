package corejava.scheduleRoom;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Map.Entry;

public class ScheduleRoom   {
						/* Ignore Comments .. */
public void showTimeSlots() {
	ScheduleRoomData srd = new ScheduleRoomData();
	
	System.out.println("\n --->>> Book Your Session <<<---");

	HashMap<Integer, String> hm1 = new HashMap<>();

	hm1.put(1, "Session A: 10.00am - 04.00pm");
	hm1.put(2, "Session B: 04.00pm - 10.00pm");

	for (Entry<Integer, String> serial : hm1.entrySet()) // For Iteration
	{
		System.out.println(serial.getKey() + " " + serial.getValue());
	}
	System.out.println("\n Select Your Session: ");
	
	Scanner sc = new Scanner(System.in);
	Byte sessionSlotIndex = sc.nextByte();
	
	
	switch (sessionSlotIndex) {
	case 1: {
		System.out.println("--->>> Book Your Time <<<---");
		
		HashMap<Integer, String> hm2 = new HashMap<>();
		hm2.put(1, "  10.00am - 11.00am");
		hm2.put(2, "  11.00am - 12.00pm");
		hm2.put(3, "  01.00pm - 02.00pm");
		hm2.put(4, "  02.00pm - 03.00pm");
		hm2.put(5, "  03.00pm - 04.00pm");

		for (Entry<Integer, String> serial : hm2.entrySet()) // For Iteration
		{
			System.out.println(serial.getKey() + " " + serial.getValue());
		}

		System.out.println("\n Select Your Time: ");

		Scanner sc1 = new Scanner(System.in);
		Byte timeSlotIndex = sc.nextByte();

		switch (timeSlotIndex) {

		case 1: {
			System.out.println("Your Slot Has Been Booked..." + hm2.get(1));
			
			 System.out.println(srd.equals(hm2.remove(hm2.get(1))));
			System.out.println("\n Available Slots: \n");
			
			for (Entry<Integer, String> serial : hm2.entrySet()) // For Iteration
			{
				System.out.println( serial.getKey() + " " + serial.getValue());
			}
			
			

		}
		
			break;
			
		case 2: {
			System.out.println("Your Slot Has Been Booked..." + hm2.get(2));
			hm2.remove(2);

//			for (Entry<Integer, String> serial : hm2.entrySet()) // For Iteration
//			{
//				System.out.println(serial.getKey() + " " + serial.getValue());
//			}
		}
			break;
		case 3: {
			System.out.println("Your Slot Has Been Booked..." + hm2.get(3));
			hm2.remove(3);

//			for (Entry<Integer, String> serial : hm2.entrySet()) // For Iteration
//			{
//				System.out.println(serial.getKey() + " " + serial.getValue());
//			}
		}
			break;
		case 4: {
			System.out.println("Your Slot Has Been Booked..." + hm2.get(4));
			hm2.remove(4);

//			for (Entry<Integer, String> serial : hm2.entrySet()) // For Iteration
//			{
//				System.out.println(serial.getKey() + " " + serial.getValue());
//			}
		}
			break;
		case 5: {
			System.out.println("Your Slot Has Been Booked..." + hm2.get(5));
			hm2.remove(5);

//			for (Entry<Integer, String> serial : hm2.entrySet()) // For Iteration
//			{
//				System.out.println(serial.getKey() + " " + serial.getValue());
//			}
		}
			break;

		default: {
			System.out.println("Invalid Entry.. \n Please Try Again");
			
//			for (Entry<Integer, String> serial : hm2.entrySet()) // For Iteration
//			{
//				System.out.println(serial.getKey() + " " + serial.getValue());
//			}
		}
		}

	}
		break;
	case 2: {
		System.out.println("--->>> Book Your Time <<<---");
		
		HashMap<Integer, String> hm3 = new HashMap<>();
		hm3.put(1, "  04.00pm - 05.00pm");
		hm3.put(2, "  05.00pm - 06.00pm");
		hm3.put(3, "  07.00pm - 08.00pm");
		hm3.put(4, "  08.00pm - 09.00pm");
		hm3.put(5, "  09.00pm - 10.00pm");

		for (Entry<Integer, String> serial : hm3.entrySet()) // For Iteration
		{
			System.out.println(serial.getKey() + " " + serial.getValue());
		}

		System.out.println("\n Select Your Time: ");

		Scanner sc1 = new Scanner(System.in);
		Byte timeSlotIndex = sc.nextByte();

		switch (timeSlotIndex) {

		case 1: {
			System.out.println("Your Slot Has Been Booked..." + hm3.get(1));
			hm3.remove(1);

//			for (Entry<Integer, String> serial : hm3.entrySet()) // For Iteration
//			{
//				System.out.println(serial.getKey() + " " + serial.getValue());
//			}

		}
			break;
		case 2: {
			System.out.println("Your Slot Has Been Booked..." + hm3.get(2));
			hm3.remove(2);

//			for (Entry<Integer, String> serial : hm3.entrySet()) // For Iteration
//			{
//				System.out.println(serial.getKey() + " " + serial.getValue());
//			}
		}
			break;
		case 3: {
			System.out.println("Your Slot Has Been Booked..." + hm3.get(3));
			hm3.remove(3);

//			for (Entry<Integer, String> serial : hm3.entrySet()) // For Iteration
//			{
//				System.out.println(serial.getKey() + " " + serial.getValue());
//			}
		}
			break;
		case 4: {
			System.out.println("Your Slot Has Been Booked..." + hm3.get(4));
			hm3.remove(4);

//			for (Entry<Integer, String> serial : hm3.entrySet()) // For Iteration
//			{
//				System.out.println(serial.getKey() + " " + serial.getValue());
//			}
		}
			break;
		case 5: {
			System.out.println("Your Slot Has Been Booked..." + hm3.get(5));
			hm3.remove(5);

//			for (Entry<Integer, String> serial : hm3.entrySet()) // For Iteration
//			{
//				System.out.println(serial.getKey() + " " + serial.getValue());
//			}
		}
			break;

		default: {
			System.out.println("Invalid Entry.. \n Please Try Again");
//			for (Entry<Integer, String> serial : hm3.entrySet()) // For Iteration
//			{
//				System.out.println(serial.getKey() + " " + serial.getValue());
//				}
			}
		}
	} 
		break;
	default: {
		System.out.println("Invalid Entry.. \n Please Try Again \n");
		}
		}
	
	}
void availablitySlot() {
	HashMap<Integer, String> hm4 = new HashMap<>();
	
}

	public static void main(String[] args) {

		while (true) {
			ScheduleRoom sr = new ScheduleRoom();
			sr.showTimeSlots();
		}
//		ScheduleRoom sr = new ScheduleRoom();
//		sr.showTimeSlots();
	}

}
