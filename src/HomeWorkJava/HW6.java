package HomeWorkJava;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        System.out.println("Level 1:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 0){
            System.out.println("ошибок не обнаружено");
        }else System.out.println("ERROR\n".repeat(3));

        System.out.println("---------------------------");


        System.out.println("Level 2:");

        Scanner rudder = new Scanner(System.in);
        int numberOne = rudder.nextInt();
        int numberTwo = rudder.nextInt();

        if (numberOne == 36 && numberTwo == 17){
            System.out.println("You win JACKPOT!!!");
        }else if (numberOne == 36 || number == 17){
            System.out.println("You win small prize!!!");
        }else
            System.out.println("You lose all...");


    }
}
