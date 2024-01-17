import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("This is the TEST of Shapes. ");
        //Test Shape class
        Shape shape1 = new Shape("Red", true);
        Shape shape2 = new Shape("Blue", false);

        shape1.displayInfo();
        System.out.println("Area: " + shape1.calculateArea());
        System.out.println("Perimeter: " + shape1.calculatePerimeter());
        System.out.println();

        shape2.displayInfo();
        System.out.println("Area: " + shape2.calculateArea());
        System.out.println("Perimeter: " + shape2.calculatePerimeter());
        System.out.println();

        System.out.println("This is the TEST of Circles, Rectangles, and Triangles");
        // Test Circle
        Circle circle = new Circle("Green", true, 5.0);
        circle.displayInfo();
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println();

        // Test Rectangle
        Rectangle rectangle = new Rectangle("Yellow", false, 4.0, 6.0);
        rectangle.displayInfo();
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println();

        // Test Triangle
        Triangle triangle = new Triangle("Purple", true, 3.0, 4.0, 5.0);
        triangle.displayInfo();
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
        System.out.println();

        //Shape Array
        System.out.println("This is the TEST of Array of Shape: ");
        Shape[] shape = new Shape[6];
        shape[0] = new Circle("White", true, 1.0);
        shape[1] = new Rectangle("Blue", false, 4.0, 8.0);
        shape[2] = new Triangle("Purple", true, 3.0, 7.0, 9.0);
        shape[3] = circle;
        shape[4] = rectangle;
        shape[5] = triangle;
        for(Shape a: shape){
            a.displayInfo();
            System.out.println("Area: " + a.calculateArea());
            System.out.println("Perimeter: " + a.calculatePerimeter());
            System.out.println();
        }


        System.out.println("This is the TEST of Square, Pentagon, and House. ");
        // Test Square
        Square square = new Square("Brown", true, 8.0);
        square.displayInfo();
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.calculatePerimeter());
        System.out.println();

        // Test Pentagon
        Pentagon pentagon = new Pentagon("Gray", false, 5.0);
        pentagon.displayInfo();
        System.out.println("Area: " + pentagon.calculateArea());
        System.out.println("Perimeter: " + pentagon.calculatePerimeter());
        System.out.println();

        // Test House
        House house = new House("Blue", true, 6.0, 6.0);
        house.displayInfo();
        System.out.println("Area: " + house.calculateArea());
        System.out.println("Perimeter: " + house.calculatePerimeter());

        System.out.println("This is the TEST of Array of Shape #2");
        Shape[] shapestestsecond = new Shape[9];
        shapestestsecond[0] = new Circle("White", true, 1.0);
        shapestestsecond[1] = new Rectangle("Blue", false, 4.0, 8.0);
        shapestestsecond[2] = new Triangle("Purple", true, 3.0, 7.0, 9.0);
        shapestestsecond[3] = circle;
        shapestestsecond[4] = rectangle;
        shapestestsecond[5] = triangle;
        shapestestsecond[6] = square;
        shapestestsecond[7] = pentagon;
        shapestestsecond[8] = house;
        for(Shape a: shapestestsecond){
            a.displayInfo();
            System.out.println("Area: " + a.calculateArea());
            System.out.println("Perimeter: " + a.calculatePerimeter());
            System.out.println();
        }
    }
}