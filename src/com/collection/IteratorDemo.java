package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class IteratorDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		/*System.out.println("Enter value:");
		int i=sc.nextInt();*/
		list.add(2);
		list.add(5);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(4);
		list.add(3);
		list.add(10);
		System.out.println(list);
		/*List<Integer> list1=new ArrayList<>();
		for (Integer integer : list)
		{
		    if (integer%2==0) 
		    {
		       list1.add(integer);
		    	list.remove(integer);
		    }
		   else
		    {
		    	list.remove(integer);
		    }
		}
		System.out.println(list1);
		System.out.println(list);*/
		
		/*Iterator<Integer> itr = list.iterator();
	    while (itr.hasNext())
	    {
	      Integer s = itr.next();
	      if (s%2==0) 
	      {
	        list.remove(s);
	      }
	    }
	    System.out.println(list);*/
		
		ListIterator<Integer> itr = list.listIterator();
	    while (itr.hasNext())
	    {
	      Integer s = itr.next();
	      if (!(s%2==0)) 
	      {
	        //list.remove(s);
	    	  itr.remove();
	      }
	    }
	    System.out.println(list);
	    System.out.println(list.size());
	}

}
