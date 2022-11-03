public class Boolean {
    public static void main(String[] args) {
        /*boolean raining =  true;
        System.out.println(raining);
        raining = false;
        System.out.println(raining);
        raining = true;
        System.out.println(raining);*/

        /*int teaTemperaure = 85;

        boolean hot = teaTemperaure > 100;
        System.out.println(hot);

        double myTemperature = 37.5;
        double normalTemperautre = 36.6;
        boolean ill =myTemperature > normalTemperautre;
        System.out.println(ill);

        int bowlingStrike = 10;
        int myScore = 9;
        boolean canIgetStrike = bowlingStrike == myScore;
        System.out.println(canIgetStrike);

        // если НЕ одинаковый, то хотим увидеть true
        // если одинкаовый, то false

        int firstPerson = 181;
        int secondPerson = 181;
        boolean similar = firstPerson != secondPerson;
        System.out.println(similar);*/

        // Lesson 1
        int money = 1000;
        int moneyV = 900;
        boolean remainder = money > moneyV;
        System.out.println(remainder);

        //Lesson 2
        //Петя имеет средний балл 3.49. Он очень хочет пятерку за четверть.
        //Он уверен, что сможет улучить средний балл на +1 (Подсказка: будет 4.49).
        //Получит ли он 5? true - если да, false - если нет.

        double avrscore = 3.49;
        avrscore ++;
        double score = 4.5;
        boolean bestAvrScore = avrscore >= score;
        System.out.println(avrscore);
        System.out.println(bestAvrScore);


    }

}
