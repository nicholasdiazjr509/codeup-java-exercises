package shapes;

public class Square extends Quadrilateral{
    private double side;

public Square( double side) {
         this.width = side;
        this.side = side;
        this.length = side;
    }


    public void setSide(double side){
        this.width = side;
        this.length = side;
        this.side = side;
    }
    public double getSide(){
        return this.side;
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void setWidth(double width){
        setSide(width);
    }
    public double getPerimeter(){
        return 4 * length;
    }
    public double getArea(){
        return Math.pow(side, 2);
    }
//protected double side;
//
//    //square defines a constructor, accepts one argument. (side)
//    public Square(double side){
//        super(side, side);//From the parent's constructor, sets length and width to the value of side. Sides are same!!
//                            //calls the parent's constructor to set both the length and width to the value of side.
//       // this.side = side;//Length and width from line 6 rectangle class
//    }
//
//    public double getArea(){
//        System.out.println("Area of square: ");
//      //  return Math.pow(side, 2);
//        return Math.pow(super.length, 2);
//    }
//    public double getPerimeter(){
//        System.out.println("Perimeter of square: ");
//        //return 4 * side;
//        return 4 * super.length;
//
//    }


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
