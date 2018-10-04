package com.collection;

public class NextLine 
{

	public static void main(String[] args) 
	{
		String str="He is a very very good boy,isn't he?";

		char arr[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(arr[i]==' ' || arr[i]==',' || arr[i]=='?' || arr[i]=='\'')
			{
			System.out.println();
			}
			else
			{
				System.out.print(arr[i]);
		}
		}
	}

}
