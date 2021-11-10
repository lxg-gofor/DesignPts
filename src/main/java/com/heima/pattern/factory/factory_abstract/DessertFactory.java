package com.heima.pattern.factory.factory_abstract;

public interface DessertFactory {
    //生产咖啡的功能
    Coffee createCoffee();

    //生产甜品的功能
    Dessert createDessert();
}
