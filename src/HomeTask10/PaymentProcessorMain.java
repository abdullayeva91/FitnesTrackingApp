package HomeTask10;

import java.util.Scanner;

public class PaymentProcessorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = 0;
        double percentage = 0;
        boolean amountPercentage = true;
        System.out.println("----Welcome to payment System----");
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        System.out.println("Select Payment Amount (AZN)");
        amount = scanner.nextDouble();
        scanner.nextLine();
        if (amount <= 0) {
            System.out.println("The amount must be greater than 0.");
            return;
        }
        System.out.println("Do you want to add a percentage to the payment (yes/no) ");
        String addPercentage = scanner.nextLine();
        if (addPercentage.equals("yes")) {
            amountPercentage = true;
            System.out.println("Enter percentage");
            percentage = scanner.nextDouble();
            scanner.nextLine();
            if (percentage < 0) {
                System.out.println("Percentage cannot be negative ");
                return;
            }
            amount = amount + (amount + percentage / 100);
            System.out.println("Total amount with percentage" + amount + "AZN");
        }
        String paymentMethod = null;

            System.out.println("Select payment method ");
            System.out.println("1. Card payment");
            System.out.println("2. Cash payment");
            System.out.println("3. Online payment");
            int method= scanner.nextInt();


            switch (method) {
                case 1:
                    System.out.println("Payment with Card");
                    CardPayment cardPayment=new CardPayment();
                    System.out.println("Card payment completed");

                    break;
                case 2:
                    System.out.println("Payment with Cash");
                    CashPayment cashPayment=new CashPayment();
                    System.out.println("Cash payment completed");
                    break;
                case 3:
                    System.out.println("Payment with Online");
                    OnlinePayment onlinePayment=new OnlinePayment();
                    System.out.println("Online payment completed");
                    break;
                default:
                    System.out.println("Please select the correct payment method");
                    break;
            }

        double totalAmount =amount+percentage;
        System.out.println("Total amount"+totalAmount+"AZN");








    }

}








