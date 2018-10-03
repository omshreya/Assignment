package com.collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args)
	{
			HashMap<Integer, String> rollList = new HashMap<>();
			rollList.put(null, null);
			rollList.put(2, null);
			rollList.put(null,null);
	        System.out.println(rollList);
	        Set<Integer> keys = rollList.keySet();
	        /*for(Integer key: keys)
	        {
	            System.out.println("Value of "+key+" is: "+rollList.get(key));
	        }*/
	        Set<Entry<Integer, String>> entires = rollList.entrySet();
	        for(Entry<Integer,String> ent:entires)
	        {
	            System.out.println(ent.getKey()+" ==> "+ent.getValue());
	        }
	    
	}

}
