package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        //instantiate a NEW rectangle.
        Rectangle box1 = new Rectangle(5, 4);//variable of the type rectangle named "box1" and assigned it

        Rectangle box2 = new Square(5);

        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

        }
    }

