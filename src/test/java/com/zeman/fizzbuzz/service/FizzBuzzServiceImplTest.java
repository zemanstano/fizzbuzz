package com.zeman.fizzbuzz.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
@TestPropertySource(properties = { "fizzbuzz.config={3:'fizz',5:'buzz',15:'fizzbuzz'}" })
class FizzBuzzServiceImplTest {

    @Autowired
    FizzBuzzService fizzBuzzService;

    @Test
    void testGetPhraseForNumber() {
        assertEquals("1", fizzBuzzService.getPhraseForNumber(1));
        assertEquals("fizz", fizzBuzzService.getPhraseForNumber(3));
        assertEquals("buzz", fizzBuzzService.getPhraseForNumber(5));
        assertEquals("fizz", fizzBuzzService.getPhraseForNumber(6));
        assertEquals("buzz", fizzBuzzService.getPhraseForNumber(10));
        assertEquals("fizzbuzz", fizzBuzzService.getPhraseForNumber(15));
        assertEquals("fizzbuzz", fizzBuzzService.getPhraseForNumber(30));
    }

    @Test
    void testGenerateFizzBuzz() {
        assertEquals(FIZZBUZZ, fizzBuzzService.generateFizzBuzz(1, 100));
        assertEquals("1", fizzBuzzService.generateFizzBuzz(1, 1));

        //invalid bounds should return an empty string
        assertEquals("", fizzBuzzService.generateFizzBuzz(10, 1));
    }
    
    
    private static final String FIZZBUZZ = new StringBuilder().append("1").append(System.lineSeparator()).append("2").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("4").append(System.lineSeparator()).append("buzz").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("7").append(System.lineSeparator()).append("8").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("buzz").append(System.lineSeparator()).append("11").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("13").append(System.lineSeparator()).append("14").append(System.lineSeparator()).append("fizzbuzz").append(System.lineSeparator()).append("16").append(System.lineSeparator()).append("17").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("19").append(System.lineSeparator()).append("buzz").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("22").append(System.lineSeparator()).append("23").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("buzz").append(System.lineSeparator()).append("26").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("28").append(System.lineSeparator()).append("29").append(System.lineSeparator()).append("fizzbuzz").append(System.lineSeparator()).append("31").append(System.lineSeparator()).append("32").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("34").append(System.lineSeparator()).append("buzz").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("37").append(System.lineSeparator()).append("38").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("buzz").append(System.lineSeparator()).append("41").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("43").append(System.lineSeparator()).append("44").append(System.lineSeparator()).append("fizzbuzz").append(System.lineSeparator()).append("46").append(System.lineSeparator()).append("47").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("49").append(System.lineSeparator()).append("buzz").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("52").append(System.lineSeparator()).append("53").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("buzz").append(System.lineSeparator()).append("56").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("58").append(System.lineSeparator()).append("59").append(System.lineSeparator()).append("fizzbuzz").append(System.lineSeparator()).append("61").append(System.lineSeparator()).append("62").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("64").append(System.lineSeparator()).append("buzz").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("67").append(System.lineSeparator()).append("68").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("buzz").append(System.lineSeparator()).append("71").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("73").append(System.lineSeparator()).append("74").append(System.lineSeparator()).append("fizzbuzz").append(System.lineSeparator()).append("76").append(System.lineSeparator()).append("77").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("79").append(System.lineSeparator()).append("buzz").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("82").append(System.lineSeparator()).append("83").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("buzz").append(System.lineSeparator()).append("86").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("88").append(System.lineSeparator()).append("89").append(System.lineSeparator()).append("fizzbuzz").append(System.lineSeparator()).append("91").append(System.lineSeparator()).append("92").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("94").append(System.lineSeparator()).append("buzz").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("97").append(System.lineSeparator()).append("98").append(System.lineSeparator()).append("fizz").append(System.lineSeparator()).append("buzz").toString();

}