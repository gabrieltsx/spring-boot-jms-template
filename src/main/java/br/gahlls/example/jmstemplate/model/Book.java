package br.gahlls.example.jmstemplate.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(exclude = "id")
@NoArgsConstructor
@Document(collection = "book")
public class Book {

	@Id
	private String id;
	private String title;
	private Double price;
	
	public Book(String title, Double price) {
		this.title = title;
		this.price = price;
	}
}
