package interfaces;

public class Customer extends Person {
    private double wallet;

    public Customer(double wallet) {
        this.wallet = wallet;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public void activity(){
        System.out.println("Just browsin' around. Don't mind me.");
    }
}
