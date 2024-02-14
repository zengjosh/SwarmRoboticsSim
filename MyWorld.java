import greenfoot.World;
import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() { 
        super(600, 400, 1); 
        populateWorld(10); // Add 10 robots to the world
    }
    
    private void populateWorld(int numberOfRobots) {
        for (int i = 0; i < numberOfRobots; i++) {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            Robot robot = new Robot();
            addObject(robot, x, y);
        }
    }
}
