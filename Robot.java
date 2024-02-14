import greenfoot.Actor;
import greenfoot.Greenfoot;
import java.util.List;

public class Robot extends Actor {
    private static final int speed = 2; // Adjust as necessary
    
    public Robot() {
        // Optionally set an image for the Robot
        // setImage("robot.png");
    }
    
    public void act() {
        moveTowardsTarget(300, 200); // Example target coordinates
        //avoidCollisions();
    }
    
    private void moveTowardsTarget(int targetX, int targetY) {
        int dx = targetX - getX();
        int dy = targetY - getY();
        int angle = (int) Math.toDegrees(Math.atan2(dy, dx));
        setRotation(angle);
        move(speed);
    }
    
    private void avoidCollisions() {
        List<Robot> nearbyRobots = getObjectsInRange(50, Robot.class); // Adjust range as needed
        if (!nearbyRobots.isEmpty()) {
            for (Robot robot : nearbyRobots) {
                int angleAway = getRotation() + 180;
                setRotation(angleAway);
                move(speed);
            }
        } else {
            
        }
    }
}
