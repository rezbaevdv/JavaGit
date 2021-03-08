package lesson5.online;

import lesson5.online.models.Hero;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 27.02.2021
 */

public class Archer extends Hero {

    public Archer(String name, int health, int power, int attack, int defence) {
        super(name, health, power, attack, defence);
    }

    @Override
    public void jump() {
        System.out.println("jump-jump Archer");
    }
}
