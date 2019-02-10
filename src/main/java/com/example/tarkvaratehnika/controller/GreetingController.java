package com.example.tarkvaratehnika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

    @Controller
    public class GreetingController {

        @GetMapping("/index")
        public String greeting() {
            return "index";
        }

    }