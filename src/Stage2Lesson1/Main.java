package Stage2Lesson1;

import Stage2Lesson1.Obstacle.Cross;
import Stage2Lesson1.Obstacle.Obstacle;
import Stage2Lesson1.Obstacle.Wall;
import Stage2Lesson1.competitors.Cat;
import Stage2Lesson1.competitors.Competitors;
import Stage2Lesson1.competitors.Human;
import Stage2Lesson1.competitors.Robot;

public class Main {
    public static void main(String[] args) {
        Competitors[] competitors = {
                new Human("Boris"),
                new Cat("Vasiliy"),
                new Robot("R2")
        };

        Obstacle[] obstacles = {
                new Cross(100),
                new Wall(10)
        };

        for (Competitors c:competitors ) {
            for (Obstacle o:obstacles ) {
                o.doIt(c);
                if(!c.isOnDistance()){
                    break;
                }
            }
        }

        for (Competitors c:competitors ) {
            c.info();
        }
    }
}
