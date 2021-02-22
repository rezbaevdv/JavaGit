package lesson1.homework;

public class LessonOne {

    public static void main(String[] args) {

        System.out.println("a * (b + (c / d)) = " + task01(5, 1, 8, 3));
        System.out.println(task02(12, 8));
        System.out.println(task03(-10));
        System.out.println(task04("JAVA"));
        task05(2800);
    }

    public static float task01(float a, float b, float c, float d) {
        System.out.println("Задание #1");
        float e = a * (b + (c / d));
        return e;
    }

    public static boolean task02(int a, int b) {
        System.out.println("\nЗадание #2");
        int c = a + b;
        if (c > 10 && c <= 20)
            return true;
        else
            return false;
    }

    public static int task03(int a) {
        System.out.println("\nЗадание #3");
        if (a >=0) { System.out.println("положительное число");
        } else { System.out.println("отрицательное число" );
        }
        return a;
    }

    public static String task04(String name) {
        System.out.println("\nЗадание #4");
        return "Привет, " + name + "!";
    }

    public static void task05(int a) {
        System.out.println("\nЗадание #5");
        if ((a % 4 != 0) || (a % 400 != 0 && a % 100 == 0)) {
            System.out.println( a + " год является НЕ високосным");
        } else {
            System.out.println( a + " год является високосным");
        }
    }

}

