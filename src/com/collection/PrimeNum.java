package com.collection;

public class PrimeNum 
{

	public static void main(String[] args) 
	{
		int count;
		 for (int i = 2; i <= 100; i++)
		 {
	            count = 2;
	         for (int j = 2; j < i; j++) 
	         {
	             if (i % j == 0)
	                count++;
	         }
	         if (count == 2) 
	         {
	             System.out.print(i + " ");
	         }
	      }
	}
}
