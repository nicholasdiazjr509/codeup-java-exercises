package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //methods
    public double getArea() {
        System.out.println("Rectangle area: ");
        return this.length * this.width;
    }

    public double getPerimeter() {
        System.out.println("Rectangle perimeter: ");
        return (2 * (this.length) + (2 * (this.width)));
    }
}
//    public void setLength(double length){
//         this.length = length;
//    }
//    public void setWidth(double width){
//        this.width = width;
//    }

