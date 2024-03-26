package com.ildreamteamjsx.firstapp.controller;

import com.ildreamteamjsx.firstapp.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private final BookService bookService ;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @RequestMapping("/books")
    public String getBook(Model model ){
        System.out.println("Sono in getBooks");
        model.addAttribute("books" , bookService.findAllBook());
        return "books" ;
    }


}
