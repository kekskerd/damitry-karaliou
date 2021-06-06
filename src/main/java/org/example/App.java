package org.example;

public class App {
    public static void main(String[] args) {
        Dish dish1 = new Dish(50);
        Cat[] catsArr = new Cat[9];
        catsArr[0] = new Cat("Барсик", 10);
        catsArr[1] = new Cat("Наруто", 10);
        catsArr[2] = new Cat("Чепуш", 10);
        catsArr[3] = new Cat("Пушок", 15);
        catsArr[4] = new Cat("Жорик", 10);
        catsArr[5] = new Cat("Обэма", 10);
        catsArr[6] = new Cat("Беляш", 10);
        catsArr[7] = new Cat("Котяра", 10);
        catsArr[8] = new Cat("Толик", 10);
        dish1.addFood(20); //доложили еды

        for (int i = 0; i < catsArr.length; i++){
            catsArr[i].eat(dish1);
            catsArr[i].getFulness();
            dish1.getAmountFood();
        }

    }
}
