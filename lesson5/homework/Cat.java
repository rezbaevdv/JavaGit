package lesson5.homework;

public class Cat extends Animals {
    Cat(int run, float jump) {
        super(run, jump);
    }
    @Override
    void lengthRun(int lengthRunValue) {
        if ((lengthRunValue >=0) && (lengthRunValue<=run))
            System.out.println("Кот добежал дистанцию:");
        else System.out.println("Кот не добежал дистанцию! "+ lengthRunValue + "м. не более " + run + "м.");
    }
    @Override
    void lengthJump(float lengthJumpValue) {
        if ((lengthJumpValue >=0) && (lengthJumpValue<=jump))
            System.out.println("Кот перепрыгнул высоту");
        else System.out.println("Кот не перепрыгнул высоту! " + lengthJumpValue + "м. не более " + jump + "м.");
    }
    @Override
    void lengthSail(int lengthSailValue) {
        System.out.println("Кот не умеет плавать!");
    }
}
