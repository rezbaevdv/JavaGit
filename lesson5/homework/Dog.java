package lesson5.homework;

public class Dog extends Animals {
    public Dog(int run, float jump, int sail) {
        super(run, jump, sail);

    }
    @Override
    void lengthRun(int lengthRunValue) {
        if ((lengthRunValue >=0) && (lengthRunValue<=run))
            System.out.println("Собака добежала дистанцию:");
        else System.out.println("Собака не добежала дистанцию! " + lengthRunValue + "м. не более " + run + "м.");
    }
    @Override
    void lengthJump(float lengthJumpValue) {
        if ((lengthJumpValue >=0) && (lengthJumpValue<=jump))
            System.out.println("Собака перепрыгнула высоту");
        else System.out.println("Собака не перепрыгнула высоту! " + lengthJumpValue + "м. не более " + jump + "м.");
    }
    @Override
    void lengthSail(int lengthSailValue) {
        if ((lengthSailValue >= 0) && (lengthSailValue <= sail))
            System.out.println("Собака переплыла");
        else System.out.println("Собака не может переплыть! " + lengthSailValue + "м. не более " + sail + "м.");
    }
}