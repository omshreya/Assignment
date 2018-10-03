package com.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Comp<K,V extends Comparable> implements Comparator<K>
{
	private Map<K,V> map;

	public Comp(Map<K,V> map) 
	{
		this.map = new TreeMap<>(map);
	}

	@Override
	public int compare(K s1, K s2) 
	{
		return map.get(s1).compareTo(map.get(s2));
	}
}
public class MapComp 
{
	public static <K,V> Map<K,V> sortByValues(Map<K,V> map)
	{
		Comparator<K> comparator = new Comp(map);

		Map<K,V> sortedMap = new TreeMap<>(comparator);
		sortedMap.putAll(map);

		return sortedMap;
	}
	
	public static void main(String[] args)
	{
		Map<Integer,String> map=new TreeMap<>();
		map.put(1,"Shreya");
		map.put(2, "Omkar");
		map.put(3, "Poonam");
		map = sortByValues(map);
		System.out.println("Sorted Map by Values : " + map);
	}

}
