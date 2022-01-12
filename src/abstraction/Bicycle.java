package abstraction;

public class Bicycle extends Vehicle{
    public byte wheels = 2;


    //implement method from go in vehicle
    public void go(){// void method dont need a return
        System.out.println("Pumping my legs to get up the hill for school!");
    }
}
