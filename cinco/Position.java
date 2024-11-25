package cinco;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public Position(int point, String side) {
        if (side.equals("x")){
            this.x = point;
            this.y = 0;
        } else if (side.equals("y")) {
            this.x = 0;
            this.y = point;
        }
    }

    public Position() {
        this.x = 0;
        this.y= 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int incX(int valueMovement) {
        return this.x = getX() + valueMovement;
    }
    public int incY(int valueMovement) {
        return this.y = getY() + valueMovement;
    }

    public int decX(int valueMovement) {
        return this.x = getX() - valueMovement;
    }
    public int decY(int valueMovement) {
        return this.y = getY() - valueMovement;
    }


    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

  /*  public static void main(String[] args) {
        // Position without Points
        Position p1 = new Position();
        System.out.println(p1);

        // Position with a Point
        Position p2 = new Position(3,"x");
        Position p3 = new Position(3,"y");
        System.out.println(p2);
        System.out.println(p3);

        // Position with both points
        Position p4 = new Position(3,6);
        System.out.println(p4);

        // More incX and incY
        p1.incX(3);
        p1.incY(4);

        p1.incX(1);
        p1.incY(1);

        System.out.println(p1);

        // Less decX and decY

        p1.decX(3);
        p1.decY(2);
        System.out.println(p1);

        //setXY

        p1.setXY(0,0);

        System.out.println(p1);




    }*/
}
