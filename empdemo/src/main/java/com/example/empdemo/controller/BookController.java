package com.example.empdemo.controller;

import com.example.empdemo.model.Book;
import com.example.empdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BookController {
    @Autowired
     private BookService  bookService;
    @Autowired
    Book book;
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listBooks",bookService.getAllBooks());
        return "index";
    }
    @GetMapping("/showNewBookForm")
    public String showNewBookForm(Model model){
        Book book=new Book();
        model.addAttribute("book",book);
        return "new_book";
    }
    @PostMapping("/saveBook")
    public String saveBook(@ModelAttribute("book") Book book){
        bookService.saveBook(book);
        return "redirect:/";
    }
}
