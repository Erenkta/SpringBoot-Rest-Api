package com.springboot.tutorials.books.Data;

import com.springboot.tutorials.books.Entity.Book;
import com.springboot.tutorials.books.Entity.dtos.BookDto;

public final class TestData {
	private TestData() {
		
	}
	public static BookDto testBookDto() {
		return BookDto.builder() 
				.isbn("02345678")
				.author("Virginia Woolf")
				.title("The Waves")
				.build();
	}
	public static Book testBookEntity() {
		return Book.builder() 
				.isbn("02345678")
				.author("Virginia Woolf")
				.title("The Waves")
				.build();
	}
}
