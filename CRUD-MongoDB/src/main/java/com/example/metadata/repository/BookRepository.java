package com.example.metadata.repository;


//PersonRepository.java
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.metadata.entity.Book;

public interface BookRepository extends MongoRepository<Book, String> {
}