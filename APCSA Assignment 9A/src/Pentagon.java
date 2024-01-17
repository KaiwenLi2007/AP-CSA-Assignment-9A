public class Pentagon extends Shape {
    private double side;

    public Pentagon(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }
    public Pentagon(){
        super();
        this.side = 1.0;
    }

    //Getter and Setters
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (0.25) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 5 * side;
    }
}
