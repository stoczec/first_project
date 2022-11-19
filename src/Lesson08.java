public class Lesson08 {
    public static void main(String[] args) throws InterruptedException {
        /*Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        while (i == 0){
            System.out.println("Ты ввел 0, что с этим делать");
        }

        boolean isStarted = true;
        while (isStarted){
            System.out.println("Сервер запущен");
        }

        // циклы, которые выполняются ограниченное количестов раз

        int daysToDie = 365 * 75;
        while (daysToDie != 0){
            System.out.println("Проснулся, потянулся! " + daysToDie);
            daysToDie--;
        }
        System.out.println("До встречи!");
        int a = 0;
        while (a < 1000){
            a++;
        }
        System.out.println(a);

        // вводится число, посчитать от 0 до этого числа
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = 0;
        while (a < number){
            a++;
            System.out.println(a);
        }
        // вывксти все числа от 0 до 1000, который кончаются на 0

        int x = 0;
        while (a < 1000){
            a +=10;
            System.out.println(a);
        }*/

       /* int number = 1;

        while(number > 0){
            number *=2;
            System.out.println(number);
            Thread.sleep(1000);
        }

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        while(x > 0){
            System.out.println("Привет");
            x--;
        }
        int sum = 0;
        while (x > 0){
            int a = scanner.nextInt();
            sum +=a;
            x--;
        }
        System.out.println(sum);*/

        /*int a = 0;
        int b = 0;
        while (a < 10){
            a++;
            System.out.println("a = " + a);
            while (b < 10){
                b++;
                System.out.println("b = " + b);
            }
        }*/

        //Scanner scanner = new Scanner(System.in);
        //Написать такие числа на экран 2, 4, 6, 8 .... 996, 998, 1000
        //Написать на экране все числа от 0 до 1000, которые кончаются на 7: 7, 17, 27
        long start = System.currentTimeMillis(); // 1 января 1970
        int a = 0;
        while (a < 1000) {
            a += 2;
            System.out.println(a);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Mc: " + (finish - start));

        int b = 0;
        while (b < 1000){
            b++;
            if (b % 10 == 7){
                System.out.println(b);
            }


        }


    }


}
