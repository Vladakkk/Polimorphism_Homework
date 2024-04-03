public class Cat extends Member {
    public Cat(double maxRunDistance, double maxJumpHeight) {
        super(maxRunDistance, maxJumpHeight);
    }

    public String getName() {
        return "Cat";
    }

    public void run() {
        System.out.println(getName() + " is running");
    }

    public void jump() {
        System.out.println(getName() + " is jumping");
    }
}



