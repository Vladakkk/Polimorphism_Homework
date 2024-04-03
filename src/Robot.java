public class Robot extends Member{
    public Robot(double maxRunDistance, double maxJumpHeight) {
        super(maxRunDistance, maxJumpHeight);
    }

    public String getName() {
        return "Robot";
    }

    public void run() {
        System.out.println(getName() + " is running");
    }

    public void jump() {
        System.out.println(getName() + " is jumping");
    }
}

