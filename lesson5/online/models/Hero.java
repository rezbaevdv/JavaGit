package lesson5.online.models;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 27.02.2021
 */

public abstract class Hero {

    protected String name;
    protected int health;
    protected int power;
    protected int attack;
    protected int defence;

    public Hero(String name, int health, int power, int attack, int defence) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.attack = attack;
        this.defence = defence;
//        System.out.println("Create constructor Hero");
    }

    public void damage(){
        System.out.println(name + " has damage " + attack);
    }

    public void speak() {
        System.out.println(name + " something speak");
    }

    protected void healSelf(int value) {
        System.out.println(name + " heal-self at " + value);
    }

    protected abstract void jump();

}
