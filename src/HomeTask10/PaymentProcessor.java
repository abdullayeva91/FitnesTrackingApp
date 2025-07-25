package HomeTask10;

public class PaymentProcessor {
    public double processPayment(double amount){
        System.out.println("Payment Amount"+amount);
        return amount;
    }
    public double processPayment(double amount, double percentage) {
        if (percentage < 0) {
            System.out.println("Percentage cannot be negative");
            return amount;
        }
            return amount + (amount * percentage / 100);

        }
    }

