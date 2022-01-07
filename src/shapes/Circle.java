package shapes;

public class Circle {
    private double radius;

    //instantiate
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return (radius * radius) * Math.PI;
        //return Math.PI * (Math.pow(radius, 2));
    }
    public double getCircumference(){
        return radius * 2 * Math.PI;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
}
//    private final double PI = 3.14159;
//    // radius of circle
//    private double radius;
//    private double circumference;
//
//    // no arg Constructor
//    public Circle() {
//
//    }
//
//    public Circle(double radius, double circumference) {
//    }
//
//    // Parameterized constructor
//    //A Constructor with arguments(or you can say parameters) is known as Parameterized constructor.
//    // A constructor is a special type of method that initializes
//    // the newly created object.
//    public double Circle1(double radius) {
//                return radius;
//    }
//    public double Circle2(double circumference){
//        return circumference;
//    }
//    //Setter method for radius, aka MuTaTor
//    public void setRadius(double r) {
//        radius = r;
//    }
//    //Getter method for radius, aka Accessor
//    public double getRadius() {
//        return radius;
//    }
//    public void setCircumference(double c){
//        return c;
//    }
//    public double getCircumference(){
//        return circumference;
//    }
//    // method to calculate and return area
//    public double getArea() {
//
//        return PI * (radius * radius);
//    }
//    public double getCircumference() {
//        return 2 * PI * radius;
//    }
//    }
//public Circle(double radius)
//public double getArea()
//public double getCircumference()