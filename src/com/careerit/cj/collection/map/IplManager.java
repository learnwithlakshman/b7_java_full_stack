package com.careerit.cj.collection.map;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.careerit.cj.collection.FileReaderUtil;
import com.careerit.cj.collection.Player;

public class IplManager {

	public static void main(String[] args) {
		List<Player> players = FileReaderUtil.loadPlayersFromFile();
		players.stream().forEach(p -> System.out.println(p));

		// Get players of each team
//		Map<String, List<Player>> map = new HashMap<>();
//
//		for (Player p : players) {
//
//			map.putIfAbsent(p.getTeam(), new ArrayList<Player>());
//			List<Player> plist = map.get(p.getTeam());
//			plist.add(p);
//			map.put(p.getTeam(), plist);
//		}
		
		Map<String, List<Player>> map = players.stream().collect(Collectors.groupingBy(Player::getTeam,Collectors.toList()));
		map.entrySet().forEach(ele->{
			System.out.println("----------------------------");
			System.out.println("Team :"+ele.getKey());
			System.out.println("--------- Players-----------");
			ele.getValue().forEach(p->{
				System.out.println(p);
			});
		});
		// Total amount spend to each team
		Map<String, Double> mapSum = players.stream().collect(Collectors.groupingBy(Player::getTeam,Collectors.summingDouble(Player::getPrice)));
		System.out.println(mapSum);
		

	}
}
