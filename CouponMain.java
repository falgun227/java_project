public class CouponMain {
    public static void main(String[] args) {
        CouponModel model = new CouponModel();
        CouponView view = new CouponView();
        CouponController controller = new CouponController(model, view);

        // Start the coupon code generation process
        controller.generateCoupon();
    }
}
