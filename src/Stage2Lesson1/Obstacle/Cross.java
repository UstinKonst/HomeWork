package Stage2Lesson1.Obstacle;

import Stage2Lesson1.competitors.Competitors;

public class Cross extends Obstacle {
    private int dist;
    public Cross(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitors competitors) {
        competitors.run(dist);
    }
}
