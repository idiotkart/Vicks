package com.programs;

import java.util.HashMap;
import java.util.Iterator;

//basics about hashmap
public class HashMap_Example {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> nba = new HashMap<Integer, String>();
		
		nba.put(6, "LBJ");
		nba.put(23, "MJ");
		nba.put(24, "Kobe");
		nba.put(9,  "MJ");
		
		System.out.println(nba);
		
		//traversing through iterator
		Iterator<Integer> it = nba.keySet().iterator();
		
		while(it.hasNext())
		{
			Integer key = it.next();
			
			System.out.println(nba.get(key));
		}
	}

}
