package com.careerit.cj.collection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public final class FileReaderUtil {

	private FileReaderUtil() {

	}

	public static List<Player> loadPlayersFromFile() {
		List<Player> playersList = new ArrayList<Player>();
		try {
			List<String> list = Files.readAllLines(Paths.get("data/ipl_2021.csv"));
			playersList = 
					list.stream()
					.skip(1)
					.map(line -> {
							String[] arr = line.split(",");
							Player player = new Player(arr[0], arr[1], arr[2], arr[3], Double.parseDouble(arr[4]));
							return player;
					}).collect(Collectors.toList());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return playersList;
	}
}
