import java.util.*;
import java.io.*;

public class java_practice {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
         Scanner stdin = new Scanner(System.in);
//        for (int j = 0; j < 3; ++j) {
//            int b = sc.nextInt();
//            System.out.println(b);
//        }
//            for (int i = 0; i < 3; ++i) {
//                int a = stdin.nextInt();
//                    System.out.println(a);

//                System.out.println(sc.nextInt());
//                System.out.println(sc.nextInt());
//                System.out.println(sc.nextInt());
// I like to practice this!


//   Task
//In this challenge, you must read
//integers from stdin and then print them to stdout.
// Each integer must be printed on a new line. To make the problem a little easier,
// a portion of the code is provided for you in the editor below.
//Input Format
//There are lines of input, and each line contains a single integer.
//Sample Input
//42
//100
//125
//            }
/** In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. To make the problem a little easier, a portion of the code is provided for you in the editor.
 Note: We recommend completing Java Stdin and Stdout I before attempting this challenge.
 Input Format******************
 There are three lines of input:
        The first line contains an integer.
        The second line contains a double.
        The third line contains a String.

 Output Format******************
 There are three lines of output:
 On the first line, print String: followed by the unaltered String read from stdin.
 On the second line, print Double: followed by the unaltered double read from stdin.
 On the third line, print Int: followed by the unaltered integer read from stdin.
 To make the problem easier, a portion of the code is already provided in the editor.
 Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).

 Sample Input********************
 42
 3.1415
 Welcome to HackerRank's Java tutorials!
 Sample Output*******************
 String: Welcome to HackerRank's Java tutorials!
 Double: 3.1415
 Int: 42
 */




                int x = stdin.nextInt();
                double y = stdin.nextDouble();
                stdin.nextLine();
                String s = stdin.nextLine();


                System.out.println("String: "+s);
                System.out.println("Double: "+y);
                System.out.println("Int: "+x);
            }
        }


