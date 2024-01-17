public class House extends Triangle {
    private Rectangle base;

    public House(String color, boolean filled, double side, double SideSide) {
        super(color, filled, side, side, side);
        this.base = new Rectangle(color, filled, side, SideSide);
    }

    public House() {
        super();
        this.base = new Rectangle();
    }

    //Getter and Setters
    public Rectangle getBase() {
        return base;
    }

    public void setBase(Square base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return super.calculateArea() + base.calculateArea();
    }

    @Override
    public double calculatePerimeter() {
        return super.calculatePerimeter() + base.calculatePerimeter() - 2*super.getSide1();
    }

    @Override
    public void displayInfo() {
        System.out.println("House:");
        System.out.println("Base:");
        base.displayInfo();
        System.out.println("Roof:");
        super.displayInfo();
    }
}
