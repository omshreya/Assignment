package com.collection;

public class StringRev 
{
	public static void main(String[] args) 
	{
		String name = "sd#%gt%$&dfsd";
		char[] c = name.toCharArray();
		int j = 0;
		for (int i = 0; i < name.length(); i++) 
		{
			if (Character.isLetter(name.charAt(i))) 
			{
		             j++;
		    }
		}
		int k = 0;
		char[] arr = new char[j];
		for (int i = 0; i < name.length(); i++) 
		{
			if (Character.isLetter(name.charAt(i))) 
			{
				arr[k] = name.charAt(i);
				k++;
		   }
		}
		String str = String.valueOf(arr);
		String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
		char arr3[]=reverse.toCharArray();
		int m=0;
		int n=0;
		for(m=0,n=0;m<c.length;m++)
		{
			if (Character.isLetter(c[m]))
			{
			    c[m]=arr3[n];
			    n++;
			}
		}
		System.out.println(c);

	}

}	
