package lesson2.online;

import java.util.Arrays;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 17.02.2021
 */

public class Lesson2 {

//    public static int myInt = 45;

    public static void main(String[] args) {
//        table(10, 10);

//        for (int i = 0; i < 10; i++) {
//            if (i == 5) break;
//            System.out.print(i + " | ");
//        }

//        int forWhile = 10;
//
//        while (forWhile < 10) {
//            forWhile++;
//            if (forWhile == 5 || forWhile == 8) continue;
//            System.out.print(forWhile + " | ");
//        }

//        int myInt = 10;
//
//        do {
//            myInt++;
//            System.out.print(myInt + " | ");
//        } while (myInt < 10);

//        while(true) {
//            System.out.println("do something...");
//        }


//        System.out.println(myInt);
        //        int a = 10;
//        int b = 20;
//        int res;

//        if (a > b) {
//            res = a;
//        } else {
//            res = b;
//        }

//        res = (a > b) ? a : b; //тернарный оператор
//
//        System.out.println("res = " + res);

//        String name = "Victoria";
//
//        if (name == "Boris") {
//            System.out.println("Send letter to Boris");
//        } else if (name == "Olga") {
//            ///...
//            System.out.println("Send letter to Olga");
//        } else if (name == "Alex") {
//            System.out.println("Send letter to Alex");
//        } else {
//            System.out.println("Go out office");
//        }
//
//        System.out.println("--------");
//
//        switch (name) {
//            case "Boris":
//                System.out.println("Send letter to Boris");
//                break;
//            case "Olga":
//                System.out.println("Send letter to Olga");
//                break;
//            case "Alex":
//                System.out.println("Send letter to Alex");
//                break;
//            default:
//                System.out.println("Go out office");
//                break;
//    }

//        {
//            System.out.println(myInt);
//            int test2 = 150;
//        }

//        System.out.println(test2);

//        for (int i = 0; i < 10; i++) {
//            System.out.println();
//        }
//
//        System.out.println("Result = " + myMath(2, 10));
//

        int[] myArray = new int[100];
//        myArray[0] = 150;
//        myArray[1] = 154;
//        myArray[2] = 10;
//        myArray[3] = 99;
//        myArray[9] = 555;

//        System.out.println(myArray[9]);

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 10 * i;
        }
//
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.print(myArray[i] + " | ");
//        }

//        String[] myStringArray = {"Hello", "world", "Java", "Human"};
////        String[] myStringArray = new String[4];
////        myStringArray[0] = "Hello";
////        myStringArray[1] = "world";
////        myStringArray[2] = "Java";

//        int[][] array2 = new int[9][5];
//
//        int value = 0;
//
//        for (int y = 0; y < array2.length; y++) {
//            for (int x = 0; x < array2[y].length; x++) {
//                array2[y][x] = value;
//                System.out.print(array2[y][x] + "\t");
//                value += 2;
//            }
//            System.out.println();
//        }

        System.out.println(Arrays.toString(myArray));


    }

//    public static void table(int wight, int height) {
//        for (int y = 1; y < height; y++) {
//            for (int x = 1; x < wight; x++) {
//                System.out.print(y * x + "\t");
//            }
//            System.out.println();
//        }
//    }

//    public static void test() {
//        int abc = 20;
//        int cde = 30;
//        System.out.println(myInt);
//        System.out.println(abc + cde);
//    }

//    public static int doSom1(){
//        return 10;
//    }
//
//    public static float doSom2(){
//        return 20;
//    }
//
//    public static void myMethod(){
//        System.out.println("Hello");
//    }

//    public static int myMath(int base, int signature) {
//        int result = 1;
//
//        for (int i = 0; i < signature; i++) {
//            result *= base; //result = result * base;
//        }
//        return result;
//    }
}

/*
    1 Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в
    принятом массиве 0 на 1, 1 на 0;

	2 Задать пустой целочисленный массив размером 8. Написать метод,
	который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;

	3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
	принимающий на вход массив и умножающий числа меньше 6 на 2;

	4 Задать одномерный массив. Написать методы поиска в нём
	минимального и максимального элемента;

	5* Создать квадратный целочисленный массив
	(количество строк и столбцов одинаковое), заполнить его диагональные
	элементы единицами, используя цикл(ы);

	6** Написать метод, которому на вход подаётся одномерный массив и
	число n (может быть положительным, или отрицательным), при этом метод
	должен циклически сместить все элементы массива на n позиций.
	[1,2,3,4,5], -2 => [3,4,5,1,2]
	[1,2,3,4,5], 2 => [4,5,1,2,3]

	7 *** Не пользоваться вспомогательным массивом при решении задачи 6.

    **/
