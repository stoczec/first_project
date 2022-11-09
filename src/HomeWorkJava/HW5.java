package HomeWorkJava;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        System.out.println("Level 1:");

        System.out.println("Введите два числа:");

        Scanner scanner = new Scanner(System.in);

        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        String strOne = Integer. toString(numOne);
        String strTwo = Integer. toString(numTwo);
        System.out.println(strOne + " + " + strTwo + " = " + ((double) numOne + (double) numTwo));
        System.out.println(strOne + " - " + strTwo + " = " + ((double) numOne - (double) numTwo));
        System.out.println(strOne + " * " + strTwo + " = " + ((double) numOne * (double) numTwo));
        System.out.println(strOne + " / " + strTwo + " = " + ((double) numOne / (double) numTwo));


        System.out.println("---------------------------");


        System.out.println("Level 2:");

        System.out.println("Введите 3-х значное число:");

        Scanner scannerSecond = new Scanner(System.in);

        int number = scannerSecond.nextInt();
        int thirdNum = number % 10;
        int secondNum = number / 10 % 10;
        int firstNum = number / 100;

        System.out.println("Первое число - " + firstNum + ".");
        System.out.println("Второе число - " + secondNum + ".");
        System.out.println("Третье число - " + thirdNum + ".");


    }
}



