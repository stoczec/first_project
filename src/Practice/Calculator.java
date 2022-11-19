package Practice;

import java.util.Scanner;

public class Calculator {
    public static int d;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        String n3 = scanner.next();

        int answer = number(n1, n2, n3);
        System.out.println(answer);

        int n4 = scanner.nextInt();
        String n5 = scanner.next();

        int answer1 = number(answer, n4, n5);
        System.out.println(answer1);

        int n6 = scanner.nextInt();
        String n7 = scanner.next();

        int answer2 = number(answer1, n6, n7);
        System.out.println(answer2);

   }

    public static int number(int a, int b, String c) {
        if (c.equals("*")) {
            d = a * b;
        } else if (c.equals("/")) {
            d = a / b;
        } else if (c.equals("+")) {
            d = a + b;
        } else if (c.equals("-")) {
            d = a - b;
        } else System.out.println("Вы что-то сделали не так!");
        return d;
    }
}
