package Lessons;

public class Lesson03_31_10_22_partTwo {
    public static void main(String[] args) {
       byte a; // 1 байт
        short b; // 2 байта
        int c; // 4 байта
        long d; // 8 байт

        // дробные числа
        float firstNumber; // 4 байта
        double secondNumber; // 8 байта

        double number = 5.5; // 5.0
        int n = 5;

        char s; // 2 байта, хранить число, соответствует символу
        char symbol = '2';
        System.out.println(symbol);

        System.out.println(number / 2); // не целое деление (честное) 2.5
        System.out.println(n / 2); // целочистенное деление 2*/

        //Вася получает зарплату в 5.6 евро в час. Он работает 12 часов в день,
        // у него нет выходных, кроме 31 декабря. Он работает 364 дня в году.
        //Сколько часов отработает Вася за год и сколько он заработает денег.

        double hourSalaryVasya = 5.6;
        int workingHour = 12;
        int workingDayInYear = 364;
        int hourInYear = workingHour * workingDayInYear;
        double salaryInYear = hourSalaryVasya * hourInYear;

        System.out.println("Вася отработал за год - " + hourInYear + " часов.");
        System.out.println("Вася заработал за год - " + salaryInYear + " евро.");

        int vacation = 14;
        double vacationSalary = (hourSalaryVasya / 2) * vacation * workingHour;
        double salaryInYearVacation = salaryInYear - vacationSalary;

        System.out.println("Вася заработал за год с учетом отпуска - " + salaryInYearVacation + " евро.");




    }
}
