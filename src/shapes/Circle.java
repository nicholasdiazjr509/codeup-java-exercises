package shapes;

public class Circle {
    private final double PI = 3.14159;
    // radius of circle
    private double radius;

    // no arg Constructor
    public Circle() {
        radius = 0.0;
    }
    // Parameterized constructor
    //A Constructor with arguments(or you can say parameters) is known as Parameterized constructor.
    // A constructor is a special type of method that initializes
    // the newly created object.
    public Circle(double r) {
        radius = r;
    }
    //Setter method for radius, aka MuTaTor
    public void setRadius(double r) {
        radius = r;
    }
    //Getter method for radius, aka Accessor
    public double getRadius() {

        return radius;
    }
    // method to calculate and return area
    public double getArea() {

        return PI * radius * radius;
    }

}
//public Circle(double radius)
//public double getArea()
//public double getCircumference()