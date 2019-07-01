package br.gahlls.example.jmstemplate.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import br.gahlls.example.jmstemplate.model.Book;
import br.gahlls.example.jmstemplate.repository.BookRepository;

@Component
public class BookReceiver {

	@Autowired
	private BookRepository bookRepository;
	
	private int count = 1;

	@JmsListener(destination = "BookQueue", containerFactory = "myFactory")
	public void receiveMessage(Book book) {
		System.out.println("<" + count + "> Received <" + book + ">");
		count++;
//	    throw new RuntimeException(); // Test myFactory
		bookRepository.save(book);
	}
}
