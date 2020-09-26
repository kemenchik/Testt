package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("books")
public class messageController {
    public List<Map<String, String>> books = new ArrayList<Map<String, String>>() {{

        add(new HashMap<String, String>() {{
            put("id", "1");
            put("avtor", "Gogol");
            put("pageCount", "150");
        }});
        add(new HashMap<String, String>() {{
            put("id", "2");
            put("avtor", "Pyshkin");
            put("pageCount", "200");
        }});
        add(new HashMap<String, String>() {{
            put("id", "3");
            put("avtor", "Gorkii");
            put("pageCount", "250");
        }});

    }};

    @GetMapping
    public List<Map<String, String>> list() {
        return books;
    }

    @GetMapping("{id}")
    public Map<String, String> getOne(@PathVariable String id) {
        return books.stream()
                .filter(books -> books.get("id").equals(id))
                .findFirst()
                .orElseThrow();
    }

}
