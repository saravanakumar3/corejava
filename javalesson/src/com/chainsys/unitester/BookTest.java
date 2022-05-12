package com.chainsys.unitester;
import com.chainsys.classandmethods.Book;

public class BookTest {
	public static void testbook() {
		Book firstBook = new Book("MagicWorld");
		
		firstBook.setAuthorName("kumar");
		 firstBook.setBookName("world");
		firstBook.setYearOfRelease(2022);
		System.out.println(firstBook.getYearOfRelease());
		System.out.println(firstBook.getAuthorName());
		System.out.println(firstBook.getBookName());
		
		
	}

}
