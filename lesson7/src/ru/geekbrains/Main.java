package ru.geekbrains;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 10, false);
        Plate plate = new Plate(20);
        if (!cat.satiety) {
            if (plate.food > cat.appetite) {
                cat.eat(plate);
                System.out.print("Кот поел. ");
                plate.info();
            } else
                System.out.println("В тарелке недостаточно еды, чтобы покормить кота Необходимо " + cat.appetite + " , а в тарелке: " + plate.food);
        } else System.out.println("Кот уже сыт");

    }

}
