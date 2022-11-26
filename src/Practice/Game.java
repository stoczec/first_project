package Practice;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3},
                {4, 10, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < array.length; ) {
            for (int j = 0; j < array[i].length; ) {
                System.out.println("Введите цифрой, направление движения: \n" +
                        "1) Вверх \n" +
                        "2) Вниз \n" +
                        "3) Налево \n" +
                        "4) Направо");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();


                if (choice == 1) {
                    int i1 = array[i--][j];
                    System.out.println(i1);
                } else if (choice == 2) {
                    int i1 = array[i++][j];
                    System.out.println(i1);
                } else if (choice == 3) {
                    int i1 = array[i][j--];
                    System.out.println(i1);
                } else if (choice == 4) {
                    int i1 = array[i][j++];
                    System.out.println(i1);
                }
                if (j > array[i].length - 1) {
                    j--;
                    System.out.println("Вы вышли за границы игровой зоны.\n" +
                            "Вы начинаете с предыдущей позиции.\n");
                    continue;
                } else if (j < 0) {
                    j++;
                }
                if (i >= array.length - 1) {
                    i--;
                    System.out.println("Вы вышли за границы игровой зоны.\n" +
                            "Вы начинаете с предыдущей позиции.\n");
                    break;
                }
                if (j == 10) {
                    System.out.println("Ты победил!!!");
                    break;
                }

            }

        }


    }
}
