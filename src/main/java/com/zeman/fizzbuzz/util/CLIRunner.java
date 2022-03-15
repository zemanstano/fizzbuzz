package com.zeman.fizzbuzz.util;

import com.zeman.fizzbuzz.service.FizzBuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!test")
public class CLIRunner implements CommandLineRunner {

    @Autowired
    private FizzBuzzService fizzBuzzService;

    @Override
    public void run(String... args) {
        System.out.println(fizzBuzzService.generateFizzBuzz(1,100));
    }
}
