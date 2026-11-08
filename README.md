
# ONLINE FOOD DELIVERY SYSTEM

 **Student Name:** Sejal
**Teacher:** Ma'am Chandni Talpur

---

## Project Description

Online Food Delivery System is a simple Java console-based project. It allows customers to view food items, search food, place orders, and calculate the total bill.

---

## Why This Project Was Made

The purpose of this project is to apply Object-Oriented Programming (OOP) concepts and Data Structures in a real-life example. Online food ordering is something we all use, so it is easy to understand how classes, objects and arrays work together in a practical system.

## Benefits of This Project

- Customers can see all available food items with prices in one place.
- Food can be found quickly by ID or by name.
- The total bill is calculated automatically, so there are no calculation mistakes.
- It saves time compared to taking orders manually.
- It helps in learning Java, OOP and Data Structures practically.

---

## Features

- Display Food Menu
- Search Food by ID
- Search Food by Name
- Add Food to Order
- Calculate Total Bill
- Display Order Details

---

## Technology Used

- Programming Language: Java
- Tool: Any Java IDE (NetBeans, Eclipse, IntelliJ, VS Code) or Command Prompt
- Type of Project: Console-based application

---

## Java and Data Structure Concepts Used

1. Classes and Objects: Food, FoodMenu, Order and Main classes are used and their objects are created.
2. Constructors: Used to initialize objects.
3. Encapsulation: Variables are kept private to protect data.
4. Private Variables: Data is hidden inside the class.
5. Getter Methods: Used to access the values of private variables.
6. Methods: Used to perform different operations.
7. Linear Search: Used to search food by ID or name.
8. Array Data Structure: Used to store food items and order items.
9. Loops and Conditions: do-while loop shows the menu again and again, and switch handles the user's choice.

---

## Project Files

### Food.java
Stores food information (ID, name, price).

### FoodMenu.java
Stores the food list, displays the menu and searches food.

### Order.java
Stores ordered items and calculates the bill.

### Main.java
Main file that runs the program and shows the main menu.

### README.md
Project information and instructions.

---

## Sample Output

```
ONLINE FOOD DELIVERY SYSTEM
Enter Customer Name: Ayesha

----- MAIN MENU -----
1. Display Food Menu
2. Search Food by ID
3. Search Food by Name
4. Add Food to Order
5. View Order and Bill
6. Exit

Enter your choice: 1
----- FOOD MENU -----
ID  Food Name  Price
1   Burger     Rs. 500.0
2   Pizza      Rs. 1200.0
3   Biryani    Rs. 350.0
4   Sandwich   Rs. 250.0
5   Pasta      Rs. 600.0

Enter your choice: 4
Enter Food ID: 1
Enter Quantity: 2
Food added successfully!

Enter your choice: 5
----- ORDER DETAILS -----
Order ID: 101
Customer Name: Ayesha
Burger x 2 = Rs. 1000.0
Total Bill: Rs. 1000.0
Order placed successfully!
```
