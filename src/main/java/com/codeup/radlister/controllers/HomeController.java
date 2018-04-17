package com.codeup.radlister.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.security.PermitAll;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Welcome Home";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Howdy from Spring!";
    }

    @GetMapping("/about")
    @ResponseBody
    public String about() {
        return "About this Spring!";
    }


    @GetMapping("/hello/{name}")
    @ResponseBody
    public String hello(@PathVariable String name) {
        return "Hi, " + name + "!";
    }

    @GetMapping("/increment/{number}")
    @ResponseBody
    public String increment(@PathVariable int number) {
        return number + " plus 1 is: " + (number + 1);
    }

    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public String add(@PathVariable int num1, @PathVariable int num2) {
        return "The sum of " + num1 + " plus " + num2 + " is " + (num1 + num2);
    }
}
