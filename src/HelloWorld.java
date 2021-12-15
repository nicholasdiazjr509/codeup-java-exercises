public class HelloWorld {
    public static void main(String[] args){
        System.out.print("Hello ");
        System.out.print("World!");

//        will this be read?
//        short month = 200;
        byte month = 12;
        System.out.println(month);
/**----------------------------------------------------------------------------------------*/

        // 1.
        int myFavoriteNumber = 69;
        System.out.println(myFavoriteNumber);
        //2.
        String myString = "hello";
        System.out.print(myString);

        //3.
//        String myString2 = 'l';
//        System.out.println(myString2);
//        char is for 1 character, String is for multiple characters.

        //4.
//        String myString3 = 3.14159;
//        System.out.println(myString3);
        //3.14159 is a double and a number character. Required type of string.

        //5.
//        long myNumber = ;
//        System.out.println(myNumber);
        //variable myNumber is not initialized. A primitive type.

        //6.
//        long myNumber2 = 3.14;
//        System.out.println(myNumber2);


        //7. 8.
        //requires L at the end of the 3.14 and it is a dbl for the decimal?
//        Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
       long myNumber3 = 123l;
        System.out.println(myNumber3);


        //9.
        //float myNumber = 3.14;
        double  myNumber4 = 3.14;
        System.out.println(myNumber4);
        //expects a double.
        //either add an 'f' to 3.14 or change float to double

        //10.
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        //prints out 5 then 6
        //prints the 5 before it increments it.

        int y = 5;
        System.out.println(++y);
        System.out.println(y);
        //it increments it and prints afterwards.
        //prints out 6 and 6, 2nd snippet has increment pre and changes variable to 6 not just add 1.


        //11.
      /**  var class */
                //class is reserved.
                //class and var are identifiers and cannot be combined.

        //12.
      /**  String theNumberThree = "three";
        Object o = theNumberThree; */
        //int three = (int) o;  //<<<<<
        //Exception in thread error.Can COMPILE. (runtime exception)String incompatible with Integer
//                   int three = (int) "three";
        //using   int three = (int) "three"; is the same. Its a String not an int.
        //2nd error, Incompatible types: String cannot be converted to an int
        //no output, cannot COMPILE



    //13.
//        int x = 4;
//        x += 5;
//        System.out.println(x);
//
//        int x = 3;
//        int y = 4;
//         y *= x;
//        System.out.println(xy);
//
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//        System.out.println(x);
//        System.out.println(y);
//
//        10 /= 2;
//        2 -= 10;
//
//    //14.
//        byte i = 200;
//        byte z = -111111111;
        //Error past smaller or larger than the type it can hold.
        //incompatible types: possible lossy conversion from int to byte
        //compile error.
        //Integer.MAX_VALUE class constant
        //System.out.println(Integer.MAX_VALUE);
    }
}
