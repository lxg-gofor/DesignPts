package com.heima.pattern.factory.factory_simple;

/**
 * 简单咖啡工厂类，用来生产咖啡
 *
 * 简单工厂处理创建对象的细节，有了此简单工厂对象，在CoffeeStore对象中如果需要Coffee对象，只需要在工厂类
 * 中获取就行。这样解除了Coffee类和CoffeeStore类的耦合，但是这样也产生了新的耦合，即工厂对象和CoffeeStore
 * 的耦合以及工厂对象跟Coffee类的耦合。
 *
 * 有了工厂对象，如果后期增加了更多的咖啡，则势必对工厂对象进行改造，违反了开闭原则。
 *
 * 简单工厂：
 * 优点：
 * 封装了创建对象的细节，可以通过参数直接获取对象，把对象的创建和业务逻辑层分开，这样避免以后修改客户端代码，
 * 如果要实现新的产品，直接修改工厂类就行了，而不需要在业务代码中修改，这样就降低了客户代码修改的可能性，更加
 * 容易扩展。
 *
 * 缺点：
 * 增加新的产品的时候，还是需要修改工厂类，违背了设计原则的开闭原则。
 *
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type){
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
