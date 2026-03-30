package immutable;

public class Position {
    private final int x, y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Position offset(int xOff, int yOff){
        return new Position(x+xOff, y+yOff);
    }
}
