import core.Calculate;
import fruit.Apple;
import fruit.Fruit;
import fruit.Mango;
import fruit.Strawberry;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        /**
         * 1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
         * 现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
         * 请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         */
        HashMap<Fruit, Integer> fruitMap = new HashMap<>();
        // 苹果 8 元/斤
        Fruit apple = new Apple(8);
        // 数量 2 斤
        fruitMap.put(apple, 2);
        // 草莓 13 元/斤
        Fruit strawberry = new Strawberry(13);
        // 数量 3 斤
        fruitMap.put(strawberry, 3);
        // 计算
        Fruit fruit = Calculate.calculate(fruitMap);
        // 获取总价
        System.out.println(fruit.getTotalPrice());

        /**
         * 2、超市增加了一种水果芒果，其定价为 20 元/斤。
         * 现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
         * 请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         */
        HashMap<Fruit, Integer> fruitMap2 = new HashMap<>();
        Fruit apple2 = new Apple(8);
        fruitMap2.put(apple2, 2);
        Fruit strawberry2 = new Strawberry(13);
        fruitMap2.put(strawberry2, 3);
        // 芒果 20 元/斤
        Fruit mango = new Mango(20);
        // 数量 3 斤
        fruitMap2.put(mango, 3);

        Fruit fruit2 = Calculate.calculate(fruitMap2);
        System.out.println(fruit2.getTotalPrice());

        /**
         * 3、超市做促销活动，草莓限时打 8 折。
         * 现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
         * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         */
        HashMap<Fruit, Integer> fruitMap3 = new HashMap<>();
        Fruit apple3 = new Apple(8);
        fruitMap3.put(apple3, 2);
        Fruit strawberry3 = new Strawberry(13);
        // 限时打 8 折
        strawberry3.discount(8);

        fruitMap3.put(strawberry3, 3);
        Fruit mango3 = new Mango(20);
        fruitMap3.put(mango3, 3);
        Fruit fruit3 = Calculate.calculate(fruitMap3);
        System.out.println(fruit3.getTotalPrice());

        /**
         * 4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
         * 现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
         * 请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         */
        HashMap<Fruit, Integer> fruitMap4 = new HashMap<>();
        Fruit apple4 = new Apple(8);
        fruitMap4.put(apple4, 2);
        Fruit strawberry4 = new Strawberry(13);
        // 限时打 8 折
        strawberry4.discount(8);

        fruitMap4.put(strawberry4, 3);
        Fruit mango4 = new Mango(20);
        fruitMap4.put(mango4, 3);
        Fruit fruit4 = Calculate.calculate(fruitMap4);
        // 优惠券
        Calculate.useCoupon(fruit4);
        System.out.println(fruit4.getTotalPrice());


    }
}