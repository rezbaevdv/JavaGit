package lesson6.online;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 03.03.2021
 */

public class Lesson6 extends Object {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//
//        String s0 = "Hello_world";
//        String s1 = "Hello";
//        s1 += "_world";
//        String s2 = scanner.nextLine();
//        String s3 = "Hello_world";
//
//        System.out.println(s0 == s1);
//        System.out.println(s0 == s2);
//        System.out.println(s0 == s3);
//        System.out.println("*********");
//        System.out.println(s0.equals(s1));
//        System.out.println(s0.equals(s2));
//        System.out.println(s0.equals(s3));

//        long startTime = System.nanoTime();
//        String exampleString = "Example"; //String exampleString = new String ("Example");
//
//        for (int i = 0; i < 50000; i++) {
//            exampleString += i;
//        }
//
//        float deltaTime = System.nanoTime() - startTime;
//        System.out.println(exampleString);
//        System.out.println("Work time string: " + deltaTime * 0.000001f + " millisec");
//
//        StringBuilder exampleSB = new StringBuilder("Example");
//        startTime = System.nanoTime();
//
//        for (int i = 0; i < 50000; i++) {
//            exampleSB.append(i);
//        }
//
//        deltaTime = System.nanoTime() - startTime;
//        System.out.println(exampleSB.toString());
//        System.out.println("Work time SB: " + deltaTime * 0.000001f + " millisec");
//        System.out.println(exampleString.equals(exampleSB.toString()));
//
//        StringBuffer buffer = new StringBuffer("Example");

//        int a = 10;
//        int b = 0;
//        System.out.println("Start");
//
//        try {
//            System.out.println(a / b);
//        } catch (ArithmeticException exception) {
//            System.out.println("/ by zero. Reason: " + exception.getMessage());
//        }
//
//        try {
//            method1();
//        } catch (IOException exception) {
//            System.out.println("This exception from method catch");
//        }
//
//        System.out.println("Finish");
//
//    }
//
//    public static void method1() throws IOException  {
//        //****
//        throw new IOException("Exception from method");
//
//
//        InputStream io;
//        OutputStream out;
//
//        FileInputStream fis;
//        FileOutputStream fos;

        System.out.println("Start IO Block");

//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("Test6Lesson.txt", true);
//            PrintStream ps = new PrintStream(fileOutputStream);
//            ps.println("Hello PrintStream");
//
//            ps.close();
//            fileOutputStream.flush();
//            fileOutputStream.close();
////            fileOutputStream.write(70);
////            fileOutputStream.write(71);
////            fileOutputStream.write(72);
////            fileOutputStream.write(73);
////            byte[] outString = "Hello!".getBytes();
////            fileOutputStream.write(outString);
//        } catch (IOException exception) {
//            System.out.println(exception.getMessage());
//        }

        try {
            FileInputStream fileInputStream = new FileInputStream("Test6Lesson.txt");
            int inputByteData;
            while((inputByteData = fileInputStream.read()) != -1) {
                System.out.print((char) inputByteData);
            }
            fileInputStream.close();

        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }

        System.out.println("End IO Block");

    }
}

/*
1.	Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
2.	Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
3.	* Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
4.  ** Написать метод, проверяющий, есть ли указанное слово в папке
*/