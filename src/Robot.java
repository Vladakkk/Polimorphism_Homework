public class Robot implements Member{
    private boolean success;
    private final double maxRunDistance = 200;
    private final double maxJumpHeight = 7;

    public void run() {
        System.out.println(getName() + " is running");
    }

    public void jump() {
        System.out.println(getName() + " is jumping");
    }

    public String getName() {
        return "Robot";
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

