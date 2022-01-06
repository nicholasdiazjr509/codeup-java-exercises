package WarmUps;

public class Penguin {
    private String name;
    private int weight;
    private String species;
    private char sex;//referred to getters and setters


    //public static methods
    //static vs instance method. a feature of the class itself.
    public static boolean canFly(){

        return false;
    }
    public static boolean areEvil(){
        return true;
    }

    public Penguin() {

    }
//constructor method of all 4 fields

    public Penguin(String name, int weight, String species, char sex) {
        this.name = name;
        this.weight = weight;
        this.species = species;
        this.sex = sex;
    }

    public String getName()
    {
        return name;
    }
    public int getWeight() {
            return weight;
    }

    public String getSpecies(){
        return species;
    }
    public char getSex(){
        return sex;
     }

    public void setName(String name) {
        this.name = name;//this keyword this instance of the class
    }
    public void setWeight(int weight){
        this.weight= weight;
    }
    public void setSpecies(String species) {

        this.species = species;
    }
    public void setSex(char sex) {
           this.sex = sex;
    }



}

//Warmup
//Create a class named "WarmUps.Penguin"
//Give your class the following private fields
//Name
//Weight
//Species
//Sex
//Give your class the following public methods
//getName
//getWeight
//getSpecies
//getSex
//setName
//setWeight
//setSpecies
//setSex
//Give your class a constructor method
//Give your class the following public static methods
//canFly (returns false)
//areEvil (returns true)