package com.careerit.cj.collection;

import java.util.List;

public interface PlayerStatService {

		public List<Player> getPlayers();
		public int countByRole(String role);
		public double amountByTeam(String team);
		public double amountByTeamAndRole(String team,String role);
		public List<Player> maxPaidPlayers();
		public List<Player> minPidPlayers();
		public double maxAmount();
		public double minAmount();
		public List<Player> getPlayerByTeam(String team);
		public List<PlayerCountStat> getPlayerCountStat();
		public PlayerCountStat getPlayerCountStatByTeam(String name);
		public List<Player> sortBy(String fieldName);
}
