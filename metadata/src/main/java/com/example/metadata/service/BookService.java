package com.example.metadata.service;

//PersonService.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.metadata.entity.Book;
import com.example.metadata.repository.BookRepository;

//import com.example.metadata.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

 private final BookRepository bookRepository;

 @Autowired
 public BookService(BookRepository bookRepository) {
     this.bookRepository = bookRepository;
 }

 public List<Book> getAllPersons() {
     return bookRepository.findAll();
 }

 public Optional<Book> getPersonById(String id) {
     return bookRepository.findById(id);
 }

 public Book createBook(Book book) {
     return bookRepository.save(book);
 }

 public Book updateBook(String id, Book updatedBook) {
     Optional<Book> existingBook = bookRepository.findById(id);

     if (existingBook.isPresent()) {
         Book book = existingBook.get();
         book.setName(updatedBook.getName());
         book.setAge(updatedBook.getAge());
         return bookRepository.save(book);
     } else {
         // Handle not found case
         return null;
     }
 }

 public void deletePerson(String id) {
     bookRepository.deleteById(id);
 }
}
