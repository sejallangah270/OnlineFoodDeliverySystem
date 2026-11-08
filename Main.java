package fooddelivery;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Creating FoodMenu object
        FoodMenu menu = new FoodMenu();

        System.out.println("================================");
        System.out.println("   ONLINE FOOD DELIVERY SYSTEM");
        System.out.println("================================");

        System.out.print("Enter Customer Name: ");
        String customerName = input.nextLine();

        // Creating Order object
        Order order = new Order(101, customerName);

        int choice;

        do {

            System.out.println("\n----- MAIN MENU -----");
            System.out.println("1. Display Food Menu");
            System.out.println("2. Search Food by ID");
            System.out.println("3. Search Food by Name");
            System.out.println("4. Add Food to Order");
            System.out.println("5. View Order and Bill");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    menu.displayMenu();
                    break;

                case 2:

                    System.out.print("Enter Food ID: ");
                    int id = input.nextInt();

                    Food foundById = menu.searchById(id);

                    if (foundById != null) {
                        System.out.println("Food Found:");
                        foundById.displayFood();
                    }
                    else {
                        System.out.println("Food not found!");
                    }

                    break;

                case 3:

                    System.out.print("Enter Food Name: ");
                    String name = input.nextLine();

                    Food foundByName = menu.searchByName(name);

                    if (foundByName != null) {
                        System.out.println("Food Found:");
                        foundByName.displayFood();
                    }
                    else {
                        System.out.println("Food not found!");
                    }

                    break;

                case 4:

                    menu.displayMenu();

                    System.out.print("Enter Food ID: ");
                    int foodId = input.nextInt();

                    Food selectedFood = menu.searchById(foodId);

                    if (selectedFood != null) {

                        System.out.print("Enter Quantity: ");
                        int quantity = input.nextInt();

                        order.addFood(selectedFood, quantity);
                    }
                    else {
                        System.out.println("Invalid Food ID!");
                    }

                    break;

                case 5:

                    order.displayOrder();
                    break;

                case 6:

                    System.out.println("Thank you for using our system!");
                    break;

                default:

                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        input.close();
    }
}
