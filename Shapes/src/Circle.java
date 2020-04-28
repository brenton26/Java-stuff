public class Circle extends Shape{

    private double radius;

    public Circle(double radius, int x_cord, int y_cord){
        super(x_cord, y_cord);
        this.radius = radius;
    }
    public Circle(double radius){
        this(radius, 0,0);
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return (this.radius*this.radius * Math.PI );
    }
}
