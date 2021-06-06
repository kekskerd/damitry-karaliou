package org.example;

public class Dog extends Animal{
    public static int dogCount = 0;

    public Dog( String name, int maxRunDistance, int maxSwimDistance){
        super(name, maxRunDistance, maxSwimDistance);
        dogCount++;
    }

    public void getCount(){
        System.out.println("Колличество собак: " + dogCount);
    }
}
