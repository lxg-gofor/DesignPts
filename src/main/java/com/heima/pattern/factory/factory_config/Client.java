package com.heima.pattern.factory.factory_config;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        Coffee american = CoffeeFactory.createCoffee("american");
        System.out.println(american.getName());
    }
}
