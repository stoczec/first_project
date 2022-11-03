package HomeWorkJava;

import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {

        System.out.println("Level 1:");

        // First level: Level1:
        // Астерикс и Обеликс варили зелье.
        // Зелье будет сварено правильно, если его будут варить больше 5 часов.
        // Астерикс варил его 3 часа, Обеликс в два раза меньше.
        // Получится ли у них сварить зелье? true - если получится, иначе false

        int asterixPotionTime = 3;
        double obelixPotionTime = asterixPotionTime / 2.0;
        double potionTime = asterixPotionTime + obelixPotionTime;
        boolean potion = potionTime > 5;
        System.out.println(potion);

        System.out.println("---------------------------");

        System.out.println("Level 2:");
        //Вводится число. Если оно четное, то выведите true, иначе false

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        if (scanner.nextInt() % 2 == 0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
