package org.example;

public class App {
    public static void main(String[] args) {
//-----------------EMPLOYEE TASK----------------------------------------------
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Зубенко Михаил Петрович", "PM", "zubmih@gmail.com", "+375299547826", 100000, 41);
        empArray[1] = new Employee("Жмых Семён Олегович", "JS developer", "djmih_semen@gmail.com", "+375299598726", 150000, 55);
        empArray[2] = new Employee("Жижкина Галина Алексеевна", "QA", "djija@gmail.com", "+375298889974", 7000000, 45);
        empArray[3] = new Employee("Залётный Олег Иванович", "Завхоз", "zaloleg@gmail.com", "+375333648246", 1312, 39);
        empArray[4] = new Employee("Снегурдинский Антон Артёмович", "CEO", "snegurda@gmail.com", "+375333648255", 777777777, 25);

        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40) {
                empArray[i].getInfo();
            }
        }
// ----------------ANIMAL CAT DOG TASK---------------------------------------
        Dog dog1 = new Dog("Sharik", 500, 10);
        Dog dog2 = new Dog("Tuzik", 500, 10);
        Cat cat1 = new Cat("Barsik", 200, 0);
        Cat cat2 = new Cat("Chepush", 200, 0);
        Cat cat3 = new Cat("Viskas", 200, 0);

        dog1.run(300);
        dog1.run(600);
        dog2.swim(9);
        dog2.swim(99);
        cat1.run(100);
        cat2.run(150);
        cat2.run(400);
        cat2.swim(2);
        cat3.swim(10);
        cat3.run(199);

        dog2.getCount();
        cat1.getCount();
    }
}
