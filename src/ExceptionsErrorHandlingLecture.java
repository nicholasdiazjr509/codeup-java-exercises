import util.Input;

public class ExceptionsErrorHandlingLecture {

       public static String getBestRocketsPlayer() throws Exception {
           Input in = new Input();
           String answer = in.getString(" Who is the best Houston Rockets player of All time?");
           if(!answer.equalsIgnoreCase("Moochie Norris")){
               throw new DavidMadException("Expected \"Moochie Norris\" and instead received \"" + answer + "\".");
           }
           return "Correct! Moochie Norris was the best player.";
        }

public static void main(String[] args) {
//
//        try {
//            throw new Exception("No, Billy! Don't throw an exception!");
//            }catch (Exception e){
//                e.printStackTrace();
//            System.out.println("I can still do some stuff after printing the exception's stack trace.");
//        }
//        try{
//            System.out.println("Let's see...");
//            int result = 1 / 0;
//            System.out.println("I can divide by zero!");
//        }catch (Exception e){
//            e.printStackTrace();
//            System.err.println("Math still works!");
//        }
//        int[] numbers = {1, 2, 3,};
//        //int x;
//        int x = 0;
//        try {
//           // x = numbers[100];
//            x = numbers[2];
//        }catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Caught an array index exception!");
//        }catch (Exception e){
//            System.out.println("Caught a generic exception!");
//        }finally{
//            System.out.println("This will always run.");
//        }
//        System.out.println(x);
//
//        //checked and unchecked categories
//        //built in language
//        //don't need to wrap in a try catch
//

    //the good way
    try{
      getBestRocketsPlayer();
    }catch (Exception e) {
        e.printStackTrace();
        main(args);

    }
    }
}
