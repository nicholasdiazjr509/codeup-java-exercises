import java.util.*;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean confirmation = true;

        do {
            String response = sc.nextLine();
            if (response.endsWith("?")) {
                System.out.println("Sure.");
            } else if (response.endsWith("!")) {
                System.out.println("Woah, chill out!");
            } else if (response.isEmpty()) {
                System.out.println("FINE. Be that way!");

            } else if (response.contains("bye")) {
                System.out.println("Bye!");
                confirmation = false;
            } else {
                System.out.println("Whatever dude");
            }
        } while (confirmation);
    }
}