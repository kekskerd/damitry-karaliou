package org.example;

public class Dish {
    private int amountFood;

    public Dish(int amountFood) {
        this.amountFood = amountFood;
    }

    public boolean getFood(int maxAmountFood) {
        if ((this.amountFood - maxAmountFood) >= 0) {
            this.amountFood -= maxAmountFood;
            return true;
        } else {
            return false;
        }
    }
    public void getAmountFood(){
        System.out.println("В миске осталось " + this.amountFood + " еды");
    }

    public void addFood(int food){
        this.amountFood += food;
    }
}
