package com.heima.pattern.factory.factory_simple;

public class CoffeeStore {

    /**
     * 使用简单工厂方式来创建coffee对象，实现了coffee对象与CoffeeStore对象的解耦，
     * 如果需要增加咖啡种类，只需要在简单工厂类中增加就行了。
     * @param type
     * @return
     */
    public Coffee orderCoffee(String type){
        //使用工厂来生产咖啡
        SimpleCoffeeFactory coffeeFactory = new SimpleCoffeeFactory();
        Coffee coffee = coffeeFactory.createCoffee(type);
        //咖啡加料
        coffee.addMilk();
        coffee.addSugar();
        //返回coffee对象
        return coffee;
    }
}
