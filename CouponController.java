public class CouponController {

    private CouponModel model;
    private CouponView view;

    public CouponController(CouponModel model, CouponView view) {
        this.model = model;
        this.view = view;
    }

    // Handle the logic for generating and displaying coupon codes
    public void generateCoupon() {
        boolean generateAnother = true;

        // Continuously generate coupon codes until the user decides to stop
        while (generateAnother) {
            String couponCode = model.generateCouponCode();
            view.displayCouponCode(couponCode);

            // Ask the user if they want to generate another coupon code
            generateAnother = view.askToGenerateAnother();
        }
    }
}
