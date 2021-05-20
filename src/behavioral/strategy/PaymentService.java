package behavioral.strategy;

/**
 * @author Martin Mirzoyan
 */

public class PaymentService {
    public static void pay(PaymentStrategy payment, int amount) {
        payment.pay(amount);
    }
}
