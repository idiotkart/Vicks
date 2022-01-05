package com.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Compare_hashMap {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		
		hm1.put(1, "A");
		hm1.put(2, "B");
		hm1.put(3, "C");
		
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
		
		hm2.put(1, "A");
		hm2.put(2, "B");
		hm2.put(3, "C");
		
		HashMap<Integer, String> hm3 = new HashMap<Integer, String>();
		
		hm3.put(1, "A");
		hm3.put(2, "B");
		hm3.put(3, "C");
		hm3.put(4, "D");
		
		//System.out.println(hm1.equals(hm2));
		
		//System.out.println(hm1.equals(hm3));
		
		//System.out.println(hm1.keySet().equals(hm2.keySet()));
		
		//System.out.println(hm1.keySet().equals(hm3.keySet()));
		
		HashSet<Integer> ck = new HashSet<Integer>(hm1.keySet());
		
		//System.out.println(ck.removeAll(hm2.keySet()));;
		
		//System.out.println(ck.removeAll(hm2.keySet()));
		
		
		
		//System.out.println(new ArrayList<>(hm1.values()).equals(new ArrayList<>(hm2.values())));
		//System.out.println(new ArrayList<>(hm1.values()).equals(new ArrayList<>(hm3.values())));
		
		System.out.println(new ArrayList<>(hm3.values()).removeAll(new ArrayList<>(hm1.values())));
		
		System.out.println(hm3.values());
	}

}
