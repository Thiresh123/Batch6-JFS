package com.javatechie.spring.mongo.repository;



	import org.springframework.data.mongodb.repository.MongoRepository;

     import com.javatechie.spring.mongo.model.Books;

	public interface Bookrepository extends MongoRepository<Books, Integer>
	{

	}


