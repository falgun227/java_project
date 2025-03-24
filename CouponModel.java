import java.util.Random;

public class CouponModel {

    private static final String CHAR_POOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";  // Characters used for coupon code
    private static final int CODE_LENGTH = 10;  // Length of the generated coupon code

    // Generate a random coupon code
    public String generateCouponCode() {
        Random random = new Random();
        StringBuilder couponCode = new StringBuilder();

        // Generate the coupon code using random characters from the CHAR_POOL
        for (int i = 0; i < CODE_LENGTH; i++) {
            int index = random.nextInt(CHAR_POOL.length());
            couponCode.append(CHAR_POOL.charAt(index));
        }

        return couponCode.toString();
    }
}
