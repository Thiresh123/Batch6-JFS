package com.javatechie.spring.mongo.resource;

	import java.util.List;
	import java.util.Optional;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.mongo.model.Books;
import com.javatechie.spring.mongo.repository.Bookrepository;

	@RestController
	public class BookController {
		@Autowired
		private Bookrepository repository;

		@PostMapping("/addBooks")
		public String saveBooks(@RequestBody Books books) {
			repository.save(books);
			return "Added Book With Id" + books.getId();
		}

		@GetMapping("/findAllBooks")
		public List<Books> getBooks() {
			return repository.findAll();
		}

		@GetMapping("/findAllBooks/{id}")
		public Optional<Books> getBooks(@PathVariable int id) {
			return repository.findById(id);
		}

		@DeleteMapping("/delete/{id}")
		public String deleteBooks(@PathVariable int id) {
			repository.deleteById(id);
			return "Book deleted with id " + id;
		}

	}


