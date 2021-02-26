package ru.geekbrains;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> arrays = Arrays.asList(
                "Стул", "Табуретка", "Стол", "Шкаф", "Диван",
                "Кровать", "Стул", "Табуретка", "Шкаф", "Шкаф",
                "Кровать", "Стул", "Toyota", "Диван", "Шкаф",
                "Кровать", "Табуретка", "Стол", "Шкаф", "Диван"
        );

        Set<String> uniqueWord = new HashSet<String>(arrays);


        System.out.println(arrays.toString());
        System.out.println("Уникальные слова");
        System.out.println(uniqueWord.toString());
        System.out.println("Частота слов");
        for (String key : uniqueWord) {
            System.out.println(key + ": " + Collections.frequency(arrays, key));
        }
    }
}
