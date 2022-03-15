package com.zeman.fizzbuzz.service;

public interface FizzBuzzService {

    /**
     * @param number
     * @return A String based on a number from the parameters determined by the fizzbuzz rules
     */
    public String getPhraseForNumber(Integer number);

    /**
     *
     * @param lowerBound
     * @param upperBound
     * @return A newline-delimited String for a range of numbers determined by the fizzbuzz rules
     */
    public String generateFizzBuzz (Integer lowerBound, Integer upperBound);

}
