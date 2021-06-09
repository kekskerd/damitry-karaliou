package org.example;

import java.util.*;

public class PhoneDirectory {
    private HashMap<Integer, String> phoneDir;

    public PhoneDirectory() {
        phoneDir = new HashMap<>();
    }

    public void add(int phone, String surname) {
        this.phoneDir.put(phone, surname);
    }

    public void get(String surname) {
        if (phoneDir.containsValue(surname)) {
            for (Map.Entry<Integer, String> map : phoneDir.entrySet()) {
                if (map.getValue().equals(surname)) {
                    System.out.println(map.getValue() + " : " + map.getKey());
                }
            }
        } else {
            System.out.println("Фамилия " + surname + " отсутствует в телефонной книге");
        }
    }


}
