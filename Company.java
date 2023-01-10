package com.xworkz.map_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Company {

	public static void main(String[] args) {
	
			
			Map<String, Integer> map = new HashMap();
			map.put("Infosys", 5250);
			map.put("Microsoft", 5000);
			map.put("Capgemini", 5300 );
			map.put("Quest", 5400 );
			map.put("Cognizant", 5600 );
			map.put("IBM", 60000 );
			map.put("Synchrony", 6200);
			map.put("Oracle", 6700 );
			map.put("Adobe", 6800 );
			map.put("Dell", 7000 );
			
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

	

	