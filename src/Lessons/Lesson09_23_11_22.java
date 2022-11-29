package Lessons;

public class Lesson09_23_11_22 {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        while (x > 0) {
            System.out.println(x);
            x--;
        }
        do {
            System.out.println(x);
            x--;

        }
        while (x > 0);
        // цикл while может выполнится ни разу
        // но цикл do-while минимум одни раз
        // отличаютмся только на 1 итерации
        //Без остановки вводится в программу число
        //Остановить считование новых чисел, когда будет введено отрицательное число
        Scanner scannerNew = new Scanner(System.in);
        int number;
        do

        {
            number = scannerNew.nextInt();
        }while(number>0);

        int i = 0;
        while (i < 100){
            System.out.println(i);
            i++;
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }


    }
}


    }




                }*/
        //вывести числа от 1000 до 10000, которые кончаются на 4
        //усложнение: вывести числа от 1000 до 10000, которые кончаются на 4 и на 9

        /*for (int i = 1004; i < 10000; i+=10){
            System.out.println(i);

        }*/
        for (int i = 1004; i < 10000; i += 5) {
            System.out.println(i);
        }
    }

}

