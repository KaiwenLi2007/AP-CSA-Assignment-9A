public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 2.0;
    }
    public Rectangle(String color, boolean filled,double width, double length) {
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    @Override
    public double calculateArea(){return width*length;}

    @Override
    public double calculatePerimeter(){
        return 2*(width + length);
    }

    //Getter and Setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
