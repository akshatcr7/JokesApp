package com.akshat.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class QuoteSericeImpl implements QuoteService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public QuoteSericeImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
