package org.example;

public class Animal {
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;
    public static int animalCount = 0;


    public void run(int distance) {
        if (distance < maxRunDistance) {
            System.out.println(this.name + " пробежал " + distance + "м.");
        } else {
            System.out.println(this.name + " не может пробежать такую дистанцию ");
        }
    }

    public void swim(int distance) {
        if (distance < maxSwimDistance) {
            System.out.println(this.name + " проплыл " + distance + "м.");
        } else {
            System.out.println(this.name + " не может проплыть такую дистанцию ");
        }
    }

    public void getCount(){
        System.out.println("Колличество животных: " + animalCount);
    }

    public Animal( String name, int maxRunDistance, int maxSwimDistance){
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCount++;
    }
}
