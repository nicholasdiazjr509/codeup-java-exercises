import util.Input;

public class InputTest{
    public static void main(String[] args) {
        Input input = new Input();
        input.getInt();
        String getString = input.getString();
        System.out.println(getString);

        Boolean yesNo = input.yesNo("Yes or No?");
        System.out.println(yesNo);
        input.setMinMaxInt(1, 10);
        input.getInt();
        input.setMinMaxDouble(2,30);
        input.getDouble();


//        System.out.println("Enter a number between 2.5 and 4.5");
//        double userInt = input.getDouble(2.5, 4.5);
//        System.out.println("You entered: " + userInt);
    }
}
