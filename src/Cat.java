public class Cat implements Member {
    private boolean success;
    private final double maxRunDistance = 150;
    private final double maxJumpHeight = 2;

    public void run() {
        System.out.println(getName() + " is running");
    }

    public void jump() {
        System.out.println(getName() + " is jumping");
    }

    public String getName() {
        return "Cat";
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public double getMaxRunDistance() {
        return maxRunDistance;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }
}



