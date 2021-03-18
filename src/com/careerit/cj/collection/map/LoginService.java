package com.careerit.cj.collection.map;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LoginService {

	private Map<String, User> userMap;
	private AtomicLong atomicLong = new AtomicLong(1000);

	{
		userMap = Stream.of("krish", "manoj", "charan", "jayesh", "suresh")
				.map(name -> new User(atomicLong.incrementAndGet(), name, name + "@123"))
				.collect(Collectors.toMap(user -> user.getUsername(), user -> user));
	}

	public User login(String username, String password) throws UsernameOrPasswordException {
		User user = userMap.get(username);
		if (user != null) {
			if (user.getPassword().equals(password)) {
				return user;
			}
		}

		throw new UsernameOrPasswordException("Please check username and password");
	}

}
