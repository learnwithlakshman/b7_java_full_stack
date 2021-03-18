package com.careerit.cj.collection.map;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		String[] data = "Organisations the world Organisations Organisations over today are playing more and more attention to how to prevent their workforce from getting burnt out due to an unrelenting pace of work"
				.split(" ");
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		for (String word : data) {
			    map.putIfAbsent(word, 0);
				map.put(word, map.get(word)+1);
		}
		System.out.println(map);

	}
}
