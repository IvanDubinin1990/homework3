package Lesson3_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        raschetValut(proverka());

    }

    static void raschetValut(float x) {
        float dollar = x / 92.94f;
        float euro = x / 98.87f;
        String formatterFloatDollar = String.format("%.2f", dollar);
        String formatterFloatEuro = String.format("%.2f", euro);
        System.out.println(x + " рублей это: " + formatterFloatDollar + " долларов или " + formatterFloatEuro + " евро.");

    }

    static float proverka() {

        while (true) {

            System.out.println("Введите количество рублей: ");

            try {

                float x = new Scanner(System.in).nextFloat();

                if (x > 0) {
                    return x;
                } else {
                    System.out.println("Вы ввели отрицательное число или 0");
                }

            }catch (InputMismatchException z){
                System.out.println("Вы ввели не число, попробуйте ещё раз");
            }
        }
    }
}
