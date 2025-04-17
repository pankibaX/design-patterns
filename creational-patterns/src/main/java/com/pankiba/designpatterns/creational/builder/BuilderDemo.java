package com.pankiba.designpatterns.creational.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		
		User user1 = new User.UserBuilder("John", "Doe").age(30).phone("1234567").address("123 Main St").build();
		System.out.println(user1);
		
		User user2 = new User.UserBuilder("Jane", "Smith").age(25).build(); // Only required fields + age
		System.out.println(user2);
		
		User user3 = new User.UserBuilder("Bob", "Johnson").address("456 Oak Ave").build(); // Only required fields +
																							// address
	}
}
