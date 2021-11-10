package com.heima.pattern.factory.factory_static;

/**
 * 静态工厂方法模式
 */
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type){
        //声明Coffee类型的变量，根据不同的类型创建不同的coffee子类对象
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("对不起，您点的咖啡没有");
        }

        return coffee;
    }
}
