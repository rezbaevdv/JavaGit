package lesson1.online;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 13.02.2021
 */

public class FirstClass {



    public static void main(String[] args) {
//        System.out.print("Hello\tJAVA!!!");
//        System.out.println("J\0AVA!!!");
//        System.out.print(456);

        //целочисленные
//        byte myByte = 25; //-128..127 (1b)
//        short myShort = 269; //-32768..32767 (2b)
//        int myInt = 1235789; //-2.1*10^9 .. +2.1*10^9 (4b)
//        long myLong = 3000000000L; //-2^63 .. +2^63 (8b)
//
//        //числа с плавающей точкой
//        float myFloat = 15.18f; //(value.(7)) (4b)
//        double myDouble = 15.18; //(value.(14)) (8b)
//
//        //символы (char)
//        char myChar = 'H'; // (2b)
//        char myCharQ = 35;
//        int futureChar = 70;
//
//        System.out.println((int) myChar);
//        System.out.println(myCharQ);
//        System.out.println((char) futureChar);
//
//        //logic (булева)
//        boolean myBoolean = true; //false (1b)
//
//        //ссылочный тип данных
//        String myString = "ldfkjghsfdlkjghsfdlkjhdfslkgjh654654$&*^%&U^#";
//        System.out.println(myString);
//        System.out.println(myBoolean);

        //+,-,*,/,%
//        int myValue1 = 15;
//        int myValue2 = 4;
////        System.out.println(myValue1 % myValue2);
//
////        myValue1 = myValue1 + 20;
//        myValue1 += 20; //+= -= *= /= %=
//
////        myValue2 = myValue2 + 1;
//        myValue2++; //инкремент / декремент --
//
////        System.out.println(myValue1);
//        System.out.println(myValue2);
//
//        int i = 18;
//        System.out.println(i++);
//        System.out.println(++i);
//        System.out.println(i);

        int age = 55;

//      if(age < 18) {
//          System.out.println("Ваш возраст меньше 18 лет");
//      } else if (age > 60){
//          System.out.println("Вы слишком стары");
//      } else {
//          System.out.println("Вы купили товар");
//      }

//        System.out.println("Мой возраст = " + (age + 25));

        int a = 45;
        int b = 15;
        //a+b
        //a+1
        //a+b
        //b+1
        //a+b
//        System.out.println(myMath(a, b)); //60
//        a++; //46
//        System.out.println(myMath(a, b)); //46+15 =61
//        b++; //16
//        System.out.println(myMath(a, b)); //46+16 = 62
//        a++; //47
//        System.out.println(myMath(a, b)); //47+16 = 63
//
//        int result = myMath(147, 50);
//        System.out.println(result);
        myMethod1();

    }

    public static int myMath(int myArgument1, int myArgument2) {
        return myArgument1 * 2 + myArgument2;
    }

    public static void myMethod1() {
        int abc = 15;
        int cde = 160;
        System.out.println(abc + cde);
    }


    /*
1) Написать метод вычисляющий выражение a * (b + (c / d)) и
    возвращающий результат с плавающей точкой, где a, b, c, d – целочисленные входные параметры этого метода;

2) Написать метод, принимающий на вход два целых числа,
и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
если да – вернуть true, в противном случае – false;

3) Написать метод, которому в качестве параметра передается целое число,
метод должен проверить положительное ли число передали, или отрицательное.
Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль

4) Написать метод, которому в качестве параметра передается строка, обозначающая имя,
метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.

5)** Написать метод, который определяет является ли год високосным.
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
Для проверки работы вывести результаты работы метода в консоль


*/



}
