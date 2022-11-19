package Practice;

import java.util.Scanner;

public class PracticeWeekend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num >= 0 && num <=10){
            System.out.println("Положительное число меньше 10 или ноль");
        }else
            System.out.println("Положительное число больше 10 или отрицательное");
    }
}
