package com.careerit.cj.collection;

import static java.util.Comparator.comparing;

import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamManager {

	public static void main(String[] args) {

		// Stream

		List<Player> players = FileReaderUtil.loadPlayersFromFile();

//		List<String> namesList = new ArrayList<String>();
//		
//		for(Player player:players) {
//				namesList.add(player.getName());
//		}

		List<String> namesList = players.stream().map(Player::getName).collect(Collectors.toList());

		// Get all players of the "RCB"

		String teamName = "CSK";

//		List<Player> filteredList = new ArrayList<Player>();
//		for(Player player:players) {
//			if(player.getTeam().equals(teamName)) {
//				filteredList.add(player);
//			}
//		}

		List<Player> filteredList = players.stream().filter(p -> p.getTeam().equals(teamName))
				.collect(Collectors.toList());

		// Find the total amount spent by the given team

		DoubleSummaryStatistics summaryStatistics = players.stream().filter(p -> p.getTeam().equals(teamName))
				.mapToDouble(p -> p.getPrice()).summaryStatistics();

		System.out.println("The team : " + teamName + " has " + filteredList.size()
				+ " players and total amount spent on players is :");
		System.out.println(summaryStatistics);

		// Get player Names,Role,Price who are paid 2000000 and team name is CSK

		List<PlayerDTO> names = players.stream().filter(p -> p.getPrice() == 20_00_000 && p.getTeam().equals("CSK"))
				.map(p ->playerToDTO(p)).collect(Collectors.toList());
		System.out.println(names);
		
		// Get player names and display the names in sorting order
		
		System.out.println(players);
		Collections.sort(players,comparing(Player::getName).thenComparing(comparing(Player::getPrice).reversed()));
		System.out.println(players);
		

	}

	private static PlayerDTO playerToDTO(Player p) {
		return new PlayerDTO(p.getName(), p.getTeam(), p.getPrice());
	}
	
	

}
