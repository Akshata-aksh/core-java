package com.xworkz.map_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Chocolate {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap();
		map.put("Kit kat", 50);
		map.put("Munch", 30);
		map.put("Dairy Milk", 80 );
		map.put("Milky bar", 20 );
		map.put("5 Star", 60 );
		map.put("Snicker", 100 );
		map.put("Perk", 10);
		map.put("Crunch", 50 );
		map.put("Bournville", 200 );
		map.put("Gems", 5 );
		
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
		
//		Set<Entry<String, Integer>> entries = map.entrySet();
		
//		for(Entry<String, Integer> entry: entries) {
//			System.out.println(entry.getKey() + " "+entry.getValues);
//		}
		
		
		
		
		

	}

}



