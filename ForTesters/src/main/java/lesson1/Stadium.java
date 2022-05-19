package lesson1;

public class Stadium extends Course{
    protected double length;

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public Stadium(int length) {
        this.length = length;
    }

    public double getTimeToOvercome(CanRun runner) { return runner.run(this); }
}
