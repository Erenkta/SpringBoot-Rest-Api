package com.springboot.tutorials.books.Services.abstracts;

import java.util.List;
import java.util.Optional;

import com.springboot.tutorials.books.Entity.Book;
import com.springboot.tutorials.books.Entity.dtos.BookDto;

public interface BookService {
	boolean isBookExists(BookDto book); //Bunun amacı update ve create'i birbirinden ayırmamıza yardımcı olmak
	BookDto create(BookDto book);
	Optional<BookDto> findById(String isbn);
	List<BookDto> listBooks();
	void deleteBookById(String isbn);
}
