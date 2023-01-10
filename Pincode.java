package com.xworkz.map_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Pincode {

	public static void main(String[] args) {
	
			
			Map<String, Integer> map = new HashMap();
			map.put("Bagalkot", 587101);
			map.put("Udupi", 574118);
			map.put("Bangalore", 560001 );
			map.put("Hubli", 580020 );
			map.put("Belgaum", 590001 );
			map.put("Bijapur", 586103 );
			map.put("Mangalore", 574142);
			map.put("Mysuru", 570001 );
			map.put("Ballary", 583101 );
			map.put("Mandya", 571401);
			
			System.out.println(map);
			
			System.out.println(map.size());
			if(map.isEmpty()) {
				System.out.println("It is empty");
			}
			else {
				System.out.println("it is not empty");
			}
			
			Set<String> keys = map.keySet();
			keys.forEach(e->System.out.println(e));
			
			Collection<Integer> values =map.values();
			values.forEach(v->System.out.println(v));
			
//			Set<Entry<String, Integer>> entries = map.entrySet();
			
//			for(Entry<String, Integer> entry: entries) {
//				System.out.println(entry.getKey() + " "+entry.getValues);
//			}
			
			
			
			
			

		}

	}


	
