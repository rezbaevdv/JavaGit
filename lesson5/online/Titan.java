package lesson5.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 27.02.2021
 */

public class Titan extends Paladin {

    public Titan(String name, int health, int power, int attack, int defence, int level) {
        super(name, health, power, attack, defence, level);
    }

    @Override
    public void healSelf(int value) {
        System.out.println("Don't heal!");
    }

    @Override
    public void jump() {
        System.out.println("i dont have idea - what is jump?");
    }
}
