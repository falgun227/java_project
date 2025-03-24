import java.util.Scanner;

public class CouponView {

    private Scanner scanner = new Scanner(System.in);

    // Display a message to the user
    public void displayMessage(String message) {
        System.out.println(message);
    }

    // Ask the user if they want to generate a new coupon code
    public boolean askToGenerateAnother() {
        System.out.print("Do you want to generate another coupon code? (y/n): ");
        String response = scanner.nextLine();
        return response.equalsIgnoreCase("y");
    }

    // Display the generated coupon code
    public void displayCouponCode(String couponCode) {
        System.out.println("Your generated coupon code is: " + couponCode);
    }
}