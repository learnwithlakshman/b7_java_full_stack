package com.careerit.cj.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Manager {

		public static void main(String[] args) {
			
			String[] data = "Lakshman,Swathi,Anish,Aruna,Jojappa,Nirmala,Tanvi,Dhatri,Haadya,Hrudaya,Manoj,Charan,Krish,Balu,Srinu,Venkat,Sunny,Bunny".split(",");
			List<String> list = new ArrayList<>();
			for(String name:data) {
				list.add(name);
			}
			System.out.println("Names count :"+list.size());
			
			// Traditional for loop
			
			for(int i=0;i<list.size();i++) {
				String name = list.get(i);
				System.out.println(name);
			}
			
			// For-each loop
			System.out.println("Processing using for-each loop");
			for(String name:list) {
				System.out.println(name);
			}
			
			// Using Iterator Interface
			System.out.println("Processing using Iterator");
			
			Iterator<String> itr = list.iterator();
			while(itr.hasNext()) {
				String name = itr.next();
				System.out.println(name);
			}
			
			// Using ListIterator Interface
			
			ListIterator<String> listItr = list.listIterator();
			while(listItr.hasNext()) {
				String name = listItr.next();
				System.out.println(name);
			}
			
			while(listItr.hasPrevious()) {
				String name = listItr.previous();
				System.out.println(name);
			}
			System.out.println("---------------------------------- using streams-------------------------------");
			// Java-8
			list.stream().forEach(System.out::println);
			
			List<Integer> numList = new ArrayList<Integer>();
			numList.add(1001);
			numList.add(1002);
			numList.add(1003);
			numList.add(1004);
			List<Integer> l = Arrays.asList(1010,1040);
			System.out.println(numList.containsAll(l));
			numList.remove(new Integer(1001));
			System.out.println(numList.size());
			System.out.println(numList.isEmpty());
			numList.addAll(2,l);
			System.out.println(numList);
		}
}
