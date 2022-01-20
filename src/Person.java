

public class Person {

   private String name;
    private int age;
    private int weight;
    private int heightInCM;

    public Person(String name){
        this.name = name;
    }

    //creating the constructor
    public Person(){  //no arguments
        //say nothing.
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;

    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeightInCM() {
        return heightInCM;
    }
public void setHeightInCM(int heightInCM) {
        this.heightInCM = heightInCM;
    }
    //shortcut to create a constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    //actual constructor
    public Person(String name, int age, int weight, int heightInCM){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.heightInCM = heightInCM;
    }

    String sayHello(){
        return String.format("Hello from %s! They hope you are well!", name);
    }
    public String toString(){
        return String.format("{%nname: %s; %nage: %d; %nweight: %d; %nheightInCM: %d;%n}"
                , name, age, weight, heightInCM);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;//this keyword this instance of the class
    }


    public static void main(String[] args) {
        Person joe = new Person("Joe", 64, 350, 180);//instantiate/
        // new instance of that class! Datatype created is PERSON
    }

        //brand new instance of joe
//        joe.name = "Joe";
//        System.out.println(joe.sayHello());
//        Person susan = new Person();
//        susan.name = "Susan";
//        System.out.println(susan.sayHello());//same type, 2 different objects
//        System.out.println(joe);


//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        int jim = sc.nextInt();
//        System.out.println(jim);

//    Person person1 = new Person("John");
//    Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        //System.out.println(person1);
//        //System.out.println(person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
}
