package com.example.demo;

public class Book {
    private Integer pageCount;
    private String author;
    private String name;
    private Integer ID;

    public Book(Integer pageCount, String name, String author, Integer ID) {
        setName(name);
        setPageCount(pageCount);
        setID(ID);
        setAuthor(author);
        this.name=getName();
        this.author = getAuthor();
        this.ID = getID();
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

    public Integer getID() {
        return ID;
    }

    public void setID(Integer bookCount) {
        this.ID = bookCount;
    }
}
