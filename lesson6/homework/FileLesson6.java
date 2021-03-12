package lesson6.homework;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FileLesson6 {

    private static final String text1 = "Et harum quidem rerum facilis est et expedita distinctio, consectetur adipiscing elit, qui dolorem ipsum.";
    private static final String text2 = "Quis autem vel eum iure reprehenderit, qui blanditiis praesentium voluptatum deleniti atque corrupti.";
    private static final int fileMax = 3;

    private static FileInputStream fileInputStream;
    private static FileOutputStream fileOutputStream;

    private static void fileGenerate(String fileName, String text) {
        try {
            fileOutputStream = new FileOutputStream(fileName);
            fileOutputStream.write(text.getBytes(StandardCharsets.UTF_8));
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }


    private static void unionFile(String File1, String File2, String File3) {
        try {
            fileOutputStream = new FileOutputStream(File3);
            fileInputStream = new FileInputStream(File1);
            int sign;
            while ((sign = fileInputStream.read()) != -1)
                fileOutputStream.write(sign);
            fileOutputStream.write(sign);
            fileInputStream.close();


            fileInputStream = new FileInputStream(File2);
            while ((sign = fileInputStream.read()) != -1) {
                fileOutputStream.write(sign);
            }
            fileInputStream.close();
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }


    public static void main (String[] args) {
        String[] fileName = new String[fileMax];
        System.out.println("Создаем " + fileName.length +  " файла:");
        for (int i = 0; i < fileName.length; i++)
            fileName[i] = "File" + (i + 1) + ".txt";
        System.out.println(Arrays.toString(fileName));

// первые 2 файла заполняем текстом

    String[] text = {text1,text2};
        System.out.println("\nЕсть " + text.length +  " текста:");
        for (int i = 0; i < text.length; i++) {
            text[i] = "Text " + (i + 1) + " " + text[i];
            System.out.println(text[i]);
        }
        for (int i = 0; i < fileName.length; i++)
            if (i < 2)
                fileGenerate(fileName[i],text[i]);

// в файл File3.txt записываем содержание файла File1.txt и содержание файла File2.txt

                unionFile(fileName[0],fileName[1],fileName[2]);
                System.out.println("\nВ файл File3.txt записано содержание файла File1.txt и содержание файла File2.txt");

    }
}





