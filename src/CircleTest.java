import shapes.Circle;


public class CircleTest {
    public static void main(String[] args) {

        Circle circle1 = new Circle();//no arg constructor
        Circle circle2 = new Circle(3.5);//parameterized constructor

        //call getArea() method for object circle1
        System.out.println("Area of circle for first object circle1 with radius 0="+circle1.getArea());
        //call getArea() method for object circle2
        System.out.println("Area of circle for second object circle2="+circle2.getArea());
        //set radius of first circle to 1.5
        circle1.setRadius(1.5);
        //call getArea() method for object circle1
        System.out.println("Area of circle for first object circle1 with radius 1.5="+circle1.getArea());

    }

}