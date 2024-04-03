import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Triangle(4, 6), new Square(7)};

        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calcArea();
        }
        System.out.println("Total area of shapes: " + totalArea);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose member (1 - Human, 2 - Cat, 3 - Robot):");
        int choice = scanner.nextInt();
        Member member;
        switch (choice) {
            case 1:
                member = new Human(100, 1.5);
                break;
            case 2:
                member = new Cat(150, 2);
                break;
            case 3:
                member = new Robot(200, 7);
                break;
            default:
                System.out.println("Invalid choice. Default participant selected (Human).");
                member = new Human(100, 1.5);
                break;
        }

        Obstacle[] obstacles = {new Racetrack(100), new Wall(5)};

        member.setSuccess(true);
        for (Obstacle obstacle : obstacles) {
            member.run();
            member.jump();
            if (obstacle instanceof Racetrack) {
                if (!obstacle.overcome(member.getMaxRunDistance())) {
                    member.setSuccess(false);
                    break;
                }
            } else if (obstacle instanceof Wall) {
                if (!obstacle.overcome(member.getMaxJumpHeight())) {
                    member.setSuccess(false);
                    break;
                }
            }
        }
        if (member.isSuccess()) {
            System.out.println("Member " + member.getName() + " has overcome all obstacles");
        } else {
            System.out.println("Member " + member.getName() + " failed to overcome the obstacle");
        }
        scanner.close();
    }
}