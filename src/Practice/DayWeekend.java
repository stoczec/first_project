package Practice;

import java.util.Scanner;

public class DayWeekend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num == 1) {
            System.out.println("Понедельник");
        } else if (num == 2) {
            System.out.println("Вторник");
        } else if (num == 3) {
            System.out.println("Среда");
        } else if (num == 4) {
            System.out.println("Четверг");
        } else if (num == 5) {
            System.out.println("Пятница");
        } else if (num == 6 || num == 7) {
            System.out.println("Выходной");
        } else
            System.out.println("Вы ввели не правильное число!");
    }
}