package org.example;


import java.util.*;

public class App {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "aaa", "ccc", "qqq", "qqq", "eee",
                "aaa", "fff", "ccc", "ggg", "hhh",
                "aaa", "aaa", "ccc", "ggg", "hhh",
                "aaa", "fff", "ccc", "ggg", "aaa",
                "aaa", "fff", "qqq", "ggg", "hhh"));
        System.out.println("----TASK 1-----");
        HashMap<String, Integer> map = countWords(words);
        for (HashMap.Entry<String, Integer> i : map.entrySet()){
            System.out.println("Колличество слов " + i.getKey() + " = " + i.getValue());
        }
        System.out.println("----TASK 2-----");

    }

    public static HashMap<String, Integer> countWords(ArrayList<String> words) {
        HashMap<String, Integer> wordsAndCounts = new HashMap<>();
        for (String word : words) {
            wordsAndCounts.put(word, Collections.frequency(words, word));
        }
        return wordsAndCounts;
    }
}
