package HomeWorkJava;

public class HW9 {
    public static void main(String[] args) {
        // Level 1:
        // Дано целое число, не меньшее 2.
        // Выведите его НАИБОЛЬШИЙ делитель, (число, на которое введенное число делится без остатка),
        // отличный от самого этого числа.

        int number = 15; // !<2
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                System.out.println(i);
                break;
            }
        }
        // Level 2:
        // Вклад в банке составляет x рублей. Ежегодно он увеличивается на p процентов, после чего дробная часть копеек отбрасывается.
        //Каждый год сумма вклада становится больше. Определите, сколько будет на счету через k лет.
        //До начала программирования решите эту задачу на бумаге - возьмите p=10, k=2, x = 1000

        int deposit = 189987;
        int percent = 10;
        int years = 15;
        double kfPercent = ((double) percent / 100) + 1;
        double account = 0;

        for (int i = 1; i <= years; i++) {
            if (i == 1) {
                account = deposit * kfPercent;
            } else account = (int) account * kfPercent;
        }
        System.out.println((int) account);

       // Scanner scanner = new Scanner(System.in);
       // double speed = scanner.nextDouble();
       // double[] speedArray = new double[101];
//
       // speedArray[0] = speed;
//
       // for (int i = 1; i < speedArray.length; i++) {
       //     speedArray[i] = speedArray[i - 1] * 0.99;
       // }
//
       // //скорость на текущий метр = скорость на прошлый метр * 0.95
//
       // System.out.println(Arrays.toString(speedArray));

    }
}
