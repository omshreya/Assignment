package com.collection;

import java.util.LinkedList;
import java.util.Scanner;

public class LRU 
{
	
	public static void main(String[] args)
	{
		int choice;
		LinkedList<Integer> list=new LinkedList<>();
		list.addFirst(7);
		list.addFirst(0);
		list.addFirst(1);
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter your choice:\n 1:Display \n 2:Add Element");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1 : list.forEach(value->System.out.println(value));
						 break;
						 
				case 2 : System.out.println("Enter value:");
						 int num=sc.nextInt();
						 if(list.size()==3)
						 {
								if(!(list.contains(num)))
								{
									list.removeLast();
									list.addFirst(num);
								}
								else
								{
									/*int ind=list.indexOf(num);
									if(ind==1)
									{
										int e=list.get(0);
										list.remove(ind);
										list.set(0, num);
										list.add(1, e);
									}
									else if(ind==2)
									{
										int e=list.get(0);
										//int e1=list.get(1);
										list.remove(ind);
										list.set(0, num);
										list.add(1, e);
										//list.add(2, e1);
									}
									else
									{
										System.out.println(list);
									}*/
									
									int ind=list.indexOf(num);
									list.remove(ind);
									list.addFirst(num);
								}
						  }
						  else
						  {
								list.add(num);
								System.out.println(list);
						  }
			}
		}while(choice!=0);
		
		
	}

}
