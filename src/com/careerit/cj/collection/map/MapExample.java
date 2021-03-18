package com.careerit.cj.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

		public static void main(String[] args) {
			Map<String,Integer> map = new HashMap<>();
			map.put("Krish", 1001);
			map.put("Manoj",1020);
			map.putIfAbsent("Tanvi", 1050);
			map.put("Krish", 2001);
			
			Set<String> keys = map.keySet();
			for(String key:keys) {
				System.out.println(key +" = "+map.get(key));
			}
			
			Collection<Integer> values = map.values();
			for(Integer value:values) {
				System.out.println(value);
			}
			
			Set<Entry<String, Integer>> entrySet = map.entrySet();
		    for(Entry<String, Integer> entry:entrySet) {
		    	System.out.println(entry.getKey()+" "+entry.getValue());
		    }
		}
}
