package com.example.empdemo.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name="books")
@Component
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookid;
    @Column(name="book_name",nullable = false)
    private String bookName;
    @Column(name="author_name",nullable = false)
    private String authorname;
    @Column(name="price",nullable = false)
    private int price;
    @Column(name="no_of_copies",nullable = false)
    private int numofcopies;

    public long getBookid() {
        return bookid;
    }

    public void setBookid(long bookid) {
        this.bookid = bookid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumofcopies() {
        return numofcopies;
    }

    public void setNumofcopies(int numofcopies) {
        this.numofcopies = numofcopies;
    }
}
