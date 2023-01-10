package com.xworkz.map_collection;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class PgName {

	public static void main(String[] args) {
	
		Map<String, Integer> map = new HashMap();
		map.put("Golden pg", 52500);
		map.put("Manjunath pg", 5000);
		map.put("Yamuna pg", 5300 );
		map.put("Ganga pg", 5400 );
		map.put("Krishna pg", 5600 );
		map.put("Laxmi pg", 60000 );
		map.put("Abc pg", 6200);
		map.put("Arp pg", 6700 );
		map.put("Kavya pg", 6800 );
		map.put("Up", 7000 );
		
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
