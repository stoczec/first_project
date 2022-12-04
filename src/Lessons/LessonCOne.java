package Lessons;
// 31.10.2022
import java.util.Scanner;

public class LessonCOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Бабуль, просто напиши, сколько лет ты работала:");
        int workTime = s.nextInt();
        int pension = workTime * 100;
        System.out.println("Бабуль, вот сколько денег ты получишь: " + pension + " евро");


        // 1 год работал - 100 евро
        // 20 лет = 2000 евро




    }
}
