package lesson1;

public class Wolf extends Animal implements CanSwim,CanRun,CanJump {
    private int swimmingSpeed;
    private double runningSpeed;
    private double jumpingSpeed;

    public Wolf(String name, String color, int age) {
        super(name, color, age);
    }

    public double getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(double runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    public double getJumpingSpeed() {
        return jumpingSpeed;
    }

    public void setJumpingSpeed(double jumpingSpeed) {
        this.jumpingSpeed = jumpingSpeed;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void voice() {
        System.out.println("Волк воет!");
    }

    public double swim(Pool pool) {
        System.out.println("Я волк, я плыву!");
        System.out.println("Затратил " + pool.getLength() / swimmingSpeed);
        return pool.getLength() / swimmingSpeed;
    }

    public double run(Stadium stadium) {
        System.out.println("Я волк, я бегу!");
        double timeToOvercome = stadium.getLength() / runningSpeed;
        System.out.println("Затратил " + timeToOvercome);
        return timeToOvercome;
    }

    public double jump(JumpStadium jumpStadium) {
        System.out.println("Я волк, я прыгаю!");
        double timeToOvercome = jumpStadium.getLength() / jumpingSpeed;
        System.out.println("Затратил " + timeToOvercome);
        return timeToOvercome;
    }
}
