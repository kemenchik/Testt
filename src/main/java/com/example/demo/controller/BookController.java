package com.example.demo.controller;

import com.example.demo.Book;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.*;



@RestController

@RequestMapping("books")

public class BookController {
    Book book1 = new Book(250, "Dead souls", "Gogol", 14554);
    Book book2 = new Book(25, "White parys", "Pyshkin", 24554);
    protected List<Book> books = new ArrayList<Book>() {{

    }};

    @PostConstruct
    private void postConstruct() {

        books.add(book1);
        books.add(book2);
    }


    @GetMapping
    public List<Book> list() {

        return books;
    }

    @GetMapping("{id}")
    public Book get(@PathVariable int id) {
        return getBook(id - 1);
    }

    private Book getBook(@PathVariable Integer id) {
        return books.get(id);
    }

    @PostMapping()
    public Book create(@RequestBody Book newBook) {

        books.add(newBook);
        return newBook;

    }

    @PutMapping("{id}")
    public Book update(@PathVariable Integer id, @RequestBody Book thisBook) {
        
        books.set(id, thisBook);
        return thisBook;
    }

    @DeleteMapping
    public void delete(@PathVariable Integer id) {
        Book bookForDelete = getBook(id - 1);
        books.remove(bookForDelete);
    }
}
