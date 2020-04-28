public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(int length, int width, int x_cord, int y_cord){
        super(x_cord, y_cord);
        this.length = length;
        this.width = width;
    }
    public Rectangle(int length, int width){
        this(length, width, 0, 0);
    }
    public Rectangle(int sides, int x_cord, int y_cord){
        this(sides, sides, x_cord, y_cord);
    }
    public Rectangle(int sides){
        this(sides, sides, 0, 0);
    }

    public int getArea(int length, int width){
        return length * width;
    }
}
