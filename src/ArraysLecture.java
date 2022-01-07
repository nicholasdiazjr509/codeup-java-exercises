import java.util.Arrays;

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
        System.out.println(fruits);
        //THE ARRAYS CLASS
        // how to access array

        //Methods of array  Arrays.toString() - - returns a string with the elements in the array.
        System.out.println(Arrays.toString(fruits));

        //Arrays.fill() -- void, does not return anything, just does the thing.
        String[] stickers = new String[6];
        Arrays.fill(stickers, "(>^.^)><(^.^)");
        System.out.println(Arrays.toString(stickers));

        //Arrays.equals() - returns a boolean. Checks for both element values and length of the array.
        String[] extraFruits = {"orange", "apple", "banana", "grapefruit", null};
        System.out.println(Arrays.equals(fruits, extraFruits));

        //Arrays.copyOf() = returns a copy of the array.
        String[] fruitClones = Arrays.copyOf(extraFruits, 10);//dont forget the length
        System.out.println(Arrays.toString(fruitClones));

        // 2D ARRAYS

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

// access the first element in the second row
        System.out.println(matrix[1][0]); // 4
// the last element in the first row
        System.out.println(matrix[0][2]); // 3
// the first element in the last row
        System.out.println(matrix[2][0]); // 7

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }
            System.out.println();
        }

        System.out.println("+---+---+---+");

//        Circle[] circles = {new Circle(4), new Circle(5) };
//        circles[1].
    }
}