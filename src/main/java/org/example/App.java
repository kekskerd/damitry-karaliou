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
        HashMap<String, Integer> countMap = countWords(words);
        for (HashMap.Entry<String, Integer> map : countMap.entrySet()) {
            System.out.println("Колличество слов " + map.getKey() + " = " + map.getValue());
        }
        System.out.println("----TASK 2-----");

        PhoneDirectory phoneDir = new PhoneDirectory();
        phoneDir.add(9379992, "Иванов");
        phoneDir.add(5861478, "Петров");
        phoneDir.add(9852146, "Зубенко");
        phoneDir.add(5824684, "Антонов");
        phoneDir.add(8800555, "Зубенко");
        phoneDir.add(6068548, "Меладзе");
        phoneDir.add(6549873, "Петров");
        phoneDir.add(4859263, "Петров");

        phoneDir.get("Зубенко");
        phoneDir.get("Петров");
        phoneDir.get("Меладзе");
        phoneDir.get("Жмышенко");

    }

    public static HashMap<String, Integer> countWords(ArrayList<String> words) {
        HashMap<String, Integer> wordsAndCounts = new HashMap<>();
        for (String word : words) {
            wordsAndCounts.put(word, Collections.frequency(words, word));
        }
        return wordsAndCounts;
    }
}
