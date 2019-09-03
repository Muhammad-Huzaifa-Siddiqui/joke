package com.huzaifa.joke.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesImplementation implements JokeInterface {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesImplementation(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String joke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
