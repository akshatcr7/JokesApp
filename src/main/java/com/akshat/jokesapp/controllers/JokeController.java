package com.akshat.jokesapp.controllers;

import com.akshat.jokesapp.services.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private QuoteService quoteService;

    @Autowired
    public JokeController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }


    @RequestMapping({"/",""})
    public String getJoke(Model model){

        model.addAttribute("joke",quoteService.getQuote());

        return "chucknorris";
    }
}
