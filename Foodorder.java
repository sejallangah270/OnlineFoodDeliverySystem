package fooddelivery;

public class Order {

    // Private variables (Encapsulation)
    private int orderId;
    private String customerName;

    // Arrays to store ordered food
    private Food[] orderedFoods;
    private int[] quantities;

    private int count;

    // Constructor
    public Order(int orderId, String customerName) {

        this.orderId = orderId;
        this.customerName = customerName;

        orderedFoods = new Food[20];
        quantities = new int[20];

        count = 0;
    }

    // Method to add food
    public void addFood(Food food, int quantity) {

        if (count < orderedFoods.length && food != null && quantity > 0) {

            orderedFoods[count] = food;
            quantities[count] = quantity;

            count++;

            System.out.println("Food added successfully!");
        }
        else {
            System.out.println("Cannot add food to order.");
        }
    }

    // Calculate total bill
    public double calculateTotal() {

        double total = 0;

        for (int i = 0; i < count; i++) {

            total = total +
                    (orderedFoods[i].getPrice() * quantities[i]);
        }

        return total;
    }

    // Display order details
    public void displayOrder() {

        System.out.println("\n----- ORDER DETAILS -----");

        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);

        for (int i = 0; i < count; i++) {

            System.out.println(
                orderedFoods[i].getFoodName()
                + " x " + quantities[i]
                + " = Rs. "
                + (orderedFoods[i].getPrice() * quantities[i])
            );
        }

        System.out.println("-------------------------");
        System.out.println("Total Bill: Rs. " + calculateTotal());
        System.out.println("Order placed successfully!");
    }
}
