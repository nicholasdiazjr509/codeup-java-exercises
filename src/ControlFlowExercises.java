import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //1.
        //a.
//        int i = 5;
//        while(i <= 15){
//                i++;
//            System.out.printf("%s ", i -1);
//        }
//        int i = 0;
//        do {
//            i += 2;
//            System.out.printf("%d %n", i);
//            //“%d"
//
//        } while (i < 100);
//        System.out.printf("%n ");
//
//        int j = 105;
//        do {
//            j -= 5;
//            System.out.printf("%s ", j);
//        } while (j > -10);

//----------------------------------
//        long k = 2;
//        do {
//            System.out.printf("%d %n", k);
//            k *= k;
//        } while
//        (k < 1000000);

        for (int j = 105; j > -10; j -= 5) {
            System.out.printf("%d %n", j);
        }

        for (long k = 2; k < 1000000; k *= k) {
            System.out.printf("%d %n", k);
        }

//2. FizzBuzz
//int n = 100;
//    for (int l =1; l <= n; l++){ //loop 100 times
//        if(l % 15 == 0)// # divisible by 15(3 & 5), Print FizzBuzz for #
//            System.out.print("FizzBuzz" + " ");
//        else if(l % 5 == 0)//# divisible by 5, print Buzz for #
//            System.out.print("Buzz" + " ");
//        else if(l % 3 == 0)//# divisible 3, print Fizz for #
//            System.out.print("Fizz" + " ");
//        else//else, print the #'s
//            System.out.print(l + " ");
//    }

        //3.
        Scanner sc = new Scanner(System.in);



            System.out.print("What number would you like to go up to?");
            int userInput = sc.nextInt();

            System.out.println("Here is your table!\n" +
                    "number\t| square\t| cubed\n" +
                    "------\t| ------\t| -----");
                //            for (int i = 1; i <= num; i++) {
                //                int squaredNum = i ^ 2;
                //                int cubedNum = i ^ 3;
                //           System.out.printf("%d\t\t| %d\t\t\t| %d%n", i, squaredNum, cubedNum);
                //             userInput = sc.nextLine();
//3.
            int i = 1;
            while (i < userInput + 1) {
                System.out.println("\t" + i + "\t" + "|" + "\t" + i * i + "\t\t|" + i * i * i);
                i++;
            }
//4.
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter an number grade please.");
        int userInput2 = sc.nextInt();

        if(userInput2 >= 88 & userInput2 <= 100){
            System.out.println("You received an A");
        }else if(userInput2 >= 80 & userInput2 <= 87){
            System.out.println("You received an B");
        }else if(userInput2 >=67 & userInput2 <= 79){
            System.out.println("You received an C");
        }else if(userInput2 >= 60 & userInput2 <= 66){
            System.out.println("You received an D");
        }else{
            System.out.println("You received an F");
        }
//A : 100 - 88
//B : 87 - 80
//C : 79 - 67
//D : 66 - 60
//F : 59 - 0



            }
        }
