package lesson5.online;

import lesson5.online.models.Hero;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 27.02.2021
 */

public class Mage extends Hero {

    public Mage(String name, int health, int power, int attack, int defence) {
        super(name, health, power, attack, defence);
    }

    @Override
    protected void healSelf(int value) {
        super.healSelf(value);
    }

    @Override
    public void jump() {
        System.out.println("jump-jump-jump Mage");
    }
}
