package com.collection;

public class SelectionSort 
{
	public static void main(String args[])
	{
		int arr[]= {10,40,5,20,8,6};
		int i,j,temp,min;
		System.out.println("Elements are before sorting:");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(i=0;i<arr.length;i++)
		{
			min=i;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
						min=j;
			}
			if(i!=min)
			{
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		System.out.println("Elements after sorting:");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
