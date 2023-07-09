package units;

public class coordinate {
    int x;
    int y;

    public coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double calcCoordinate(coordinate point){
        int dx = point.x - x;
        int dy = point.y - y;
        return Math.sqrt((dx*dx) + (dy*dy));
    }
}
