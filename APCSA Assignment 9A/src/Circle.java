public class Circle extends Shape{

    private double radius;

    public Circle(String color, boolean filled,double radius) {
        super(color,filled);
        this.radius = radius;
    }
    public Circle() {
        super();
        this.radius = 1.0;
    }

    @Override
    public double calculateArea(){return radius*radius*Math.PI;}

    @Override
    public double calculatePerimeter(){
        return 2*radius*Math.PI;
    }

    //Getter and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
