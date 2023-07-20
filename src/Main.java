import java.net.SocketAddress;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }




    public static void task1 () {
        System.out.println("Задача 1");
        int age = 16; // Пишем код для задачи 1
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int degrees = 8;// Пишем код для задачи 2
        if (degrees >= 5) {
            System.out.println("На улице " + degrees + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + degrees + " градусов, нужно надеть шапку");
        }
    }
    private static void task3() {
        System.out.println("Задача 3");
        int speed = 70;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        }
    }
    private static void task4() {
        System.out.println("Задача 4");
        int age = 1;
        if (age<2) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно идти спать");
        } else if (age >=2 && age<=6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >=7 && age<18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age>=18 && age<24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age>=24 && age<60) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно отдохнуть");
        }
    }
    private static void task5() {
        System.out.println("Задача 5");
        int age = 15;
        if (age<5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age>=5 && age<14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    private static void task6() {
        System.out.println("Задача 6");
        int people = 102;
        if (people <60) {
            System.out.println("Если в вагоне " + people + " человек, то в вагоне есть сидячее и стоячее места");
        } else if (people>=60 && people<102) {
            System.out.println("Если в вагоне " + people + " человек, то в вагоне есть только стоячее места");
        } else {
            System.out.println("Если в вагоне " + people + " человек, то вагон уже полностью забит");
        }
    }
    private static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one>two && two>three) {
            System.out.println("число " + one + " самое большое среди чисел " + two + " и " + three);
        } else if (two>one && one>three) {
            System.out.println("число " + two + " самое большое среди чисел " + one + " и " + three);
        } else {
            System.out.println("число " + three + " самое большое среди чисел " + one + " и " + two);
        }
    }

}