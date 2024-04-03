public class Member implements Runnable, Jumpable{
    private boolean success;
    private double maxRunDistance;
    private double maxJumpHeight;

    public Member(double maxRunDistance, double maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return "Member";
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

    public void run() {
        System.out.println(getName() + " is running");
    }

    public void jump() {
        System.out.println(getName() + " is jumping");
    }
}



