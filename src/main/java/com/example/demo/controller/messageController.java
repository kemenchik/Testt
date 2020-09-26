package com.example.demo.controller;

import com.example.demo.book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("books")
public class messageController {
    private List<Map<Integer, book>> books = new ArrayList<Map<Integer, book>>() {{

        add(new HashMap<Integer, book>(){{

            book book1 = new book();
            book1.setAuthor("Gogol");
            book1.setName("Dead souls");
            book1.setPageCount(250);
            book1.setBookCount(1);

        put(book1.getBookCount(), book1);

        }});
        add(new HashMap<Integer, book>(){{

            book book2 = new book();
            book2.setAuthor("Pyshkin");
            book2.setName("White parys");
            book2.setPageCount(25);
            book2.setBookCount(2);

            put(book2.getBookCount(), book2);

        }});



    }};
    @GetMapping
    public List<Map<Integer, book>> list() {
        return books;
    }

    @GetMapping("{id}")
    public Map<Integer, book> getOne(@PathVariable Integer id) {
        return books.get(id);
    }
}
