import shapes.Circle;


public class CircleTest {
    public static void main(String[] args) {


        Circle circle = new Circle(3.5);//parameterized constructor

        circle.setRadius(1.5);
        //call getArea() method for object circle1
        System.out.println("Area of circle for first object circle1 with radius 1.5 = "+circle.getArea());

    }

}