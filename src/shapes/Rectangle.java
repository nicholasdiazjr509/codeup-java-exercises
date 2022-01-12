package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
       this.length = length;
       this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;

}
public double getPerimeter(){
        return (length + width) * 2;
}
public double getArea(){
        return length * width;
}
}
//    protected double length;
//    protected double width;
//
//    //Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    //methods
////    Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values.
//    public double getArea() {
//        System.out.println("Rectangle area: ");
//        return this.length * this.width;//use l and w of this specific object. explicit of what object to target
//    }
//
//    public double getPerimeter() {
//        System.out.println("Rectangle perimeter: ");
//        return (2 * (this.length) + (2 * (this.width)));
//    }
//}
//    public void setLength(double length){
//         this.length = length;
//    }
//    public void setWidth(double width){
//        this.width = width;
//    }

