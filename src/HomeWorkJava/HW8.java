package HomeWorkJava;

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        System.out.println("Level 1:");
        //Вводится число. Напишите на экран сообщение "Я начинаю разбираться с циклами" количество раз,
        // равное введенному числу
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        while (number > count) {
            System.out.println("Я начинаю разбираться с циклами");
            count++;
        }
        System.out.println("---------------------------");

        System.out.println("Level 2:");
        //Вводится строка, выведите первый ее символ на экран количество раз, равное длине всей строки.
        // Например, строка "привет", значит результат будет такой:

        Scanner scannerNew = new Scanner(System.in);
        String str = scannerNew.nextLine();
        int countNew = 0;
        while (countNew < str.length()) {
            System.out.println(str.charAt(0));
            countNew++;

        }

    }
}
