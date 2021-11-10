package com.heima.pattern.singleton;

/**
 * 懒汉式方式4，静态内部类方式
 * 静态内部类单例模式中实例由内部类创建，由于JVM在加载外部内的过程中，是不会加载静态内部类的，只有内部类
 * 的属性或者方法被调用时，才会被加载，并初始化其静态属性。静态属性由于被static修饰，所以只会被实例化一次，
 * 并且严格保证实例化顺序
 *
 * 小结：
 * 静态内部类是一种优秀的单例模式，在没有加任何锁的情况下，保证了多线程下的安全，
 * 并且没有任何性能影响和空间的浪费
 */
public class Singleton5 {

    private static boolean flag = false;

    //私有化构造器
    /**
     * 在构造方法中增加判断，解决反射破坏单例的情况
     */
    private Singleton5(){
        synchronized(Singleton5.class){
            if(flag){
                //判断flag的值，如果是true，说明是第一次访问，如果不是，说明是第一次访问。
                throw new RuntimeException("不能创建两个对象");
            }
            //将flag的值设置为true
            flag = true;
        }
    }

    private static class SingletonHolder{
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    //对外提供静态方法获取该对象
    public static Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 定义此方法，当反序列化的时候，将该方法的返回值直接返回，解决
     * 了序列化和反序列化破坏单例的问题。
     * @return
     */
    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}
