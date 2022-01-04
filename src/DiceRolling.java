import java.util.*;

public class DiceRolling {

        public static int[] sumResult = {0,0,0,0,0,0,0,0,0,0,0,0};
        public static int numOfRolls = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rolls of dice: ");
        numOfRolls = sc.nextInt();
        generateDiceRolling();

    }
    public static void generateDiceRolling(){
        int firstDie = 0;
        int secondDie = 0;
        int sum = 0;
    for(int i = 0; i < numOfRolls; i++){
        Random rand = new Random();

        firstDie = 1 + rand.nextInt((6-1) + 1);
        secondDie = 1 + rand.nextInt((6-1) + 1);
        sum = firstDie + secondDie;
        sumResult[sum] = sumResult[sum] + 1;
    }
        printResult();
    }
    public static void printResult() {
        double sumTotal = 0;
        for (int j : sumResult){
            sumTotal += j;
        }
        System.out.format("Number of rolls is %d \n", numOfRolls);
        for(int k = 2; k <=12; k++){
            System.out.format("Results: " + (sumResult[k]));
        }
        System.out.println();
    for (int k=2; k<=12; k++){
        String stringOutput = "";

    }
    }

}
