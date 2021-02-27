package lesson3.homework;

import java.util.Random;
import java.util.Scanner;

public class MyGame {

    public static char player = 'X';
    public static char computer = 'O';
    public static char empty = ' ';
    public static int sizeMapX;
    public static int sizeMapY;
    public static char[][] map;

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    // метод: создаю карту из двумерного массива с размером 5 на 5
    public static void createMap() {

        sizeMapX = 5;
        sizeMapY = 5;
        // создаю массив заполненный с переменными empty (' ')
        map = new char[sizeMapX][sizeMapY];
        for (int x = 0; x < sizeMapX; x++) {
            for (int y = 0; y < sizeMapY; y++) {
                map[x][y] = empty;
            }
        }
    }

    // метод: печатаю на консоль карту с размером 5 на 5
    public static void printMap() {
        for (int x = 0; x < sizeMapX; x++) {
            System.out.print("|");
            for (int y = 0; y < sizeMapY; y++) {
                System.out.print(map[x][y] + "|");
            }
            System.out.println();
        }
        System.out.println("___________");
    }

    public static void movePlayer() {
        int x;
        int y;

        do {
            System.out.println("Введите координаты хода Y, X:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!validInput(x, y) || !validEmpty(x, y));
        map[x][y] = player;
    }

    public static void moveComputer() {
        int x;
        int y;
        do {
            x = random.nextInt(sizeMapX);
            y = random.nextInt(sizeMapY);
        } while (!validEmpty(x, y));
        map[x][y] = computer;

    }

    public static boolean validInput(int x, int y) {

        return x >= 0 && x < sizeMapX && y >= 0 && y < sizeMapY;
    }

    public static boolean validEmpty(int x, int y) {
        return map[x][y] == empty;
    }

    public static boolean winGame(char playerWin) {
 /*     if (map[0][0] == playerWin && map[0][1] == playerWin && map[0][2] == playerWin && map[0][3] == playerWin && map[0][4] == playerWin) return true;
        if (map[1][0] == playerWin && map[1][1] == playerWin && map[1][2] == playerWin && map[1][3] == playerWin && map[1][4] == playerWin) return true;
        if (map[2][0] == playerWin && map[2][1] == playerWin && map[2][2] == playerWin && map[2][3] == playerWin && map[2][4] == playerWin) return true;
        if (map[3][0] == playerWin && map[3][1] == playerWin && map[3][2] == playerWin && map[3][3] == playerWin && map[3][4] == playerWin) return true;
        if (map[4][0] == playerWin && map[4][1] == playerWin && map[4][2] == playerWin && map[4][3] == playerWin && map[4][4] == playerWin) return true;

        if (map[0][0] == playerWin && map[1][0] == playerWin && map[2][0] == playerWin && map[3][0] == playerWin && map[4][0] == playerWin) return true;
        if (map[0][1] == playerWin && map[1][1] == playerWin && map[2][1] == playerWin && map[3][1] == playerWin && map[4][1] == playerWin) return true;
        if (map[0][2] == playerWin && map[1][2] == playerWin && map[2][2] == playerWin && map[3][2] == playerWin && map[4][2] == playerWin) return true;
        if (map[0][3] == playerWin && map[1][3] == playerWin && map[2][3] == playerWin && map[3][3] == playerWin && map[4][3] == playerWin) return true;
        if (map[0][4] == playerWin && map[1][4] == playerWin && map[2][4] == playerWin && map[3][4] == playerWin && map[4][4] == playerWin) return true;

        if (map[0][0] == playerWin && map[1][1] == playerWin && map[2][2] == playerWin && map[3][3] == playerWin && map[4][4] == playerWin) return true;
        if (map[4][0] == playerWin && map[3][1] == playerWin && map[2][2] == playerWin && map[1][3] == playerWin && map[0][4] == playerWin) return true;
     return false;
    */
        // проверка по горизонтали
        int x;
        int y;
        for (x = 0; x < sizeMapX; x++) {
                if (
                        map[x][0] == playerWin && map[x][1] == playerWin && map[x][2] == playerWin && map[x][3] == playerWin && map[x][4] == playerWin) {
                    return true;
                }
                // проверка по вертикали
            for (y = 0; y < sizeMapY; y++) {
                if (
                        map[0][y] == playerWin && map[1][y] == playerWin && map[2][y] == playerWin && map[3][y] == playerWin && map[4][y] == playerWin) {
                    return true;
                }
                //проверка по диоганали
                if (map[0][0] == playerWin && map[1][1] == playerWin && map[2][2] == playerWin && map[3][3] == playerWin && map[4][4] == playerWin)
                    return true;
                if (map[4][0] == playerWin && map[3][1] == playerWin && map[2][2] == playerWin && map[1][3] == playerWin && map[0][4] == playerWin)
                    return true;
            }
        }return false;
    }

    public static boolean mapFull () {
        for (int x = 0; x < sizeMapX; x++) {
            for (int y = 0; y < sizeMapY; y++) {
                if (map[x][y] == empty)
                {
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
            movePlayer();
            printMap();
            if (winGame(player)) {
                System.out.println(player + " победил");
                break;
            }
            if (mapFull()) {
                System.out.println("Ничья!");
                break;
            }
            moveComputer();
            printMap();
            if (winGame(computer)) {
                System.out.println(computer + " победил");
                break;
            }
            if (mapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }
}
