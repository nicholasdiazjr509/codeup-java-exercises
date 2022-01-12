import java.util.*;
import util.Input;

public class GroceryListApp {
    public static Input input = new Input();
    private final String category;
    private final String items;
    private final int itemCost;

    public GroceryListApp(String items, String category, int itemCost){
      this.items = items;
        this.category = category;
        this.itemCost = itemCost;
}
    public String getCategory() {
        return this.category;
    }

    public String getItems() {
        return this.items;
    }

    public int getItemCost() {
        return this.itemCost;
    }
    private static void displayCategories(){
        System.out.println("Please, select a category: ");
        System.out.println("1-- Dairy");
        System.out.println("2-- Produce");
        System.out.println("3-- Meat");
        System.out.println("4-- Deli");
        System.out.println("5-- Baked Goods");
        System.out.println("6-- Other");
    }
    private static String groceryCat(){
        int category = input.getInt();

        switch (category){
            case 1:
                return "Dairy";
            case 2:
                return "Produce";
            case 3:
                return "Meat";
            case 4:
                return "Deli";
            case 5:
                return "Baked Goods";
            case 6:
                return "Other";
                default:
                    System.out.println("Invalid input. Try again please.");
                        return groceryCat();
        }
    }
    public static void main(String[] args) {
        ArrayList<GroceryListApp> newList = new ArrayList<>();
        System.out.println("Hello and Welcome!!");
        boolean createList = input.yesNo("Would you like to create a grocery list? ");
    if(createList){
        Scanner sc = new Scanner(System.in);
        displayCategories();
        String category = groceryCat();
        System.out.println("How many?");
        int quantity = input.getInt();
        System.out.println("Name of item?");
        String groceryItem = sc.nextLine();
        newList.add(new GroceryListApp(groceryItem, category, quantity));
        for(GroceryListApp items : newList){
            System.out.printf("%s %s %s", items.getItemCost(), items.getCategory(), items.getItems());
            }
    }
    }
}
