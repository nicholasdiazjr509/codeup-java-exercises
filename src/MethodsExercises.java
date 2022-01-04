import java.util.Scanner;

public class MethodsExercises {


    public static void addition(int num1, int num2) {
        int add = num1 + num2;
        System.out.println("Addition: " + add);

//        public static int addition(int num1, int num2){
//            return num1 + num2;
//        }
    }

    public static void subtraction(int num1, int num2) {
        int subtract = num1 - num2;
        System.out.println("Subtraction: " + subtract);
        //if(num1 < num2){
        //    return num1 - num2;
    //} else{
    //   return num1 - num2;
        // }

}
//w/o recursion
    public static int multiplyRecursive(int num1, int num2){
        if(num2 == 0) {
            return 0;
        }else{
            return num1 + multiplyRecursive(num1, num2 -1);
        }
}

    public static void multiplication(int num1, int num2){
        int multiply = num1 * num2;
        System.out.println("Multiplication: " + multiply);


    }
    public static void noAsterik(int num1, int num2){
        int result = 0;
        for ( int i = 1; i <=num1; i++){
            result += num2;
        }
        System.out.println(result);
    }

    public static void division(int num1, int num2){
        int divide = num1 / num2;
        System.out.println("Division: " + divide);
    }

    public static void modulus(int num1, int num2){
        int module = num1 % num2;
        System.out.println("Modulus: " + module);
    }


    public static int getInteger(int min, int max){ //cannot be a "void". remember use the int here
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number between 1 and 10.");
        int userInput = sc.nextInt();

        if(userInput <= 1 || userInput >= 10) {
            System.out.println("Not valid! Number must be between 1 and 10.");
            return getInteger(min, max);
        }else {
            System.out.println("Number chosen: " + userInput);
        }
        return userInput;
        }

    private static long getFactorial( ) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Choose a number between 1 and 10.");
        long input = sc.nextInt();

        if (input <= 1 || input >= 10) {
            System.out.println("Number must be between 1 and 10.");
            return getFactorial();

        } else {
            long count = 1;
            for (int i = 1; i <= input; i++) {
                count *= i;
                System.out.println(i + "!" + " = " + count);
            }
            System.out.println("Factorial output of " + input + " is: " + count);
            System.out.println("Would you like to continue?");
            String goAgain = sc.next().toLowerCase();
            if (goAgain.startsWith("y")) {
                getFactorial();
            } else {

                System.out.println("Goodbye");

            }
            return count;
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        //System.out.println(addition(2,2));
        //System.out.println(subtraction(2,2));


            System.out.println(multiplyRecursive(2, 5));
            noAsterik(4,3);
            MethodsExercises.getFactorial();
            MethodsExercises.addition(2, 2);
            MethodsExercises.subtraction(2, 2);
            MethodsExercises.multiplication(2, 2);
            MethodsExercises.division(2,2);
            MethodsExercises.modulus(2,3);
            MethodsExercises.getInteger(1,10);

}
}