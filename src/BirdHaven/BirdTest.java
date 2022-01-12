package BirdHaven;

public class BirdTest {
    public static void main(String[] args) {
//           Bird cardinal = new Bird();
//            cardinal.setName("Cardinal");
//            cardinal.setCanFly(true);
//            cardinal.makeNoise();
//            cardinal.move();
//
//         //   Bird finch = new Bird();//instatiating a new bird is redundant
//        //inherits its qualities from its class
//         Duck mallard = new Duck();
//         mallard.setName("Mallard");
//         mallard.setCanFly(true);
//         mallard.makeNoise();
//         mallard.move();
//
//
//         //instatiate
//        Finch lesserGoldFinch = new Finch();
//        lesserGoldFinch.makeNoise();
//
//        Penguin mombo = new Penguin();
//        mombo.setName("Emperor penguin");
//        mombo.makeNoise();
//        mombo.move();

        Duck marvelDuck = new Duck("Marvel Duck", true);
        System.out.println(marvelDuck.getName());

        System.out.println(marvelDuck.getHabitat());
        System.out.println(marvelDuck.getNumOfFeathers());
        marvelDuck.makeNoise();
    }
}
