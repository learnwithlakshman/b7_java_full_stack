package com.careerit.cj.collection;

import java.util.List;

public class PlayerStatManager {

		public static void main(String[] args) {
				
					PlayerStatService service = new PlayerStatServiceImpl();
					List<Player> list = service.getPlayers();
					
					System.out.println("Total players is: "+list.size());
					list.stream().forEach(System.out::println);
					
					System.out.println("Batsman Count :"+service.countByRole("Batsman"));
					System.out.println(service.getPlayerCountStatByTeam("RCB"));
		}
}
