public class ArraysLecture
{
    public static void main(String[] args) {
        //defining and declaring arrays
        //To define an array, we establish the data type.
        //establish the variable name, and then instantiate with length.
        String[] fruits = new String[5];//length of 4

        //assign values, if only define 4 out the five
        //null for an object
        fruits[0] = "orange";
        fruits[1] = "apple";
        fruits[2] = "banana";
        fruits[3] = "grapefruit";

        //output = null since a String is an object reference, the default value is null.
        System.out.println(fruits[4]);

        //defined value and length
        boolean[] surveyAnswers = {true, false, true, false, false, true, false};
        System.out.println(surveyAnswers.length);

        //iterating arrays with our array in Java
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        //Enhanced for loop
        //JAVASCRIPT syntax
        //for (let element of array){}
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}