package org.example;

public class Cat extends Animal{
    public static int catCount = 0;

    public Cat( String name, int maxRunDistance, int maxSwimDistance){
        super(name, maxRunDistance, maxSwimDistance);
        catCount++;
    }

    public void getCount(){
        System.out.println("Колличество котов: " + catCount);
    }
}
