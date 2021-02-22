package lesson3.online;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 20.02.2021
 */

public class TheGame {

    public static char[][] map;
    public static int sizeMapX;
    public static int sizeMapY;

    public static char humanChar = 'X';
    public static char aiChar = 'O';
    public static char emptyChar = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random(); //[0,1)

    public static void createMap() {
        sizeMapX = 3;
        sizeMapY = 3;
        map = new char[sizeMapY][sizeMapX];

        for (int y = 0; y < sizeMapY; y++) {
            for (int x = 0; x < sizeMapX; x++) {
                map[y][x] = emptyChar;
            }
        }
    }

    public static void printMap() {
        for (int y = 0; y < sizeMapY; y++) {
            for (int x = 0; x < sizeMapX; x++) {
                System.out.print(map[y][x] + " | ");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("Введите координаты:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isValidCell(y, x) || !isEmpty(y, x));

        map[y][x] = humanChar;

    }

    public static void aiTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(sizeMapX); //[0;3)
            y = random.nextInt(sizeMapY);
        } while (!isEmpty(y, x));

        map[y][x] = aiChar;
    }

    public static boolean isValidCell(int y, int x) {
        return x >= 0 && x < sizeMapX && y >= 0 && y < sizeMapY;
    }

    public static boolean isEmpty(int y, int x) {
        return map[y][x] == emptyChar;
    }

    public static boolean checkWin(char playerChar){
        if (map[0][0] == playerChar && map[0][1] == playerChar & map[0][2] == playerChar) return true;
        if (map[1][0] == playerChar && map[1][1] == playerChar & map[1][2] == playerChar) return true;
        if (map[2][0] == playerChar && map[2][1] == playerChar & map[2][2] == playerChar) return true;

        if (map[0][0] == playerChar && map[1][0] == playerChar & map[2][0] == playerChar) return true;
        if (map[0][1] == playerChar && map[1][1] == playerChar & map[2][1] == playerChar) return true;
        if (map[0][2] == playerChar && map[1][2] == playerChar & map[2][2] == playerChar) return true;

        if (map[0][0] == playerChar && map[1][1] == playerChar & map[2][2] == playerChar) return true;
        if (map[0][2] == playerChar && map[1][1] == playerChar & map[2][0] == playerChar) return true;
        return false;
    }

    public static boolean isMapFull() {
        for (int y = 0; y < sizeMapY; y++) {
            for (int x = 0; x < sizeMapX; x++) {
                if (map[y][x] == emptyChar) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        createMap();
        printMap();

        while (true) {

            humanTurn();
            printMap();
            if (checkWin(humanChar)) {
                System.out.println(humanChar + " WIN");
                break;
            }

            if (isMapFull()) {
                System.out.println("DRAW!");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(aiChar)) {
                System.out.println(aiChar + " WIN");
                break;
            }

            if (isMapFull()) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}

/*
Полностью разобраться с кодом, попробовать переписать с нуля;
^ Усовершенствовать метод проверки победы (через циклы);
^ Расширить поле до 5х5 и в качестве условий победы установить серию равной 4.
^^ Проработать базовый искусственный интеллект, чтобы он мог блокировать ходы игрока.
 */
