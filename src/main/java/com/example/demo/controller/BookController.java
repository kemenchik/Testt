package com.example.demo.controller;

import com.example.demo.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("books")
public class BookController implements CRUDInterface{

    protected List<Map<Integer, Book>> books = new ArrayList<Map<Integer, Book>>() {{

        add(new HashMap<Integer, Book>() {{

            Book book1 = new Book();
            book1.setAuthor("Gogol");
            book1.setName("Dead souls");
            book1.setPageCount(250);
            book1.setBookCount(1);


        }});
        add(new HashMap<Integer, Book>() {{

            Book book2 = new Book();
            book2.setAuthor("Pyshkin");
            book2.setName("White parys");
            book2.setPageCount(25);
            book2.setBookCount(2);

        }});

    }};

    @Override
    public void update(Book book) {
        //Не знаю что тут должно быть
    }

    @Override
    public void delete(int id) {
        books.remove(id);
    }

    @GetMapping
    @Override
    public List<Map<Integer, Book>> list() {
        return books;
    }

    @GetMapping
    @Override
    public Map<Integer, Book> get(@PathVariable int id) {
        return books.get(id - 1);
    }

}
