package Lessons;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
// 25.11.2022
public class LessonJ {
    public static void main(String[] args) {
        int a = 5;

        int[] hello = new int[20]; // 3 ячейки с индексами 0, 1, 2

        System.out.println(a);
        System.out.println(Arrays.toString(hello));
        System.out.println(0);
        hello[0]++;
        System.out.println(Arrays.toString(hello));
        hello[10] = 500;
        hello[14] = -100500;
        System.out.println(Arrays.toString(hello));
        System.out.println(hello[14]);

        int x = 4;
        System.out.println(hello[4]);

        int[][] array = new int[2][3]; // 2-х мерный массив
        System.out.println(Arrays.deepToString(array));

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println(random.nextInt(0, 1000));
        int[] arrayNew = new int[20];

        for (int i = 0; i < arrayNew.length; i++) {

            arrayNew[i] = i * i;
        }
        System.out.println(Arrays.toString(arrayNew));


    }
}
