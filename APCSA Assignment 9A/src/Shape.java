public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        this.color = "White";
        this.filled = false;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public double calculateArea(){
        return 0.0;
    }
    public double calculatePerimeter(){
        return 0.0;
    }
    public void displayInfo(){
        System.out.println("Color: " + color);
        System.out.println("Filled: " + filled);
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
