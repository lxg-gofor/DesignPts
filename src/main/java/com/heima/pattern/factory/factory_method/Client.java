package com.heima.pattern.factory.factory_method;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        //创建咖啡店对象
        CoffeeStore store = new CoffeeStore();
        //创建对象
        CoffeeFactory factory = new AmericanCoffeeFactory();
        store.setFactory(factory);
        //点咖啡
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());

        CoffeeFactory factory1 = new LatteCoffeeFactory();
        store.setFactory(factory1);
        Coffee coffee1 = store.orderCoffee();
        System.out.println(coffee1.getName());
    }
}
