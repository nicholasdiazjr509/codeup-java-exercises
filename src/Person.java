import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Scanner;

public class Person {
    String name;
    int age;
    int weight;
    int heightInCM;

    String sayHello(){
        return String.format("Hello from %s! They hope you are well!", name);
    }
    public String toString(){
        return String.format("{%nname: %s; %nage: %d; %nweight: %d; %nheightInCM: %d;%n}"
                , name, age, weight, heightInCM);
    }

    public static void main(String[] args) {
        Person joe = new Person();//instantiate/ new instance of that class! Datatype created is PERSON
        //brand new instance of joe
        joe.name = "Joe";
        System.out.println(joe.sayHello());
        Person susan = new Person();
        susan.name = "Susan";
        System.out.println(susan.sayHello());//same type, 2 different objects
        System.out.println(joe);


//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        int jim = sc.nextInt();
//        System.out.println(jim);
    }
}
