package interfaces;

public class TJMaxxHomeGoodsTester {
    public static void main(String[] args){
      Customer janet = new Customer(68.75);
      //cant use Person, no access to wallet
      janet.activity();
       // Customer janet = new Customer(68.75);
        System.out.println(janet.getWallet());
        //instantiate
        Employee marcus = new Employee();
        marcus.activity();
    }
}
