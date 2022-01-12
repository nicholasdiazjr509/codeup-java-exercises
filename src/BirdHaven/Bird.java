package BirdHaven;

public class Bird {
    //can if fly?
    private boolean canFly;

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
    //what kind of bird
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void makeNoise(){
        System.out.println(this.getName() + " goes");
    }
    public void move(){
        System.out.println("Flap flap");
    }


    //no argument constructor, instantiates the object
    public Bird() {

    }
    public Bird(String name) {
        this.name = name;
    }
    public Bird(String name, boolean canFly){
        this.name = name;
        this.canFly = canFly;
    }
}
