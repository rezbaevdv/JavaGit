package lesson5.homework;

public class Bird extends Animals {
    Bird(int run, float jump) {
        super(run, jump);
    }

    @Override
    void lengthRun(int lengthRunValue) {
        if ((lengthRunValue >=0) && (lengthRunValue<=run))
            System.out.println("Птица добежала дистанцию:");
        else System.out.println("Птица не добежала дистанцию! "+ lengthRunValue + "м. не более " + run + "м.");
    }
    @Override
    void lengthJump(float lengthJumpValue) {
        if ((lengthJumpValue >=0) && (lengthJumpValue<=jump))
            System.out.println("Птица перепрыгнула высоту");
        else System.out.println("Птица не перепрыгнула высоту! " + lengthJumpValue + "м. не более " + jump + "м.");
    }
    @Override
    void lengthSail(int lengthSailValue) {
        System.out.println("Птица не умеет плавать!");
    }
}
