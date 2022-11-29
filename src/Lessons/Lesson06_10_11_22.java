package Lessons;

import java.util.Scanner;

public class Lesson06_10_11_22 {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x <= 0){
            System.out.println("Все пропало!");
        }else{
            System.out.println("Ты богат!");
        }*/

    /*Scanner scanner = new Scanner(System.in);
    int bob = scanner.nextInt();
    int martin = scanner.nextInt();

        if (bob >= 21) {
        System.out.println("Боб подходит");
    }
        else {
        System.out.println("Боб сидит дома");
    }

        if (martin >= 21) {
        System.out.println("Мартин подходит");
    }
        else {
        System.out.println("Мартин сидит дома");
    }

}*/
       /* Scanner scanner = new Scanner(System.in);

int bob = scanner.nextInt();
int martin = scanner.nextInt();

if (bob >= 21 && martin >= 21){
    System.out.println("Идут в клуб");
}
else {
    System.out.println("Неидут в клуб");
}*/
       /* Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        if (age > 16 && age < 65){
            System.out.println("Не время отдыхать");
        }else if (age < 16){
            System.out.println("Пока рано работать");
        }else {
            System.out.println("Вам поздно работать");
        }*/
        //Вводится число, если оно больше-равно чем 5000, то написать "это уже город"
        //Если число меньше 5000, но больше-равно 500 жителей, то написать "Это поселок"
        //Если меньше 500 жителей, то это "село-деревня"


        //Усложнение: Если введено неверное значение, то написать "ERROR" < 0

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number >= 5000){
            System.out.println("Это уже город.");
        }else if (number >= 500){
            System.out.println("Это поселок");
        }else if (number > 0) {
            System.out.println("Село-деревня");
        }else {
            System.out.println("ERROR");
        }

    }
}


