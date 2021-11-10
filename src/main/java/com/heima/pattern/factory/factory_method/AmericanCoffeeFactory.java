package com.heima.pattern.factory.factory_method;

/**
 * 美式咖啡工厂对象，专门用来生产美式咖啡的
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
