package com.heima.pattern.singleton;

/**
 * 懒汉式 懒加载 lazy loading
 */
public class Singleton3 {
    //声明Singleton类型的变量
    private static Singleton3 instance; //只是声明，并没有赋值

    //私有化构造方法
    private Singleton3(){}

    /**
     * 第二种方式：
     * 使用synchronized同步关键字来解决线程安全问题
     * synchronized加载getInstace()函数上确实保证了线程的安全。
     * 但是，如果要经常的调用getInstance()方法，不管有没有初始化实例，都会唤醒和阻塞线程。
     * @return
     */
    public static synchronized Singleton3 getInstance2() {
        return instance;
    }
    /**
     * 第一种方式：
     *  对外提供获取单例的接口方法,下面这种方法存在线程安全问题。
     */
    public static Singleton3 getInstance() {
        if(instance==null){
            instance = new Singleton3();
        }
        return instance;
    }
}
