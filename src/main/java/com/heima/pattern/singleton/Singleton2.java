package com.heima.pattern.singleton;

/**
 * 饿汉式的第二种实现方式：
 * 使用静态代码块的方式
 */
public class Singleton2 {

    //声明Singleton2类型的静态常量成员变量，但是没有初始化，在静态代码块中对其进行初始化
    private static final Singleton2 INSTANCE;

    //在静态代码块中对成员常量初始化
    static {
        INSTANCE = new Singleton2();
    }
    //私有化构造方法，避免外部使用new关键字创建实例
    private Singleton2(){}

    //定义公共方法，对外提供获取单例实例的接口
    public static Singleton2 getINSTANCE() {
        return INSTANCE;
    }
}
