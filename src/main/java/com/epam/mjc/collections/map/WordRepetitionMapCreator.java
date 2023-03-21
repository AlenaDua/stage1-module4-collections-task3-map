package com.epam.mjc.collections.map;
import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
       String[] words = sentence.toLowerCase().split("\\s+");
       Map <String,Integer> wordFrequencies = new HashMap<>();
       for (String word : words) {
           String cleanedWord = word.replaceAll("[^a-zA-Z0-9]", "");
           if (cleanedWord.length() > 0) {
               wordFrequencies.put(cleanedWord, wordFrequencies.getOrDefault(cleanedWord, 0) + 1);
           }
       }
        return wordFrequencies;
    }
}
