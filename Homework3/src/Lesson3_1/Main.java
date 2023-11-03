package Lesson3_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру по Цельсию: ");
        double x = sc.nextDouble();

        raschetTemperaturiPoFarengeitu(x);

    }

    static void raschetTemperaturiPoFarengeitu(double temp) {
        double tempFar = temp * 1.8 + 32;
        System.out.println(tempFar);


    }

}
