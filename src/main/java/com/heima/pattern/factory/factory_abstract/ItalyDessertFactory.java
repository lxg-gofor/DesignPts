package com.heima.pattern.factory.factory_abstract;

/**
 * 意大利风味的甜品工厂，能生产拿铁和提拉米苏
 */
public class ItalyDessertFactory implements DessertFactory{
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    public Dessert createDessert() {
        return new Tiramisu();
    }
}
