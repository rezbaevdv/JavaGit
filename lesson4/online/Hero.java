package lesson4.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 24.02.2021
 */

public class Hero {

    public static int countGold = 150;

    private int health; //поле класса
    private int energy;
    private int speed;
    private String name;
    private Weapon weapon = new Weapon(1500, 99, 5.74f);

//    Hero() {
//
//    }

    Hero(String name, int health, int energy, int speed) {
        this.name = name;
        this.health = health;
        this.energy = energy;
        this.speed = speed;
    }

    class Weapon {
        int pAtk;
        int atkSpeed;
        float weight;

        Weapon(int pAtk, int atkSpeed, float weight) {
            this.pAtk = pAtk;
            this.atkSpeed = atkSpeed;
            this.weight = weight;
//            System.out.println("weapon create by pAtk = " + pAtk + ", weight = " + weight);
        }
    }

    void speak() {
        System.out.println(name + " go-go-go!");
    }

    void run(){
        System.out.println(name + " run with speed " + speed);
    }

    void jump() {
        System.out.println(name + " has jump");
    }

    public void attack(int countAtk) {
         this.health -= countAtk;
    }

    //Getter
    public int getHealth() {
        return health;
    }

    public int getEnergy() {
        return energy;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon(){
        return weapon;
    }

    //Setter
    public void setEnergy(int speed) {
        this.speed = speed;
    }

    public static void voice() {
        System.out.println("voice something hero");
    }


}
