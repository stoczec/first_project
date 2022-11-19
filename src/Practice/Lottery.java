package Practice;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();


        if ((numOne == 4 || numOne == 10 || numOne == 40 || numOne == 89) && (numTwo == 4 || numTwo == 10 || numTwo == 40 || numTwo == 89)) {
            System.out.println("You win!!!");
        }else System.out.println("You lose!!!");

        }

    }

