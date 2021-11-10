package com.heima.pattern.factory.factory_simple;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee latte = store.orderCoffee("latte");
        System.out.println(latte.getName());
    }
}
