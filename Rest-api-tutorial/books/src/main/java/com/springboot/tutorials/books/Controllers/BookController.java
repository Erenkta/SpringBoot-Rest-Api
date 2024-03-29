package com.springboot.tutorials.books.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.tutorials.books.Entity.dtos.BookDto;
import com.springboot.tutorials.books.Services.abstracts.BookService;

@RestController
public class BookController {
	private final BookService bookService;
	
	@Autowired
	public BookController(final BookService bookService) {
		this.bookService = bookService;
	}
	
	@PutMapping(path = "/books/{isbn}")
	public ResponseEntity<BookDto> createUpdateBook(@PathVariable final String isbn // bu endpoint'in path'indeki veriyi çekeceğimizi söylüyoruz
			,@RequestBody final BookDto book){ //Bu endpointe bir Body geleceğini bildiriyoruz
		
		book.setIsbn(isbn); // path'deki isbn ile verilen body'deki isbn çakışmasın diye eşitledik
		
		final boolean existance = bookService.isBookExists(book);
		final BookDto response = bookService.create(book);
		
		if(existance) { // eğer book var ise bunu güncelledik üstüne yazdık yani daha sonra da OK döndürdük
			return new ResponseEntity<BookDto>(response,HttpStatus.OK);
		}else {
			return new ResponseEntity<BookDto>(response,HttpStatus.CREATED);
		}
		

		
		
		
	}
	
	@GetMapping(path = "/books/{isbn}")
	public ResponseEntity<BookDto> getBook(@PathVariable String isbn){
		final Optional<BookDto> result = bookService.findById(isbn);
		return result.map(book-> new ResponseEntity<BookDto>(book,HttpStatus.FOUND))
		.orElse(new ResponseEntity<BookDto>(HttpStatus.NOT_FOUND));
	}
	@GetMapping(path = "/books")
	public ResponseEntity<List<BookDto>> getBook(){
		return new ResponseEntity<List<BookDto>>(bookService.listBooks(),HttpStatus.OK);
	}
	
	@DeleteMapping(path="/books/{isbn}")
	public ResponseEntity deleteBookById(@PathVariable String isbn) {
		bookService.deleteBookById(isbn);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
