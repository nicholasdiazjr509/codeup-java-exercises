package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    //protected fields of length and width. Attribute of a variable sets "visibility"  for a variable.
    protected double length;
    protected double width;
    public Quadrilateral(){
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    //abstract methods
    public abstract void setLength(double length);

    public abstract void setWidth(double width);

}
//    public double getPerimeter() {
//        return (2 * length + 2 * width);
//    }
//
//    public double getArea() {
//        return width * length;
//    }

//    public double getLength() {
//        return length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//}
