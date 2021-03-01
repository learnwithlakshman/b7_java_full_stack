package com.careerit.cj.basics.oops;

public class Player {

	private String name;
	private String teamName;
	private String country;
	private String role;
	private double price;
	
   
	public Player(String name, String teamName, String country, String role, double price) {
		this.name = name;
		this.teamName = teamName;
		this.country = country;
		this.role = role;
		this.price = price;
	}

	public void showDetails() {
		System.out.println("Name :" + name + "\nTeam :" + teamName + "\nCountry :" + country + "\nRole :" + role
				+ "\nPrice :" + price);
	}

	public String getName() {
		return name;
	}

	public String getTeamName() {
		return teamName;
	}

	public String getCountry() {
		return country;
	}

	public String getRole() {
		return role;
	}

	public double getPrice() {
		return price;
	}

	
	

}
