package com.xworkz.map_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class City {
	public static void main(String[] args) {
		
		
		Map<String, Double> map = new HashMap();
		map.put("Bagalkot", 27.43);
		map.put("Udupi", 23.45);
		map.put("Bangalore", 29.47 );
		map.put("Hubli",  23.67);
		map.put("Belgaum", 26.37 );
		map.put("Bijapur",  28.48);
		map.put("Mangalore",29.76);
		map.put("Mysuru",  27.67);
		map.put("Ballary", 24.78 );
		map.put("Mandya", 25.46);
		
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
		
		Collection<Double> values =map.values();
		values.forEach(v->System.out.println(v));
		
//		Set<Entry<String, Integer>> entries = map.entrySet();
		
//		for(Entry<String, Integer> entry: entries) {
//			System.out.println(entry.getKey() + " "+entry.getValues);
//		}
		
		
		
		
		

	}

}






