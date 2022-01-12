import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLecture {
    //A collection is a data structure that collects, or groups of objects together.

    public static void main(String[] args) {
        //To instantiate an ArrayList, make an instance
       // ArrayList<Integer> numbers = new ArrayList<Integer>();  //what type or list of? Between <>. Hast to be an object.
            //needs the "Integer" class. Not just "int". "ITS OBJECT TYPE <Integer> Primitive data type into an object.
        //lower case is its primitive data type "int".
        ArrayList<String> petNames = new ArrayList<>();
                //petNames[0] = "Kali";
        // .add() - adds an element to the ArrayList.
        petNames.add("Kali");
        petNames.add("Nikolai");
        petNames.add("Chorizo");
        petNames.add(0, "Bevo");//to add to the 1st index by specifying it

        System.out.println(petNames);

        //With arrays we find the number of elements by using the .length field
        //WIth ArrayLists, we can use the .size() method.
        System.out.println(petNames.size());
        //.get(index) - returns the index of where the element is.
        //System.out.println(petNames.get());

        //HASH MAPS
        //A hash map is a data structure for key-value pairs.
        //the key and value in <> has to be an OBJECT!
        HashMap<String, Person> people = new HashMap<>();//its reference name

        Person p1 = new Person("Jay");
        Person p2 = new Person("David");
        Person p3 = new Person("Trevor");
        Person p4 = new Person("Bianca");

        //.put(key, value) - establishes the key and value.
        people.put(p1.getName(), p1);
        people.put(p2.getName(), p2);
        people.put(p3.getName(), p3);
        people.put(p4.getName(), p4);

        System.out.println(people);

        // .putIfAbsent(key, value) - only sets a key-pair value if it does not exists.
        //have as our default in case it already exists.
        people.putIfAbsent("Jay", new Person("Jay"));
        System.out.println(people);

        // takes in a "key"
        // .get(key) - returns the value for the specified key.
        System.out.println(people.get("Bianca").sayHello());

        //.getOrDefault() - like get, but a defined value instead of null,
        System.out.println(people.getOrDefault("Adam", p1)); //key is type of String

        //.containsKey() - returns boolean whether or not the Key exists in the Map
        System.out.println(people.containsKey("Bevo"));

        //.containsValue()
        System.out.println(people.containsValue(p1));

        //.remove(key) - remove a key-value- No Return
        people.remove("Trever");
        System.out.println(people);

        //.replace(key, value) - only replaces the KEY not the VALUE. at a given key.
        people.replace("Jay", new Person("Jay"));

        System.out.println(people);

        //.clear() - empties array
        people.clear();

        //.isEmpty()-no args/parameer- returns boolean on whether elements exist in the array or not.
        System.out.println(people.isEmpty());


    }
}
