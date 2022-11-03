package HomeWorkJava;

public class HW2 {
    public static void main (String[] args) {

        System.out.println("Level 1:");
        int a = 5;
        a *= 3;
        a += 3;
        a /= 2;
        System.out.println("a = " + a);

        System.out.println("---------------------------");

        System.out.println("Level 2:");

        int schoolboy = 3; // Общее кол-во школьников.
        int apple = 14; // Общее кол-во яблок.
        int basket = apple % schoolboy; // Остаток яблок после равномерного деления среди школьников.
        System.out.println("В корзинке осталось: " + basket + " яблока.");
    }
}
