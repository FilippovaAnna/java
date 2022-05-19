package lesson1;

public class JumpStadium extends Course {
    protected double length;

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public JumpStadium(int length) {
        this.length = length;
    }

    public double getTimeToOvercome(CanJump jumper) { return jumper.jump(this); }
}
