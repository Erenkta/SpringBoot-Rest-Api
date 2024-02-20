package com.springboot.tutorials.books.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.tutorials.books.Entity.Book;

@Repository //Spring'e tanıtmaktan ziyade bu class'ı Spring Context'e de ekler
public interface BookRepository extends JpaRepository<Book, String> {

}
