package com.chainsys.classandmethods;
public class Book {
    private final String bookName;
    private int yearOfRelease;
    private String authorName;
  
    public Book(String str) {
            this.bookName=str;
    }
	public String getBookName() {
		return bookName;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public void setBookName(String string) {
		// TODO Auto-generated method stub
		
	}}