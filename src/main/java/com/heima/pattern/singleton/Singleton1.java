package com.heima.pattern.singleton;

/**
 * 饿汉式：预加载
 * 静态成员变量
 */
public class Singleton1 {
    //定义静态成员变量获取本类的实例
    private static final Singleton1 INSTANCE = new Singleton1();

    //私有构造方法，避免通过new关键字来实例化对象，保证只存在一个实例
    private Singleton1(){}

    //提供一个公共的访问类，让外界获取该对象
    public static Singleton1 getINSTANCE() {
        return INSTANCE;
    }
}
