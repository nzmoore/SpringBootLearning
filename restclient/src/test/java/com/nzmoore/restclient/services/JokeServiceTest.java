package com.nzmoore.restclient.services;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JokeServiceTest {
    private Logger logger = LoggerFactory.getLogger(JokeServiceTest.class);
    @Autowired
    private JokeService jokeService;

    @Test
    void getJoke() {
        String joke = jokeService.getJoke("Bill", "Moore");
        logger.info("The Joke is {}", joke);
        assertTrue(joke.contains("Bill") || joke.contains("Moore"));

    }
}