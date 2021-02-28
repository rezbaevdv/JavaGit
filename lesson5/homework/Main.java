/** Домашнее задание Java1. Level1. Step5
        1. Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.
        2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
        В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания),
        или высоту (для прыжков).
        3. У каждого животного есть ограничения на действия
        (бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,; прыжок: кот 2 м., собака 0.5 м.,
        Лошадь 3 м., Птица 0.2 м. ; плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).
        4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат.
        (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')
        5. * Добавить животным разброс в ограничениях.
        То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.м
*/
package lesson5.homework;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Dog dog = new Dog(500, 0.5f, 10);
        Horse horse = new Horse(1500, 3, 100);
        Cat cat = new Cat(200, 2);
        Bird bird = new Bird(5, 0.2f);

        System.out.println("Введите дистанцию для бега:");
        int lengthRunValue = scanner.nextInt();

        dog.lengthRun(lengthRunValue);
        horse.lengthRun(lengthRunValue);
        cat.lengthRun(lengthRunValue);
        bird.lengthRun(lengthRunValue);

        System.out.println("\nВведите высоту для прыжка:");
        float lengthJumpValue = scanner.nextInt();
        dog.lengthJump(lengthJumpValue);
        horse.lengthJump(lengthJumpValue);
        cat.lengthJump(lengthJumpValue);
        bird.lengthJump(lengthJumpValue);

        System.out.println("\nВведите дистанцию для плавания:");
        int lengthSailValue = scanner.nextInt();
        dog.lengthSail(lengthSailValue);
        horse.lengthSail(lengthSailValue);
        cat.lengthSail(lengthSailValue);
        bird.lengthSail(lengthSailValue);

    }
}