package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape;
        myShape = new Rectangle(7, 11);
        System.out.println("For my Rectangle: \n"+myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Square(4);
        System.out.println("For my Square: \n"+myShape.getPerimeter());
        System.out.println(myShape.getArea());
       // System.out.println(myShape.getWidth());
        // wont work unless a method is in the Measurable class for it
    }

}
    
    
//        //instantiate a NEW rectangle.
//        Rectangle box1 = new Rectangle(5, 4);//variable of the type rectangle named "box1" and assigned it
//
//        Rectangle box2 = new Square(5);
//
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
//
//        }
//    }

