package com.collection;


public class Anagram 
{
	public static void sortArray(char a[])
	{
		int n=a.length;
		char temp;
		 for(int i=0; i<(n-1); ++i) 
		 {
			   for(int j = i + 1; j > 0; --j)
			   {
				   if(a[j] < a[j-1])
				   {
					     temp = a[j];
					     a[j] = a[j - 1];
					     a[j - 1] = temp;
				   }
			   }
		 }
		 System.out.print("Values: " );
		  for (int b = 0 ; b <n; b++) 
		  {
			  System.out.print(a[b]) ;
		  }
	}

	public static boolean isEqual(char a[],char a1[])
	{
		
			int len=a.length;
			for(int i=0;i<len;i++)
				if(a[i]!=a1[i])
					return false;
				return true;
		 
	}
	public static void main(String[] args) 
	{	
		String str= "ANAGRAMA";
		char arr[]=str.toCharArray();
		String str1="MANAGRAM";
		char arr1[]=str1.toCharArray();
		sortArray(arr);
		sortArray(arr1);
		if(arr.length==arr1.length)
		{
			if(isEqual(arr,arr1))
		    {
				System.out.println("It is a anagram");
		    }
			else
			{
				System.out.println("It is a not anagram");
			}
				
		}
		else
		{
			System.out.println("It is not equal");
		}
	}	
}
