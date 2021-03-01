package com.careerit.cj.basics.oops;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Manager {

		public static void main(String[] args) throws FileNotFoundException {
			
		
			int N = 189;
			Player[] players = new Player[N];
			Scanner sc = new Scanner(new File("data/ipl_2021.csv"));
			sc.nextLine(); // to skip headers
			int count = 0;
			while(sc.hasNext()) {
				int i = 0;
				String line = sc.nextLine();
				String[] arr = line.split(",");
				String name = arr[i++];
				String role = arr[i++];
				String country = arr[i++];
				String teamName = arr[i++];
				double price = Double.parseDouble(arr[i++]);
				Player player = new Player(name, teamName, country, role, price);
				players[count++] = player;
			}
			
			System.out.println("Total players :"+players.length);
			
			// Can you print name of all the players
			
			for(Player player:players) {
				System.out.println(player.getName());
			}
			
			// Display players of the RCB
			
			System.out.println("------------------Players of RCB----------------");
			
			
			for(int i=0;i<players.length;i++) {
				Player player = players[i];
				if(player.getTeamName().equals("RCB")) {
						player.showDetails();
						
						System.out.println("--------------------------------");
						
				}
			}
			
			// Display total, avg, count , max , min amounts of the RCB
			
			int rcb_count = 0;
			for(Player player:players) {
				if(player.getTeamName().equals("RCB")) {
					rcb_count++;
				}
			}
			
			Player[] player_rcb = new Player[rcb_count];
			int c = 0;
			for(Player player:players) {
				if(player.getTeamName().equals("RCB")) {
					player_rcb[c++] = player;
				}
			}
			
			// Max, Min, Total, Avg,
			
			double max = player_rcb[0].getPrice(), min = player_rcb[0].getPrice(), total = 0, avg = 0;
			
			for(Player player:player_rcb) {
					double price = player.getPrice();
					if(max < price) {
						max = price;
					}
					if(min > price) {
						min = price;
					}
					
					total += price;
					
			}
			avg = total /(float) player_rcb.length;
			
			System.out.println("Min Amount :"+min);
			System.out.println("Max Amount :"+max);
			System.out.println("Count      :"+player_rcb.length);
			System.out.println("Avg Amount :"+avg);
		}
}
