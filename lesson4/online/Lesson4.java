package lesson4.online;

import lesson4.online.package1.ServerConnect;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 24.02.2021
 */

public class Lesson4 {

    public static void main(String[] args) {

        if (ServerConnect.testSelfConnection(15)){
            ServerConnect serverConnect = new ServerConnect();
        } else {
            System.out.println("warning");
        }
//
////        Hero hero1 = new Hero("Mario", 150, 200, 50);
//        Hero hero2 = new Hero("Alex", 100, 50, 200);
//        Hero hero3 = new Hero("Луиджи", 99, 500, 350);
//
////        hero1.name = "Mario";
////        hero1.health = 150;
////        hero1.energy = 200;
////        hero1.speed = 50;
////
////        hero2.name = "Alex";
////        hero2.health = 100;
////        hero2.energy = 50;
////        hero2.speed = 200;
//        System.out.println("Hero1 speed = " + hero1.getSpeed());
//        System.out.println(hero1.getHealth());
//        System.out.println(hero2.getName());
//        hero1.setEnergy(960);
//        System.out.println("Hero1 speed = " + hero1.getSpeed());
//
//        System.out.println("Name Hero 1 = " + hero1.getName() + ", his health count = " + hero1.getHealth());
//        System.out.println(hero1.getWeapon().atkSpeed);
//
//        System.out.println(hero3.getName());
//        System.out.println(hero3.getSpeed());
//
////        System.out.println("Hero1 " + hero1);
////        System.out.println("Hero2 " + hero2);
//
////        hero1 = hero2;
////
////        hero2.health = 1999;
////
////        System.out.println("Result1 " + hero1.health);
////
////        hero1.health = 2999;
////
////        System.out.println("Result2 " + hero2.health);
//
//        hero1.speak();
//        hero1.run();
//        hero2.jump();
//        System.out.println(hero1.getHealth());
//        hero1.attack(5);
//        System.out.println(hero1.getHealth());

//        Hero.voice();
//        System.out.println(Hero.countGold + 150);

    }
}

/**
 * 1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
 * 2 Конструктор класса должен заполнять эти поля при создании объекта;
 * 3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
 * 4 Вывести при помощи методов из пункта 3 ФИО и должность.
 * 5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 * 6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
 * 7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.
 */
