package com.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_to_ArrayList {
	public static void main(String[] args) {
		
		HashMap<String, Integer> comMap = new HashMap<String, Integer>();
		
		comMap.put("Google", 100);
		comMap.put("Amazon", 120);
		comMap.put("Walmart", 1300);
		comMap.put("Facebook", 1100);
		comMap.put("Apple", 300);
		
		Iterator it = comMap.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry p = (Map.Entry)it.next();
			System.out.println(p.getKey()+" "+p.getValue());
		}
		
		ArrayList<String> company = new ArrayList<String>(comMap.keySet());
		
		//company.addAll(comMap.keySet());
		
		//System.out.println(company);
		
		ArrayList<Integer> emp = new ArrayList<Integer>(comMap.values());
		
		//emp.addAll(comMap.values());
		
		//System.out.println(emp);
		
	}

}
