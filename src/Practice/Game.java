package Practice;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        String[][] array = {
                {"Далековато!", "Почти!", "Уже близко!", "Почти!", "Далековато!"},
                {"Почти!", "Уже близко!", "Вы нашли клад!", "Уже близко!", "Почти!"},
                {"Далековато!", "Почти!", "Уже близко!", "Почти!", "Далековато!"}
        };
        int len = array.length;
        for (int i = 0; i < len; ) {
            for (int j = 0; j < array[i].length; ) {
                System.out.println("""
                        Введите цифрой, направление движения:\s
                        1) Вверх\s
                        2) Вниз\s
                        3) Налево\s
                        4) Направо""");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();

                if (choice == 1) {
                    i--;
                    if (i < 0) {
                        i++;
                        System.out.println("""
                                 Вы вышли за границы игровой зоны.
                                 Вы начинаете с предыдущей позиции.
                                """);
                    }
                    System.out.println(array[i][j]);
                    if (array[i][j].equals("Вы нашли клад!")) {
                        System.out.println("Ты победил!!!");
                    }
                } else if (choice == 2) {
                    i++;
                    if (i >= len) {
                        i--;
                        System.out.println("""
                                 Вы вышли за границы игровой зоны.
                                 Вы начинаете с предыдущей позиции.
                                """);
                    }
                    System.out.println(array[i][j]);
                    if (array[i][j].equals("Вы нашли клад!")) {
                        System.out.println("Ты победил!!!");
                    }
                } else if (choice == 3) {
                    j--;
                    if (j < 0) {
                        j++;
                    }
                    System.out.println(array[i][j]);
                    if (array[i][j].equals("Вы нашли клад!")) {
                        System.out.println("Ты победил!!!");
                    }
                } else if (choice == 4) {
                    j++;
                    if (j >= len) {
                        j--;
                    }
                    System.out.println(array[i][j]);
                    if (array[i][j].equals("Вы нашли клад!")) {
                        System.out.println("Ты победил!!!");
                    }
                }
                if (array[i][j].equals("Вы нашли клад!")) {
                    return;
                }
            }
        }

    }
}

