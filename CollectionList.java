package corejava.collectionTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CollectionList 
{
	public static void main(String[] args) 
	{
		
		/* Difference Array & ArrayList */
		
//			/* Array using int */
//		int[] arr = new int[20];			 
//		arr[0]=7;
//		arr[1]=7;
//		arr[2]=3;
//		arr[3]=8;
//		arr[4]=2;
//		arr[5]=2;
//		arr[6]=5;
//		arr[7]=0;
//		arr[8]=8;
//		arr[9]=3;
//		arr[10]=77;
//		arr[11]=38;
//		arr[12]=22;
//		arr[13]=50;
//		arr[14]=83;
//		arr[15]=38;
//		arr[17]=22;
//		arr[18]=38;
//		arr[19]=77;
//		arr[0]=71;
//		
//		//Arrays.sort(arr);
//		 for (int i = 0; i < arr.length; i++)
//		 {
//	            System.out.println(arr[i]);
//		 }
		
		
//			/* Array Using float */
//		float[] arr = new float[2];
//		arr[0]= 1.0f;
//		arr[1]=(float) 3.3;
//		for (float j = 0; j < arr.length; j++)
//		{
//			System.out.println( arr[(int) j]);
//		}		
		
		
//			/* Array Using String */
//		String[] arr = new String[10];
//		arr[0]="Tejas";
//		arr[1]="Sanjay";
//		arr[2]="Kute";
//		arr[9]="Jai Hind";
//		//arr[0]="Kute";
//		
//		
//		for (int k = 0; k < arr.length; k++)
//		{
//			System.out.print(" " +arr[k]);
//		}

		
//			/* Array Using char */
//		char[] arr = new char[7];
//		arr[0]='T';
//		arr[1]='e';
//		arr[2]='j';
//		arr[6]='h';
//		for (int l=0; l< arr.length ; l++)
//		{
//			System.out.println(arr[l]);
//		}
		
//			/* Array Using double */ 
//		double[]arr = new double[5];
//		arr[0]= 3.8;
//		arr[1]= 6;
//		arr[3]=8d;
//		for (int m=0 ; m < arr.length ; m++)
//		{
//			System.out.println(arr[m]);
//		}
		
		
//      	/* ArrayList String */
//	List<String> al = new ArrayList<>();
//		al.add("ABC");
//		al.add("BCD");
//		al.add("CDE");
//		al.add("DEF");
//		al.add("EFG");
//		al.add("FGH");
//		al.add("GHI");
//		al.add("HIJ");
//		al.add("IJK");
//		al.add("JKL");
//		al.add("ABC");
//		al.add("DEF");
//		
//		//al.clear();
//		//al.remove("GHI");
//		//al.remove(1);
//		
//		//Collections.sort(al); //Alpha Ascending
//		//System.out.println(al);
//		//Collections.reverse(al); //Reverse Only Not Sort
//		//System.out.println(al);
//		//Collections.sort(al, Collections.reverseOrder()); //Alpha Descending
//		//System.out.println(al);
//		
//		//System.out.println(al.contains("DEF")+" " +al.get(11));
//		/* al.set(5,"Tejas");
//		System.out.println(al); */
//		//System.out.println(al.get(5));
//
//		
////		System.out.println("Phone Book RECORD by ArrayList >>> "+al);
////			for (String str:al)
////			{
////				System.out.println(str);
////				str = str + " Tejas";
////				System.out.println(str);
////			}
		
////			/* ArrayList Integer */
////		List<Integer> al= new ArrayList<>();
////		for (int n=0; n<=10; n++)
////		{
////			al.add(n);
////		}
////		System.out.println(al);
		
//			/* ArrayList Character */
//		List<Character> al= new ArrayList<>();
//		al.add('A');
//		al.add('B');
//		System.out.println(al);
////		for (Character character:al)
////		{
////			System.out.println(character);
////		}
		
		
		
//				/* Linked List */
//		LinkedList <String> ll = new LinkedList<>();
//		ll.add("ABC");
//		ll.add("BCD");
//		ll.add("CDE");
//		ll.add("DEF");
//		ll.add("EFG");
//		ll.add("FGH");
//		ll.add("GHI");             
//		ll.add("HIJ");
//		ll.add("IJK");
//		ll.add("JKL");
//		ll.add("ABC");
//		ll.add("DEF");
//		
//		System.out.println(ll);
//		System.out.println(ll.peekFirst());
//		ll.poll();
//		System.out.println(ll);
//		ll.push("Tejas");
//		ll.push("is");  //When We Use push() Method For Adding Data, They Adding From Last Input in LinkedList
//		ll.push("Worst");
//		System.out.println(ll);
//		ll.pop();						//FIFO
//		System.out.println(ll);
//		
//		 ll.remove();
//		 System.out.println(ll);          //FIFO 
//		
//		//System.out.println(ll);
//		//ll.remove(0);
//		//System.out.println(ll);
//		
//		//Collections.sort(ll);          //Alpha Ascending
//		//System.out.println(ll);
//		//Collections.reverse(ll);       //Reverse Only Not Sort
//		//System.out.println(ll);
//		//Collections.sort(ll, Collections.reverseOrder());   //Alpha Descending
//		//System.out.println(ll);
//		
//		//System.out.println(ll.contains("DEF")+" " +ll.get(11));
//		/* ll.set(5,"Tejas");
//		System.out.println(ll); */
//		//System.out.println(ll.get(5));
//		
////		System.out.println("Phone Book RECORD by LinkedList >>> "+ll);
////	for (String str:ll)
////	{
////		System.out.println(str);
////		str = str + " Tejas";
////		System.out.println(str);
////	}
		
//				/* Vector */
//		List <String> v= new Vector<>();
//		v.add("Vector");
//		v.add("is");
//		v.add("Best");
//		v.add("Legacy");
//		v.add("Class");
//		
//		//v.remove(2);
//		System.out.println(v);
//		//v.remove("Best");
//		System.out.println(v);
//		//v.clear();
//		//System.out.println(v);
//		Collections.sort(v); //Alpha Ascending
//		System.out.println(v);
//		Collections.reverse(v); //Reverse Only Not Sort
//		System.out.println(v);
//		Collections.sort(v, Collections.reverseOrder()); //Alpha Descending
//		System.out.println(v);
		
//		System.out.println(v);
//		for (String str:v)
//		{
//			System.out.print(" "+ str);
//		}
		
//				/* Stack */
//		Stack<String> s= new Stack<String>();
//		s.add(" Stack ");
//		s.add("Over");
//		s.add("Flow");
//		s.push("is");
//		s.push("Tejas ");
//		
//		System.out.println(s);
//		s.pop();                     //LIFO
//		System.out.println(s);
		
//		for (String str: s)
//		{
//			System.out.print(str);
//		}
		
	}
	
}
