package com.chemapps.ChemScraper.controllers;

import com.chemapps.ChemScraper.CodeInput;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HtmlController {


    @GetMapping("/test")
    public String codeForm() {
        System.out.println("HeiHei");
        return "test";
    }

    @GetMapping("/search")
    public String searchForm() {
        System.out.println("YoYo");
        return "search";
    }

    @GetMapping("/form")
    public String form() {
        System.out.println("form");
        return "form";
    }


}