package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Represents the Java Cafe program.
 */
public class JavaCafe {
    private Scanner scanner = new Scanner(System.in);
    public List<String> order = new ArrayList<String>();
    double totalCost = 0;
    /**
     * Runs the Java Cafe program. (Main menu)
     */
    public void run() {
        while(true) {
            System.out.println("Welcome to Java Cafe!");
            System.out.println("1. View Food Menu");
            System.out.println("2. View Drink Menu");
            System.out.println("3. View Dessert Menu");
            System.out.println("4. View Current Order");
            //System.out.println("6. Remove item from your order");
            System.out.println("5. Exit");

            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                viewFoodMenu();
            } else if (choice.equals("2")) {
                viewDrinkMenu();
            } else if (choice.equals("3")) {
                viewDessertMenu();

            } else if (choice.equals("4")) {
                viewCurrentOrder();
            }  else if (choice.equals("5")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Displays the food menu and allows the user to add items to the order.
     */
    public void viewFoodMenu() {
        while(true) {
            System.out.println("Food Menu");
            System.out.println("1. Sandwich - $3.99");
            double sandwichPrice = 3.99;
            System.out.println("2. Salad - $3.50 ");
            double  saladPrice = 3.50;
            System.out.println("3. Soup $4.99 ");
            double soupPrice = 4.99;
            System.out.println("4. Return to Main Menu");

            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                order.add("Sandwich");
                totalCost+= sandwichPrice;
            } else if (choice.equals("2")) {
                order.add("Salad");
                totalCost+= saladPrice;
            } else if (choice.equals("3")) {
                order.add("Soup");
                totalCost+= soupPrice;
            } else if (choice.equals("4")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Displays the drink menu and allows the user to add items to the order.
     */
    public void viewDrinkMenu() {
        while(true) {
            System.out.println("Drink Menu");
            System.out.println("1. Coffee $2.99");
            double coffeePrice = 2.99;
            System.out.println("2. Tea $2.50 ");
            double teaPrice = 2.50;
            System.out.println("3. Juice $4.99");
            double juicePrice = 4.99;
            System.out.println("4. Return to Main Menu");

            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                order.add("Coffee");
                totalCost += coffeePrice;
            } else if (choice.equals("2")) {
                order.add("Tea");
                totalCost += teaPrice;
            } else if (choice.equals("3")) {
                order.add("Juice");
                totalCost+= juicePrice;
            } else if (choice.equals("4")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    /**
     * Displays the dessert menu and allows the user to add items to the order.
     */
    public void viewDessertMenu(){
        while(true){
            System.out.println("Dessert Menu");
            System.out.println("1. Apple Pie $3.69");
            double applePiePrice = 3.69;
            System.out.println("2. Brownies $2.19");
            double browniePrice =2.19;
            System.out.println("3. Donuts $4.59");
            double donutsPrice = 4.59;
            System.out.println("4. Return to main menu");

            String choice = scanner.nextLine();
            if(choice.equals("1")){
                order.add("Apple Pie");
                totalCost+= applePiePrice;
            } else if (choice.equals("2")) {
                order.add("Brownies");
                totalCost+= browniePrice;
            } else if (choice.equals("3")) {
                order.add("Donuts");
                totalCost+= donutsPrice;
            } else if (choice.equals("4")) {
                break;

            }else{
                System.out.println("Invalid choice . Please try again");
            }

        }
    }

    /**
     * Removes item from order - TODO
     */
    /**public void removeItem(){
        System.out.println("");
    }
**/
    /**
     * Displays the current order.
     */
    public void viewCurrentOrder() {
        System.out.println("Current Order:");
        for (String item : order) {
            System.out.println(item);
        }
        System.out.println("Your total is = "+totalCost);
    }
}
