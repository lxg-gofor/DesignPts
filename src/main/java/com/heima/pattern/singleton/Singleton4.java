package com.heima.pattern.singleton;

import java.io.Serializable;

/**
 * 懒汉式的双重检查锁方式
 *
 */
public class Singleton4 implements Serializable {

    //使用volatile 关键字可以保证可见性和有序性
    private static volatile Singleton4 instance;

    private Singleton4(){}

    public static Singleton4 getInstance() {
        /**
         * 使用双重检查解决了单例、性能、线程安全问题，但是在多线程环境中由于JVM在实例化对象的时候会进行
         * 优化和指令的重排序操作，可能会导致空指针异常问题，这时候需要使用volatile关键字，可以保证可见性
         * 和有序性
         */
        //第一次判断，如果instance的值不为null,不需要抢占锁，再返回对象
        if(instance==null){
            synchronized (Singleton4.class){
                //第二次判断
                if(instance==null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
