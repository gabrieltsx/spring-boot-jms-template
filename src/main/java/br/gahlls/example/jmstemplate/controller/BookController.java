package br.gahlls.example.jmstemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gahlls.example.jmstemplate.model.Book;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private JmsTemplate jmsTemplate;

	@PostMapping("/send")
	public void send(@RequestBody Book book) {
		System.out.println("Sending a book.");
		jmsTemplate.convertAndSend("BookQueue", book);
	}
}
