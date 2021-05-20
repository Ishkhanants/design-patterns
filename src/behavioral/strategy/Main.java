package behavioral.strategy;

import java.util.Scanner;

/**
 * @author Martin Mirzoyan
 */

public class Main {
    public static final Item[] items = {
            new Item("Iphone", 1000),
            new Item("Samsung", 900),
            new Item("Xiaomi", 200),
            new Item("Mac", 2000)
    };

    public static void main(String[] args) {
        System.out.println("Welcome to online shop");
        System.out.println("Select Item number you want to buy");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + ". " + items[i]);
        }

        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println("Select payment method");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        int method = s.nextInt();
        switch (method) {
            case 1:
                payWithCreditCard(items[number - 1].getPrice());
                break;
            case 2:
                payWithPayPal(items[number - 1].getPrice());
                break;
        }
    }

    private static void payWithPayPal(int price) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username");
        String username = s.next();
        System.out.println("Enter password");
        String password = s.next();
        PaymentService.pay(new Paypal(username, password), price);
    }

    private static void payWithCreditCard(int price) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter full name");
        String fullName = s.nextLine();
        System.out.println("Enter card numbers");
        String numbers = s.next();

        System.out.println("Enter cvv");
        String cvv = s.next();

        System.out.println("Enter month");
        int month = s.nextInt();
        System.out.println("Enter year");
        int year = s.nextInt();

        PaymentService.pay(new CreditCard(fullName, numbers, month, year, cvv), price);
    }
}