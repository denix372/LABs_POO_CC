package Lab3.Problema5;

public class Punct {
    private int x, y;

    public Punct() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(int x, int y) {
        return Math.sqrt( Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance(Punct p) {
        return Math.sqrt( Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
