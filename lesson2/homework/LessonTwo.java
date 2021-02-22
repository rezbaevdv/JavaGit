package lesson2.homework;

import java.util.Arrays;

public class LessonTwo {

    public static void main(String[] args) {

        System.out.println("Задание #1");
        int[] arrayTask01 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print(Arrays.toString(task01(arrayTask01)));

        System.out.println("\n\nЗадание #2");
        task02(new int[8]);

        System.out.println("\n\nЗадание #3");
        int[] arrayTask03 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arrayTask03) + "\t до");
        System.out.print(Arrays.toString(task03(arrayTask03)) + "\t после");

        System.out.println("\n\nЗадание #4");
        int[] arrayTask04 = { 3, 5, 35, 2, 11, 4, 5, 2, 4, 8, 9, 5};
        System.out.println(Arrays.toString(arrayTask04));
        System.out.println(task04(arrayTask04) + "\tминимальный элемент");
        System.out.println(task041(arrayTask04) + "\tмаксимальный элемент");

        System.out.println("\nЗадание #5");
        task05(5);
    }

//  1   Задать целочисленный массив, состоящий из элементов 0 и 1.
//      Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//      Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;

    public static int[] task01(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myArray[i] == 1 ? 0 : 1;
        }
        return myArray;
    }

//  2   Задать пустой целочисленный массив размером 8.
//      Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;

    public static void task02(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 1 + (i * 3);
            System.out.print(myArray[i] + "\t");
        }
    }

//  3   Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
//      написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;

    public static int[] task03(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 6) {
                myArray[i] *=2;
            }
        }
        return myArray;
    }

// 4    Задать одномерный массив.
//      Написать методы поиска в нём минимального и максимального элемента;

    public static int task04(int[] myArray) {
        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (min > myArray[i])
                min = myArray[i];
        }
        return min;
    }
    public static int task041(int[] myArray) {
        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (max < myArray[i])
                max = myArray[i];
        }
        return max;
    }

//  5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
//      заполнить его диагональные элементы единицами, используя цикл(ы);

    public static void task05(int a){
        int[][] myArray = new int[a][a];
        for(int i = 0; i < a; i++){
            for(int j = 0; j < a; j++){
                myArray[i][j] = (i == j || i == (a - j - 1))? 1 : 0;
                System.out.print("\t" + myArray[i][j]);
            }
            System.out.println();
        }
    }
}


    
