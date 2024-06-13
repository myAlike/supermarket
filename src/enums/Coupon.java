package enums;

public enum Coupon {
    /**
     * 购物满 100 减 10 块
     */
    GREATER_100_REDUCE_10(100 , 10)
    ;

    public final int greaterPrice;
    public final int couponPrice;

    Coupon(int greaterPrice, int couponPrice) {
        this.greaterPrice = greaterPrice;
        this.couponPrice = couponPrice;
    }
}
