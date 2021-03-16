package com.careerit.cj.collection;

public class PlayerCountStat {

	private int bowlerCount;
	private int keeperCount;
	private int allRounderCount;
	private double totalAmount;
	private int batsmanCount;

	public PlayerCountStat() {
		super();
	}

	public PlayerCountStat(int bowlerCount, int keeperCount, int allRounderCount, int batsmanCount,double totalAmount) {
		super();
		this.bowlerCount = bowlerCount;
		this.keeperCount = keeperCount;
		this.allRounderCount = allRounderCount;
		this.totalAmount = totalAmount;
		this.batsmanCount = batsmanCount;
	}

	public int getBowlerCount() {
		return bowlerCount;
	}

	public void setBowlerCount(int bowlerCount) {
		this.bowlerCount = bowlerCount;
	}

	public int getKeeperCount() {
		return keeperCount;
	}

	public void setKeeperCount(int keeperCount) {
		this.keeperCount = keeperCount;
	}

	public int getAllRounderCount() {
		return allRounderCount;
	}

	public void setAllRounderCount(int allRounderCount) {
		this.allRounderCount = allRounderCount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getBatsmanCount() {
		return batsmanCount;
	}

	public void setBatsmanCount(int batsmanCount) {
		this.batsmanCount = batsmanCount;
	}

	@Override
	public String toString() {
		return String.format(
				"PlayerCountStat [bowlerCount=%s, keeperCount=%s, allRounderCount=%s, totalAmount=%s, batsmanCount=%s]",
				bowlerCount, keeperCount, allRounderCount, totalAmount, batsmanCount);
	}
	

}
