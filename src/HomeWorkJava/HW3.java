package HomeWorkJava;

public class HW3 {
    public static void main(String[] args) {

        System.out.println("Level 1:");

        // First level: Level1:
        // В Китае живет 1 411 778 724 человек, всего в мире 197 стран.
        // Сколько бы человек жило на земле, если бы в каждой стране жило население, равное китайскому?

        long peopleOfChina = 1_411_778_724;
        int country = 197;
        long allPeople = peopleOfChina * country;
        System.out.println("Население во всем мире - " + allPeople + " человек.");

        System.out.println("---------------------------");

        System.out.println("Level 2:");

        // Level2:
        // Феликс прожил 3011456_567 секунд. Сколько лет прожил Феликс?
        // Посчитать, используя Java, Long-переменные и деление.
        //Кто не знает - по какой формуле посчитать - напишите мне, но сначала подумайте

        long lifeSecFelix = 3_011_456_567L;
        long secPerYear = 60 * 60 * 24 * 365;
        long lifeYearFelix = lifeSecFelix / secPerYear;
        System.out.println("Феликс прожил " + lifeYearFelix + " полных лет.");
    }
}
