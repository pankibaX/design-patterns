package com.pankiba.designpatterns.creational.builder;

import lombok.ToString;

@ToString
public class User {

	// Required fields
	private final String firstName;
	private final String lastName;

	// Optional fields
	private final int age;
	private final String phone;
	private final String address;

	// Private constructor (only Builder can create User)
	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}

	// Builder class
	public static class UserBuilder {
		
		private final String firstName;
		private final String lastName;

		private int age = 0; // default
		private String phone = ""; // default
		private String address = ""; // default

		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}

		public User build() {
			User user = new User(this);
			validateUserObject(user);
			return user;
		}

		private void validateUserObject(User user) {
			// Validation logic
			if (user.firstName == null || user.lastName == null) {
				throw new IllegalArgumentException("First and last name are required");
			}
		}
	}
}
