package lesson5.online;

import lesson5.online.models.Hero;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 27.02.2021
 */

public class Paladin extends Hero {

    int level;

    public Paladin(String name, int health, int power, int attack, int defence) {
        super(name, health, power, attack, defence);
        this.level = 0;
    }

    public Paladin(String name, int health, int power, int attack, int defence, int level) {
        super(name, health, power, attack, defence);
        this.level = level;
    }

    void block(){
        System.out.println(name + " has block");
    }

    @Override
    public void healSelf(int value) {
        super.healSelf(value);
        this.health += value;
        System.out.println("Paladin heal self complete");
    }

    @Override
    public void jump() {
        System.out.println(name + " is jump");
    }

}
