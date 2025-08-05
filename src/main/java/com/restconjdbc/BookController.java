package com.restconjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/springbootjdbc")
public class BookController {

    @Autowired
    private BookDAO bookDAO;

    @GetMapping("/books")
    public List<Book> fetchAllBooks() {
        return bookDAO.getAllBooks();
    }
}
