package com.programs;

import java.util.HashMap;

public class Test3 {
	public static void main(String[] args) {
		
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		
		String str = "I am learning java";
		
		char chr[] = str.toCharArray();
		
		for(Character c:chr)
		{
			if(!c.equals(' ')) 
			{
			if(hs.containsKey(c))
			{
				hs.put(c, hs.get(c)+1);
			}
			
			else
			{
				hs.put(c, 1);
			}
		}
		}
		
		System.out.println(hs);
	}

}
