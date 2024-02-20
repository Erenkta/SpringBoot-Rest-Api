package com.springboot.tutorials.books.Entity.dtos;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto { //Dto oluşturmamızın temel sebebi Main Entity Class'ına etki etmeden istediğimiz gibi Entity'e şekil vermek


	@Id
	private String isbn;
	
	private String author;
	private String title;
}
