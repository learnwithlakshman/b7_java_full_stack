package com.careerit.cj.collection;

public class PlayerDTO {

	private String name;
	private String role;
	private double price;

	public PlayerDTO() {
	}

	public PlayerDTO(String name, String role, double price) {
		this.name = name;
		this.role = role;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("PlayerDTO [name=%s, role=%s, price=%s]", name, role, price);
	}

}
