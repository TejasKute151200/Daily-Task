package corejava.collectionTask;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Map
{
	public static void main(String[] args)
	{ 
						/* HashMap */
		HashMap <Integer, String> hm= new HashMap<Integer,String>();
		hm.put(1, "Tej");
		hm.put(2, "Tech");
		hm.put(3, "World");
		hm.put(4, "by");
		hm.put(5, "Tejas");
		
		System.out.println(hm);
		//hm.entrySet();	//Set Out Same Elements
		
		//System.out.println(hm.hashCode());
		//System.out.println(hm.keySet()); // Get only Key
		//System.out.println(hm.values()); //Get Only Values
		
		for (Entry<Integer,String> serial: hm.entrySet()) //For Iteration
		{
			System.out.println(serial.getKey()+" "+serial.getValue());
			//serial.setValue("Teja");// Use For Common Value Put On All Keys
			//System.out.println(serial.getValue());
			
		}
		
//							/* HashMap Using UserValue */
//		HashMap <Integer, String> hm= new HashMap<Integer,String>();
//		for (int i =1 ; i <= 50;i++)
//		{
//			Scanner sc=new Scanner(System.in);
//			String j= sc.next();
//			hm.put(i,j);
//		}
//		System.out.println(hm);
//	    
//		for (Entry<Integer,String> serial: hm.entrySet()) //For Iteration
//		{
//			System.out.println(serial.getKey()+" "+serial.getValue());
//		}
		
//							/* HashTable */
//		Hashtable <Integer, String> ht = new Hashtable<>(); //put Value from Downside
//		
//		ht.put(1,"Sanjay");
//		ht.put(2,"Tejas");
//		ht.put(3,"Kute");
//		
//		System.out.println(ht);
//		for (Entry<Integer,String>hts: ht.entrySet())
//		{
//			System.out.println(hts.getKey()+" "+hts.getValue());
//		}
		
//						/* LinkedHashMap */
//		LinkedHashMap <Integer,String> lhs= new LinkedHashMap<>();
//		lhs.put(1,"Tejas");
//		lhs.put(2,"Sanjay");
//		lhs.put(3,"Kute");
//		
//		System.out.println(lhs);
//		
//		for (Entry<Integer,String>entryLhs : lhs.entrySet())
//		{
//			System.out.println(entryLhs.getKey()+" "+entryLhs.getValue());
//		}
		
//						/* TreeMap */
//		TreeMap<Integer,Character> tm= new TreeMap<>();
//		tm.put(1,'T');
//		tm.put(2,'e');
//		tm.put(3,'j');
//		
//		for (Entry<Integer,Character>tms : tm.entrySet())
//		{
//			System.out.println(tms.getKey()+" "+tms.getValue());
//		}
	}

}
