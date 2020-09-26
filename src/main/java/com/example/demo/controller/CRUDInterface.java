package com.example.demo.controller;

import com.example.demo.Book;

import java.util.List;
import java.util.Map;

public interface CRUDInterface {

    public void update(Book book);

    public void delete(int Id);

    public Map<Integer, Book> get(int Id);

    public List<Map<Integer, Book>> list();
}
