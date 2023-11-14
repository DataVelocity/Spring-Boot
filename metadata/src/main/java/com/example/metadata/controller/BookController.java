package com.example.metadata.controller;

//PersonController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.metadata.entity.Book;
import com.example.metadata.service.BookService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class BookController {

 private final BookService bookService;

 @Autowired
 public BookController(BookService bookService) {
     this.bookService = bookService;
 }

 @GetMapping
 public List<Book> getAllPersons() {
     return bookService.getAllPersons();
 }

 @GetMapping("/{id}")
 public Optional<Book> getPersonById(@PathVariable String id) {
     return bookService.getPersonById(id);
 }

 @PostMapping("/addbook")
 
 public Book createBook(@RequestBody Book book) {
     return bookService.createBook(book);
 }

 @PutMapping("/{id}")
 public Book updateBook(@PathVariable String id, @RequestBody Book updatedBook) {
     return bookService.updateBook(id, updatedBook);
 }

 @DeleteMapping("/{id}")
 public void deletePerson(@PathVariable String id) {
	 bookService.deletePerson(id);
 }
}
