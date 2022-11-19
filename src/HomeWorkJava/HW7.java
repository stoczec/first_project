package HomeWorkJava;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
            /*First level: Level1:
1) В программу (в консоль) вводится строка. Найдите длину строки, если она больше 10, то выведите true, иначе false
2) В программу (в консоль) вводится строка. Если первый и последний символ равны - выведите true, иначе false*/
        System.out.println("Level 1:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if (str.length() > 10) {
            System.out.println("true");
        } else System.out.println("false");
        if (str.substring(0, 1).equals(str.substring(str.length() - 1))) {
            System.out.println("true");
        } else System.out.println("false");

        System.out.println("---------------------------");

        System.out.println("Level 2:");
        //В программу вводится строка из двух букв A и B, замените все буквы A на B, а все B на A.
        // Например ABBA -> BAAB

        Scanner scannerNew = new Scanner(System.in);

        String strNew = scannerNew.next();

        strNew = strNew.replace('A', 'C');
        strNew = strNew.replace('B', 'A');
        strNew = strNew.replace('C', 'B');

        System.out.println(strNew);
    }
}
