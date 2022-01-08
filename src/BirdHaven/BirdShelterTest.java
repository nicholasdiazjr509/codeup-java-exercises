package BirdHaven;


public class BirdShelterTest {
    public static void main(String[] args) {


        Bird[] birds = new Bird[3];
        birds[0] = new Duck("Mallard");
        birds[1] = new Finch("Lesser Gold Finch");
        birds[2] = new Penguin("Emperor Penguin");

//for (Bird birdie : birds){
//
//    }
        BirdShelter healingWings = new BirdShelter();

        healingWings.shelterSounds(birds);
        BirdLover audubonBob = new BirdLover();

        audubonBob.takeBirdToVet(birds[1]);
        Duck rubberDuck = new Duck();
        rubberDuck.setName("Codey");
        System.out.println(rubberDuck.getName());

    }
}