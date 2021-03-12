package lesson5.homework;

public abstract class Animals {
    protected int run;
    protected float jump;
    protected int sail;

    abstract void lengthRun (int lengthRunValue);
    abstract void lengthJump (float lengthJumpValue);
    abstract void lengthSail (int lengthSailValue);

    public Animals (int run, float jump) {
        this.run = run;
        this.jump = jump;
    }

    public Animals (int run, float jump, int sail) {
        this.run = run;
        this.jump = jump;
        this.sail = sail;
    }
}
