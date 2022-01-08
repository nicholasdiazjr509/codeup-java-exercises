import java.io.*;
import java.util.*;

public class PracticeJava {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner stdin = new Scanner(System.in);

        //    for(int i = 0; i < 3; ++i) {
        System.out.println("enter a number por favor:");
        int a=stdin.nextInt();
        System.out.println("enter another number por favor:");

        int b= stdin.nextInt();
        System.out.println("enter the last number por favor:");

        int c= stdin.nextInt();

        stdin.close();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
//}