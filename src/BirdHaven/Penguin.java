package BirdHaven;
//overloading have to change parameters
//
public class Penguin extends Bird{

    public Penguin(String name){
        super(name);
    }
    //override move method
    public void makeNoise(){
        System.out.println(this.getName() + " goes honk honk");
    }
    //override move method
    public void move(){
        System.out.println(this.getName() + " goes waddle waddle");

    }

}
