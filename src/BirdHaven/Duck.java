package BirdHaven;

public class Duck extends Bird{
    //this overrides make noise methods and more
    private String habitat;
    private int numOfFeathers;

    public Duck(){}
    public Duck(String name) {
        super(name);
    }

    public Duck(String name, boolean canFly){
        super(name, canFly);
    }
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getNumOfFeathers() {
        return numOfFeathers;
    }

    public void setNumOfFeathers(int numOfFeathers) {
        this.numOfFeathers = numOfFeathers;
    }


    //super constructor
    public Duck (String name, boolean canFly, String habitat, int numOfFeathers){
        super(name, canFly);
        this.habitat = habitat;
        this.numOfFeathers = numOfFeathers;
    }



    public void makeNoise(){
        //System.out.println("Quack quack");
            //super keyword reference super class

        super.makeNoise();
        System.out.print(" quack quack");
    }

}
