package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private int id;
    private List<T> box;

    public void getBoxInfo() {
        if (!this.box.isEmpty()) {
            System.out.println("В коробке "+ id +" " + box.get(0).toString() + ": " + box.size() + " шт.");
        } else {
            System.out.println("Коробка "+ id + " пустая");
        }
    }

    public List<T> getBox() {
        return box;
    }

    public Box(int id) {
        this.box = new ArrayList<>();
        this.id = id;
    }

    public void addFruit(T obj) {
        box.add(obj);
    }

    float getWeight() {
        if (!box.isEmpty()) {
            return box.get(0).getWeight() * box.size();
        } else {
            return 0f;
        }
    }

    public boolean compareBoxes(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    void moveFruitsFrom(Box<T> box1) {
        box1.getBox().addAll(box);
        box.clear();
    }


}
