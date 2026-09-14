package com.vikash.teluskoAppBysite.web;

import com.vikash.teluskoAppBysite.services.IGreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeluskoController {


    @Autowired
    private IGreetingServices service;


    public TeluskoController(IGreetingServices service) {
        this.service = service;
    }

    @GetMapping("/greet")
    public String generateWish1(Model model) {

        String res = service.generateGreeting();
        System.out.println("Greeting = " + res);

        model.addAttribute("wish", res);

        return "greet";  // this is view page
    }

    @GetMapping("/test")
    public String test() {
        return "greet";
    }
}