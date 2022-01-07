package shapes;


import util.Input;

public class CircleApp {

        public static void createCircle(){

        Input input = new Input();
        Boolean proceed = false;

        Circle circle = new Circle(input.getDouble("Enter the radius for the circle"));
       System.out.printf("The area of a circle with a radius of %f is: %f\n", circle.getRadius(), circle.getArea());
        input.yesNo("Create another circle?");
    if(input.yesNo()) {
        createCircle();
    }else{
        return;
    }


        }

public static void main(String[] args) {
//        Circle circle1 = new Circle(4);
//        System.out.println(circle1.getArea());
}
        }