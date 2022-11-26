package Practice;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3},
                {4, 10, 6},
                {7, 8, 9}
        };

        /*
         * 0 1 2
         * 0 1 2
         * 0 1 2
         * */

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
                    array[i] = array[i--];
                    System.out.println(array[i][j]);
                } else if (choice == 2) {
                    array[i] = array[i++];
                    System.out.println(array[i][j]);
                } else if (choice == 3) {
                    array[j] = array[j--];
                    System.out.println(array[i][j]);
                } else if (choice == 4) {
                    array[j] = array[j++];
                    System.out.println(array[i][j]);
                }
                if (j >= array[i].length - 1) {
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
                } else if (i <0) {
                    i++;
                }
                if (j==10){
                    System.out.println("Ты победил!!!");
                    break;
                }

            }

        }


    }
}
