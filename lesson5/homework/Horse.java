package lesson5.homework;

public class Horse extends Animals{
    public Horse(int run, float jump, int sail) {
        super(run, jump, sail);
    }
    @Override
    void lengthRun(int lengthRunValue) {
        if ((lengthRunValue >= 0) && (lengthRunValue <= run))
            System.out.println("Лошадь добежала дистанцию");
        else System.out.println("Лошадь не добежала! " + lengthRunValue + "м. не более " + run + "м.");
    }
    @Override
    void lengthJump(float lengthJumpValue) {
        if ((lengthJumpValue >=0) && (lengthJumpValue<=run))
            System.out.println("Лошадь перепрыгнула высоту");
        else System.out.println("Лошадь не перепрыгнула! " + lengthJumpValue + "м. не более " + jump + "м.");
    }
    @Override
    void lengthSail(int lengthSailValue) {
        if ((lengthSailValue >= 0) && (lengthSailValue <= sail))
            System.out.println("Лошадь переплыла");
        else System.out.println("Лошадь не может переплыть! " + lengthSailValue + "м. не более " + sail + "м.");
    }
}
