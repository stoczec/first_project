package Lessons;
// 28.11.2022
import java.util.Random;
import java.util.Scanner;

public class LessonKOne {
    public static void main(String[] args) {

        // с возвращаемым значением - ДЗ с проверкой
        // без возвращаемого значения - пробуждающие функции - ДЗ без проверки
        // DRY - don't repeat yourself


        int sum = result();
        System.out.println(sum);

        int s = getRandomNumber();
        System.out.println(s);

        int firstRandom = getRandomNumber();
        System.out.println(firstRandom);

        int secondRandom = getRandomNumber();
        System.out.println(secondRandom);

        int answer = sum(firstRandom, secondRandom);
        System.out.println(answer);

    }

    public static int result() {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += getNumberFromConsole();
        }
        return sum;
    }

    public static void printHelloMessage() {

        System.out.println("Пожалуйста, введите число!");
        System.out.println("Ну ка быстро написал");
        System.out.println("Вот сюда:");
    }

    public static int getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(0, 10);
        return randomNumber;
    }

    public static int sum(int first, int second) {
        return first + second;
    }

    public static int getNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        printHelloMessage();
        int number = scanner.nextInt();
        return number;
    }


}
