package Stage2Lesson1.Obstacle;

import Stage2Lesson1.competitors.Competitors;

public class Wall extends Obstacle {
    private int height;
    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitors competitors) {
        competitors.jump(height);
    }
}
