package fooddelivery;

public class FoodMenu {

    // Array Data Structure
    private Food[] foods;

    // Constructor
    public FoodMenu() {

        foods = new Food[5];

        foods[0] = new Food(1, "Burger", 500);
        foods[1] = new Food(2, "Pizza", 1200);
        foods[2] = new Food(3, "Biryani", 350);
        foods[3] = new Food(4, "Sandwich", 250);
        foods[4] = new Food(5, "Pasta", 600);
    }

    // Display all food items
    public void displayMenu() {

        System.out.println("\n----- FOOD MENU -----");
        System.out.println("ID   Food Name   Price");

        for (int i = 0; i < foods.length; i++) {
            foods[i].displayFood();
        }
    }

    // Linear Search by ID
    public Food searchById(int id) {

        for (int i = 0; i < foods.length; i++) {

            if (foods[i].getFoodId() == id) {
                return foods[i];
            }
        }

        return null;
    }

    // Linear Search by Name
    public Food searchByName(String name) {

        for (int i = 0; i < foods.length; i++) {

            if (foods[i].getFoodName().equalsIgnoreCase(name)) {
                return foods[i];
            }
        }

        return null;
    }
}
