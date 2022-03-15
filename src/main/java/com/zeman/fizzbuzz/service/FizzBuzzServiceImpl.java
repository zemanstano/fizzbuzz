package com.zeman.fizzbuzz.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.TreeMap;

@Service
public class FizzBuzzServiceImpl implements FizzBuzzService {

    @Value("#{${fizzbuzz.config}}")
    private TreeMap<Integer, String> configMap;


    @Override
    public String getPhraseForNumber(Integer number) {
        for (Integer key: configMap.descendingKeySet() ) {
            if (number % key == 0) {
                return configMap.get(key);
            }
        }

        return String.valueOf(number);
    }

    @Override
    public String generateFizzBuzz(Integer lowerBound, Integer upperBound) {
        StringBuilder sb = new StringBuilder();

        for (int number = lowerBound; number <= upperBound; number++) {
            sb.append(getPhraseForNumber(number));
            sb.append(System.lineSeparator());
        }
        removeLastNewline(sb);

        return sb.toString();
    }

    private void removeLastNewline(StringBuilder sb) {
        int lastNewlineIndex = sb.lastIndexOf(System.lineSeparator());
        if (lastNewlineIndex != -1) {
            //to delete until end of the string you have to provide last index + 1 as the param
            sb.delete(sb.lastIndexOf(System.lineSeparator(), lastNewlineIndex), sb.length());
        }
    }
}


