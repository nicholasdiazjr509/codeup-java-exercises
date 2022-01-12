package abstraction;

public class GarageTester {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        bike.go();
        System.out.println(bike.wheels);
        System.out.println(bike.isCorporeal);


        //Vehicle car = new Car(); No parameter for "wheels"
        Car car = new Car();
        //Car car = new Vehicle(); cant instantiate abstract class
        car.go();
        System.out.println(car.wheels);

        PogoStick pogo = new PogoStick();
        pogo.go();

        MagicBroom broom = new MagicBroom();
        broom.go();
    }
}
