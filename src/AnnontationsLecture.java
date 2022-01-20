import util.Input;

import java.util.*;

//@SuppressWarnings("{deprecation, unchecked}")
//@SuppressWarnings("all")
public class AnnontationsLecture {
    @Deprecated
    public static String welcome(String name){
        return "Welcome from " + name;
    }
    public static String greeting(String name){
        return String.format("Greeting from %s.", name);
    }
    @SuppressWarnings("unchecked")
    public List<String> languages(){
        return new ArrayList<>();
    }
    public static void main(String[] args){
        System.out.println(welcome("Jeb"));
        AnnontationsLecture lec = new AnnontationsLecture();
        List langs = lec.languages();
        Input in = new Input();
        int num = in.getInt();

        langs.add("Timmy");
        langs.add(7);
        //System.out.println(langs);
        langs.forEach((el) -> System.out.println(el));
        System.out.println(num / 0);
        System.out.println(DeprecatedClass.ibm);
    }
}
