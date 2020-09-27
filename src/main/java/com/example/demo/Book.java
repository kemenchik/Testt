package com.example.demo;

public class Book {
    private Integer pageCount;
    private String author;
    private String name;
    private Integer bookCount;

    public Book(Integer pageCount, String name, String author, Integer bookCount) {
        setName(name);
        setPageCount(pageCount);
        setBookCount(bookCount);
        setAuthor(author);
        this.name=getName();
        this.author = getAuthor();
        this.bookCount = getBookCount();
        this.pageCount = getPageCount();
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBookCount() {
        return bookCount;
    }

    public void setBookCount(Integer bookCount) {
        this.bookCount = bookCount;
    }
}
