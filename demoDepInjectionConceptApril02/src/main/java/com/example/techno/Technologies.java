package com.example.techno;

import org.springframework.stereotype.Component;

@Component

public class Technologies {
	private String nameOfBook;
	private String Auther;
	public String getNameOfBook() {
		return nameOfBook;
	}
	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}
	public String getAuther() {
		return Auther;
	}
	public void setAuther(String auther) {
		Auther = auther;
	}
	public void display()
	{
		System.out.println("this is insde Dependency injection,bye");
	}

}
