package com.collection;

import java.util.Stack;

public class BalanceCheck 
{
	public static boolean isMatch(char c1,char c2)
	{
		if(c1=='(' && c2==')')
			return true;
		else if(c1=='{' && c2=='}')
			return true;
		else if(c1=='[' && c2==']')
			return true;
		else
			return false;
	}
	
	public static boolean check(String s)
	{
		char v[]=s.toCharArray();
		Stack<Character> st=new Stack<>();
		int i=0;
		for(i=0;i<v.length;i++)
	    {
	           
	          if (v[i] == '{' || v[i] == '(' || v[i] == '[')
	            st.push(v[i]);
	      
	          if (v[i] == '}' || v[i] == ')' || v[i] == ']')
	          {
	             if (st.isEmpty())
	               {
	                   return false;
	               } 
	      
	             else if ( !isMatch(st.pop(), v[i]) )
	               {
	                   return false;
	               }
	          }
	           
	    }
		if (st.isEmpty())
	         return true;
	    else
	    {  
	             return false;
	    } 
	}
	public static void main(String[] args) 
	{
		//String s="{(a+b)*(c+d)}";
		String s1="({a-b)}";
		boolean status=check(s1);
		if(status==true)
		{
			System.out.println("It is a balanced");
		}
		else
		{
			System.out.println("It is a not balanced");
		}
	}

}
