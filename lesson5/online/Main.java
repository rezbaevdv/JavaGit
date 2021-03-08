package lesson5.online;

import lesson5.online.models.Hero;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 27.02.2021
 */

public class Main {

    public static void main(String[] args) {

//        final int abc = 20;

        Paladin paladin = new Paladin("Paladin", 200, 100, 150, 200);
        Archer archer = new Archer("Archer", 100, 30, 200, 20);
        Mage mage = new Mage("Mage", 30, 10, 500, 5);
        Titan titan = new Titan("Titan", 500, 200, 500, 1000, 10);

//        paladin.speak();
//        archer.speak();
//        archer.damage();

//        mage.healSelf(10);
//        titan.jump();
//        paladin.block();
//        titan.block();
//        System.out.println("******");
//        paladin.healSelf(10);

//        Hero[] army = {paladin, archer, mage, titan};
//
//        for (int i = 0; i < army.length; i++) {
//            army[i].damage();
//            if (army[i] instanceof Paladin) {
////                ((Paladin) army[i]).block();
//                Paladin tmp = (Paladin) army[i];
//                tmp.block();
//            }
//        }

//        paladin.block();
//
//        titan.speak();
//        titan.damage();
//        titan.healSelf(1000);
//        titan.block();

        //        int i = 1000000212;
////        byte b = (byte) i; //typecasting -128..+127
//        short s = (short) i; // 32767
//        byte b = (byte) s;//127
//
//        byte b2 = 101;
//        int i2 = b2;
//
//        System.out.println(b);
        int a = 10;
        String myString = "Hello world";


        Object[] arrayObjs = new Object[3];
        arrayObjs[0] = a;
        arrayObjs[1] = myString;
        arrayObjs[2] = titan;

        for (int i = 0; i < arrayObjs.length; i++) {
            if (arrayObjs[i] instanceof Titan) {
                ((Titan)arrayObjs[i]).damage();
            }
        }

    }

}

/**
 1. Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.

 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
 В качестве параметра каждому методу передается величина, означающая или длину
 препятствия (для бега и плавания), или высоту (для прыжков).

 3. У каждого животного есть ограничения на действия
 (бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
 прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
 плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).

 4. При попытке животного выполнить одно из этих действий,
 оно должно сообщить результат.
 (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')

 5. * Добавить животным разброс в ограничениях.
 То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

 **/