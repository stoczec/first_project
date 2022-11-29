package HomeWorkJava;

import java.util.Scanner;

public class Lesson11Work2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        answer(number);
    }
    public static int firstNum(int number) {
        int a = number / 100;
        return a;
    }
    public static int secondNum(int number) {
        int b = number / 10 % 10;
        return b;
    }
    public static int thirdNum(int number) {
        int c = number % 10;
        return c;
    }
    public static void answer(int number){
        System.out.println("Первое число - " + firstNum(number) + ".");
        System.out.println("Второе число - " + secondNum(number) + ".");
        System.out.println("Третье число - " + thirdNum(number) + ".");
    }
}
