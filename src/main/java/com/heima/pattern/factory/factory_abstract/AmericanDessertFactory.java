package com.heima.pattern.factory.factory_abstract;

/**
 * 没事风味的甜品工厂，可以生产美式咖啡和抹茶慕斯
 */
public class AmericanDessertFactory implements DessertFactory{
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
