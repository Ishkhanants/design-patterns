package behavioral.strategy;

/**
 * @author Martin Mirzoyan
 */

public class Paypal implements PaymentStrategy {
    private String username;
    private String password;

    public Paypal(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment from Paypal");
        System.out.println("Amount: " + amount);
        System.out.println("User: " + username);
    }
}
