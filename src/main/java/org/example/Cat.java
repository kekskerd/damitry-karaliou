package org.example;

public class Cat {
    private String name;
    private int maxAmountFood;
    private boolean fullness;

    public Cat(String name, int maxAmountFood) {
        this.name = name;
        this.maxAmountFood = maxAmountFood;
        this.fullness = false;
    }

    public void eat(Dish dish) {
        this.fullness = dish.getFood(this.maxAmountFood);
    }

    public void getFulness(){
        if(this.fullness == true){
            System.out.println("Кот " + this.name + " покушал");
        }
        else{
            System.out.println("Коту " + this.name + " не досталось еды и он написил в тапки");
        }
    }
}
