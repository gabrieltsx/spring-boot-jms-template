package br.gahlls.example.jmstemplate.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.gahlls.example.jmstemplate.model.Book;

public interface BookRepository extends MongoRepository<Book, String>{

}
