import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       /* Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int second = s.nextInt();

        System.out.println(first + second);*/

       /* Scanner s = new Scanner(System.in);

        System.out.println("Билл, введи сумму, которая была у тебя позавчера:");
        long moneyDayBefore = s.nextLong();

        long moneyYestearday = moneyDayBefore * 5;
        System.out.println("Билл, на вчеращний день,сумма твоего капитала,состовляет - " + moneyYestearday + " $.");

        long moneyTodayMorning = moneyYestearday - 100_000_000;
        System.out.println("Билл, а на сегодняшнее утро, твой капитал состовляет - " + moneyTodayMorning + " $. Мне очень жаль.");

        if (moneyTodayMorning < 0){
            moneyTodayMorning = 0;
            System.out.println("Билл, а на сегодняшний вечер, твой капитал состовляет - " + moneyTodayMorning + " $.");
        }
        else {

            long moneyTodayEvning = moneyTodayMorning * 2;
            System.out.println("Билл, а на сегодняшний вечер, твой капитал состовляет - " + moneyTodayEvning + " $. Уже лучше!!!");
        }

        System.out.println("________________");*/

        Scanner a = new Scanner(System.in);

        System.out.println("Ведите число:");
        int value = a.nextInt();
        if (value % 4 == 0){
            System.out.println("Ваше число делиться на 4!");
        }
        else {
            System.out.println("Ваше число не делиться на 4!!!");
        }




    }
}
