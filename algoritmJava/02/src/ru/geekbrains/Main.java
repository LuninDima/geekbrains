package ru.geekbrains;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

import static ru.geekbrains.ChoicheSortArray.choicheSortArray;
import static ru.geekbrains.ElementToSearch.binaryFind;
import static ru.geekbrains.ElementToSearch.linerFind;
import static ru.geekbrains.InsertSortArray.inserSortArray;
import static ru.geekbrains.Timer.*;

public class Main {

    public static void main(String[] args) {
        long timerStart = System.nanoTime();
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arraysCopy;

        Random rand = new Random();
        for (int i = 0; i < arrays.length; i++) {
            // arrays[i] = rand.nextInt(20);
        }
        arraysCopy = Arrays.copyOf(arrays, arrays.length);

        System.out.println("Вывод адреса массива " + arrays.toString());
        System.out.println("Вывод содержимого оригинального массива: " + Arrays.toString(arrays));
        System.out.println("Вывод содержимого скопированного массива: " + Arrays.toString(arraysCopy));
        System.out.println("Сравнение массивов " + Arrays.equals(arrays, arraysCopy));
        long timerEnd = System.nanoTime();
        long timer = (timerEnd - timerStart) / 1000000;
        System.out.println("Время выполнения кода в мс: " + timer);


        long timerStart2 = System.nanoTime();
        System.out.println(linerFind(arrays, 3));
        System.out.println(binaryFind(arrays, 3));
        long timerEnd2 = System.nanoTime();
        long timer2 = (timerEnd2 - timerStart2) / 1000000;
        System.out.println("Время выполнения кода в мс: " + timer2);

        int[] arrays400Elements = new int[400];
        int[] arrays400ElementsCopy;
        int[] arrays400ElementsCopyChoiche;
        int[] arrays400ElementsCopyInsert;
        for (int i = 0; i < arrays400Elements.length; i++) {
            arrays400Elements[i] = rand.nextInt(1000);
        }
        arrays400ElementsCopy = Arrays.copyOf(arrays400Elements, arrays400Elements.length);
        arrays400ElementsCopyChoiche = Arrays.copyOf(arrays400Elements, arrays400Elements.length);
        arrays400ElementsCopyInsert = Arrays.copyOf(arrays400Elements, arrays400Elements.length);

        long timerStart3 = System.nanoTime();
        Arrays.sort(arrays400Elements);
        System.out.println(Arrays.toString(arrays400Elements));
        long timerEnd3 = System.nanoTime();
        long timer3 = (timerEnd3 - timerStart3);
        System.out.println("Время выполнения кода в нс: " + timer3);

        BubbleSortArray array = new BubbleSortArray(arrays400ElementsCopy.length);
        for (int i = 0; i < arrays400Elements.length; i++) {
            array.into(arrays400ElementsCopy[i]);
        }
        System.out.println("Вывод неотсортированного массива: ");
        array.printer();
        System.out.println("Вывод отсортированного массива методом пузырьковой сортировки: ");
        long timerStart4 = System.nanoTime();
        array.bubbleSorted();
        array.printer();
        long timerEnd4 = System.nanoTime();
        long timer4 = (timerEnd4 - timerStart4);
        System.out.println("Время выполнения кода в нс: " + timer4);

        System.out.println("Вывод неотсортированного массива: ");
        System.out.println(Arrays.toString(arrays400ElementsCopyChoiche));
        System.out.println("Вывод отсортированного массива методом выбора: ");
        long timerStart5 = System.nanoTime();
        choicheSortArray(arrays400ElementsCopyChoiche);
        long timerEnd5 = System.nanoTime();
        long timer5 = (timerEnd5 - timerStart5);
        System.out.println("Время выполнения кода в нс: " + timer5);

        System.out.println("Вывод неотсортированного массива: ");
        System.out.println(Arrays.toString(arrays400ElementsCopyInsert));
        System.out.println("Вывод отсортированного массива методом вставки: ");
        long timerStart6 = System.nanoTime();
        inserSortArray(arrays400ElementsCopyInsert);
        long timerEnd6 = System.nanoTime();
        long timer6 = (timerEnd6 - timerStart6);
        System.out.println("Время выполнения кода в нс: " + timer6);
    }


}
