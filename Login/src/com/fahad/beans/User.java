package com.fahad.beans;

public class User {

//	public static void main(String args[]) {
//		User us = new User("fadbz08@gmail.com", "pass123456");
//		System.out.println(us.validate());
//	}

	String email = "Enter Email";
	String password = "Enter Pass";
	String errorMessage = "";

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public User() {
	}

	public User(String em, String pass) {
		email = em;
		password = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean validate() {

		if (email == null) {
			errorMessage = "You must enter an email";
			System.out.println("email is null");
			return false;
		}

		if (password == null) {
			System.out.println("pass is null");
			errorMessage = "You must enter a password";
			return false;
		}

		if (!email.matches("\\w+@\\w+\\.\\w+")) {
			errorMessage = "Invalid email address!";
			return false;
		}

		if (password.length() < 8) {
			System.out.println("less than 8");
			errorMessage = "Password must be at least 8 characters long.";
			return false;
		}
		if (password.matches("\\w*+\\s+\\w*")) {
			errorMessage = "Password cannot contain space.";
			return false;
		}
		System.out.println("Should be true");
		return true;
	}
}
