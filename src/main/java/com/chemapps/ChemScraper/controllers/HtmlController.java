package com.chemapps.ChemScraper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {


    @GetMapping("/test")
    public String codeForm() {
        System.out.println("HeiHei");
        return "test";
    }
}