package ca.hccis.entity;

import java.util.Scanner;

public class user {

    String userName = "";
    String characterName = "";
    String userEmail = "";
    String userAddress = "";
    String cardNumber = "";
    String cardExpInfo = "";
    public double goldPurchaseAmount = 0;
    int orderID = 0;

    public user() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter your userName");
        userName = scanner.nextLine();

        System.out.println("Please Enter your character name");
        characterName = scanner.nextLine();

        System.out.println("userEmail");
        userEmail = scanner.nextLine();

        System.out.println("Enter your address");
        userAddress = scanner.nextLine();

        System.out.println("Enter your card number");
        cardNumber = scanner.nextLine();

        System.out.println("Confirm the expiry info on your card");
        cardExpInfo = scanner.nextLine();

        System.out.println("How much gold are you looking to purchase");
        goldPurchaseAmount = scanner.nextDouble();

        orderID++;
        System.out.println("Your Order ID is: " + orderID);
    }


    public void goldPurchaseAmount() {
    }
}
