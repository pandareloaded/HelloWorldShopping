package com.example.helloworldshopping.model;

public class Coupon {
    private String couponDescription;
    private String couponDiscountRate;

    public String getCouponDescription() {
        return couponDescription;
    }

    public void setCouponDescription(String couponDescription) {
        this.couponDescription = couponDescription;
    }

    public void setCouponDiscountRate(String couponDiscountRate) {
        this.couponDiscountRate = couponDiscountRate;
    }

    public String getCouponDiscountRate() {
        return couponDiscountRate;
    }
}
