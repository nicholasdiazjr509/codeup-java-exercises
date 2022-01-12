import java.io.*;
import java.util.*;

public class Experiment {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();

        if (n % 2 != 0) {


            System.out.println("Weird");
        } else if (n % 2 == 0) {
//simplified (n >= 6 || n <= 20)
            System.out.println("Not Weird");

        } else {

            System.out.println("Not Weird");


        }

    }}