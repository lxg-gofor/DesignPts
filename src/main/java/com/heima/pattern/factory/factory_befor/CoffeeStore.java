package com.heima.pattern.factory.factory_befor;

/**
 * 这种模式如果增加了很多种咖啡种类的话，就需要对代码进行改造，违背了软件设计的开闭原则，这就引出了工厂模式。
 * 使用工厂来生产对象，我们就只和工厂打交道，彻底和对象解耦，如果更换对象，直接在工厂里面更换该对象即可，达到了
 * 与对象解耦的目的。所以说，工厂模式最大的优点就是：解耦。
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type){
        //声明Coffee类型的变量，根据不同的类型创建不同的coffee子类对象
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("对不起，您点的咖啡没有");
        }
        //加配料
        coffee.addSugar();
        coffee.addMilk();

        return coffee;
    }
}
