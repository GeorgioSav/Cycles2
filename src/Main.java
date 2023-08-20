<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Task 1
        System.out.println("Task 1");


        //Task 2
        System.out.println("Task 2");


        //Task 3
        System.out.println("Task 3");


        //Task 4
        System.out.println("Task 4");


        //Task 5
        System.out.println("Task 5");


        //Task 6
        System.out.println("Task 6");


        //Task 7
        System.out.println("Task 7");


        //Task 8
        System.out.println("Task 8");
=======
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        //Task 1
        System.out.println("Task 1");
        int balance = 0;
        int month = 0;
        while (balance <= 2_459_000) {
            balance += 15000;
            ++month;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + balance + " рублей ");
        System.out.println();

        //Task 2
        System.out.println("Task 2");
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " ");
            ++i;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.println(i + " ");
        }
        System.out.println();

        //Task 3
        System.out.println("Task 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        for (int r = 1;r <= 10; r++) {
            population += population / 1000 * (fertility - mortality);
            System.out.println("Год " + r + " численность населения составляет " + population);
        }
        System.out.println();

        //Task 4
        System.out.println("Task 4");
        balance = 0;
        month = 0;
        while (balance <= 12_000_000) {
            balance += 15000;
            balance *= 1.07;
            ++month;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + balance + " рублей ");
        }
        System.out.println();

        //Task 5
        System.out.println("Task 5");
        balance = 0;
        month = 0;
        while (balance <= 12_000_000) {
            balance += 15000;
            balance *= 1.07;
            ++month;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + balance + " рублей ");
            }
        }
        System.out.println();

        //Task 6
        System.out.println("Task 6");
        balance = 0;
        for (int t = 1;t <= 9 * 12; t++) {
            balance += 15000;
            balance *= 1.07;
            if (t % 6 == 0) {
                System.out.println("Месяц " + t + ", сумма накоплений равна " + balance + " рублей ");
            }
        }
        System.out.println();

        //Task 7
        System.out.println("Task 7");
        for (int friday = 3;friday <= 31;friday +=7) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();

        //Task 8
        System.out.println("Task 8");
        int currentYear = LocalDate.now().getYear();
        int startYear = currentYear - 200;
        int endYear =  currentYear +100;
        for (int t = startYear;t <= endYear; t++) {
            if (t % 79 == 0) {
                System.out.println(t);
            }
        }
>>>>>>> 2c85e8b (HomeWork Complited!)

    }
}