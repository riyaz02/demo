package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @GetMapping("api/books")

    public String getBooks(){
        return "List of Books";
    }
}
