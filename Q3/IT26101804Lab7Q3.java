import java.util.Scanner;

public class IT26101804Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);

            System.out.print("Enter total bill amount: ");
            double totalBill = input.nextDouble();

            System.out.print(
                "Enter mode of payment (C for cash, O for other): "
            );
            String paymentMode = input.next();

            if (paymentMode.equalsIgnoreCase("C")) {
                double discount = totalBill * 0.05;
                double amountToPay = totalBill - discount;

                System.out.printf("Discount is : %.2f%n", discount);
                System.out.printf(
                    "Amount to be paid: %.2f%n", amountToPay
                );
            } else if (paymentMode.equalsIgnoreCase("O")) {
                System.out.println("No discount applicable");
                System.out.printf(
                    "Amount to be paid: %.2f%n", totalBill
                );
            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }

        input.close();
    }
}
