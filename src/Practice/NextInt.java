package Practice;

import java.util.Scanner;

public class NextInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double m = scanner.nextDouble();
        double n = scanner.nextDouble();
        double a = 10.0 - m;
        double b = 10.0 - n;

        if (Math.abs(a) < Math.abs(b)){
            System.out.println("Первое число - ближе к 10.");
        } else if (Math.abs(a) > Math.abs(b)) {
            System.out.println("Второе число - ближе к 10.");
        }else
            System.out.println("Оба числа ближе к 10.");
    }
}
