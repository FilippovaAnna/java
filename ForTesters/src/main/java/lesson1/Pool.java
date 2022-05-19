package lesson1;

public class Pool extends Course {
    protected double length;

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public Pool(int length) {
        this.length = length;
    }

    public double getTimeToOvercome(CanSwim swimmer) {
        return swimmer.swim(this);
    }
}
