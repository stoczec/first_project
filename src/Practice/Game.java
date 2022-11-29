package Practice;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        String[][] array = {
                {"Далековато!", "Почти!", "Уже близко!", "Почти!", "Далековато!"},
                {"Почти!", "Уже близко!", "Вы нашли клад!", "Уже близко!", "Почти!"},
                {"Далековато!", "Почти!", "Уже близко!", "Почти!", "Далековато!"}
        };
        startTitle();
        int len = array.length;
        for (int i = 0; i < len; ) {
            for (int j = 0; j < array[i].length; ) {

                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();

                if (choice == 1) {
                    i--;
                    if (i < 0) {
                        i++;
                        warning();
                    }
                    System.out.println(array[i][j]);
                } else if (choice == 2) {
                    i++;
                    if (i >= len) {
                        i--;
                        warning();
                    }
                    System.out.println(array[i][j]);
                } else if (choice == 3) {
                    j--;
                    if (j < 0) {
                        j++;
                        warning();
                    }
                    System.out.println(array[i][j]);
                } else if (choice == 4) {
                    j++;
                    if (j >= array[i].length) {
                        j--;
                        warning();
                    }
                    System.out.println(array[i][j]);
                }
                if (array[i][j].equals("Вы нашли клад!")) {
                    System.out.println("Теперь ты богат!!!");
                    return;
                }
            }
        }

    }
    public static void startTitle(){
        System.out.println("""
                У вас есть возможность найти клад. \s
                Введите цифрой, направление движения:\s
                1) Вверх\s
                2) Вниз\s
                3) Налево\s
                4) Направо""");
    }

    public static void warning(){
        System.out.println("""
                                 Вы вышли за границы игровой зоны.
                                 Вы начинаете с предыдущей позиции.
                                """);
    }

}

