package com.tutorialspoint;

public class HelloWorld {
	
	private String message;

	public void getMessage() {
		System.out.println("Your message is: " + this.message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
