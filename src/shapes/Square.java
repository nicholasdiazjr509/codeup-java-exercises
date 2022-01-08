package shapes;

public class Square extends Rectangle{
    protected double side;

    //square defines a constructor, accepts one argument. (side)
    public Square(double side){
        super(side, side);//From the parent's constructor, sets length and width to the value of side.
        this.side = side;//Length and width from line 6 rectangle class
    }

    public double getArea(){
        System.out.println("Area of square: ");
        return Math.pow(side, 2);

    }
    public double getPerimeter(){
        System.out.println("Perimeter of square: ");
        return 4 * side;
    }


//    public void setWidth(double width) {
//        this.width = width;
//        this.length = width;
//    }
//
//
//    public void setLength(double length) {
//            this.width = length;
//            this.length = length;
//          }
}
