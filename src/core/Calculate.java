package core;

import enums.Coupon;
import fruit.Fruit;

import java.util.HashMap;

public class Calculate {

    public static Fruit calculate(HashMap<Fruit, Integer> fruitMap) {
        Fruit fruit = new Fruit(){};
        fruitMap.forEach(
                (f, count) -> {
                    fruit.setTotalPrice(fruit.getTotalPrice() + f.getPrice()*count);
                }
        );
        return fruit;
    }

    public static void useCoupon(Fruit fruit) {
        if (fruit.getTotalPrice() > Coupon.GREATER_100_REDUCE_10.greaterPrice) {
            fruit.setTotalPrice(fruit.getTotalPrice() - Coupon.GREATER_100_REDUCE_10.couponPrice);
        }
    }
}
