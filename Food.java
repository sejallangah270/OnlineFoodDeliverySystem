package fooddelivery;

public class Food {

    // Private variables (Encapsulation)
    private int foodId;
    private String foodName;
    private double price;

    // Constructor
    public Food(int foodId, String foodName, double price) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
    }

    // Getter methods
    public int getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getPrice() {
        return price;
    }

    // Display food information
    public void displayFood() {
        System.out.println(foodId + "   " + foodName + "   Rs. " + price);
    }
}