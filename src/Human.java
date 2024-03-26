public class Human extends Member {
    public Human(double maxRunDistance, double maxJumpHeight) {
        super(maxRunDistance, maxJumpHeight);
    }

    public String getName() {
        return "Human";
    }

    public void run() {
        System.out.println(getName() + " is running");
    }

    public void jump() {
        System.out.println(getName() + " is jumping");
    }
}

