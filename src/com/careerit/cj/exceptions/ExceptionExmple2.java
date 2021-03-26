package com.careerit.cj.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExceptionExmple2 {

	public static void main(String[] args) {
			String filePath = "data/name_data.csv";
			try {
				Set<String> names = getNames(filePath);
				System.out.println(names);
			} catch (IOException e) {
				System.out.println("Please check file path:"+e);
			}
	}

	public static List<String> readData(String filePath) throws IOException {
		List<String> list = Files.readAllLines(Paths.get(filePath));
		return list;
	}

	public static Set<String> getNames(String filePath) throws IOException {
		List<String> lines = readData(filePath);
		Set<String> set = new HashSet<String>();
		for (String line : lines) {
			set.addAll(Arrays.asList(line.split(",")));
		}
		return set;
	}
}
