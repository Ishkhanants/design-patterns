package behavioral.strategy;

/**
 * @author Martin Mirzoyan
 */

public class CreditCard implements PaymentStrategy {
    private String fullName;
    private String numbers;
    private int month;
    private int year;
    private String cvv;

    public CreditCard(String fullName, String numbers, int month, int year, String cvv) {
        this.fullName = fullName;
        this.numbers = numbers;
        this.month = month;
        this.year = year;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment from Credit card");
        System.out.println("Amount: " + amount);
        System.out.println("Full Name: " + fullName);
        System.out.println("Card: ************" + numbers.substring(12));
    }
}
