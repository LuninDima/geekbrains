package ru.geekbrains;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 10, false);
        Cat[] arrayCat = new Cat[5];
        arrayCat[0] = new Cat("Barsik", 10, false);
        arrayCat[1] = new Cat("Ivan", 10, false);
        arrayCat[2] = new Cat("Dima", 10, false);
        arrayCat[3] = new Cat("Oleg", 10, false);
        arrayCat[4] = new Cat("Danil", 10, false);

        Plate plate = new Plate(100);
        for (int i = 0; i < arrayCat.length; i++) {
            if (!arrayCat[i].satiety) {
                if (plate.food > arrayCat[i].appetite) {
                    arrayCat[i].eat(plate);
                    System.out.print(arrayCat[i].name + " поел. ");
                    plate.info();
                } else
                    System.out.println("В тарелке недостаточно еды, чтобы покормить кота Необходимо " + cat.appetite + " , а в тарелке: " + plate.food);
            } else System.out.println("Кот уже сыт");
        }


    }

}
