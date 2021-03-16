package com.careerit.cj.collection;

import java.util.List;
import java.util.stream.Collectors;

public class PlayerStatServiceImpl implements PlayerStatService {

	private List<Player> playersList;

	{
		playersList = FileReaderUtil.loadPlayersFromFile();
	}

	@Override
	public List<Player> getPlayers() {
		return playersList;
	}

	@Override
	public int countByRole(String role) {
//		int count = 0;
//		for (Player p : playersList) {
//			if (p.getRole().equalsIgnoreCase(role)) {
//				count++;
//			}
//		}
//		return count;
		return (int) playersList.stream().filter(p -> p.getRole().equalsIgnoreCase(role)).count();
	}

	@Override
	public double amountByTeam(String team) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double amountByTeamAndRole(String team, String role) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Player> maxPaidPlayers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> minPidPlayers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double maxAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double minAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Player> getPlayerByTeam(String team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerCountStat> getPlayerCountStat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlayerCountStat getPlayerCountStatByTeam(String name) {
		int bcount = 0;
		int wcount = 0;
		int batsmanCount = 0;
		int acount = 0;
		double totalAmount = 0;

		List<Player> teamPlayers = playersList.stream().filter(p -> p.getTeam().equals(name))
				.collect(Collectors.toList());

		for (Player p : teamPlayers) {
			if (p.getRole().equals("Batsman")) {
				batsmanCount++;
			} else if (p.getRole().equals("Bowler")) {
				bcount++;
			} else if (p.getRole().equals("All Rounder")) {
				acount++;
			} else if (p.getRole().equals("Wicket Keeper")) {
				wcount++;
			}
			totalAmount += p.getPrice();
		}

		PlayerCountStat countStat = new PlayerCountStat(bcount, wcount, acount, batsmanCount, totalAmount);

		return countStat;
	}

	@Override
	public List<Player> sortBy(String fieldName) {
		// TODO Auto-generated method stub
		return null;
	}

}
