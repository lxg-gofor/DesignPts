package com.heima.pattern.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工厂，用来创建代理对象
 */
public class ProxyFactory {
    private TrainStation station = new TrainStation();

    /**
     * 代理工厂，动态获取代理对象
     * @return
     */
    public SellTickets getProxyObject(){

        /**
         * 调用Proxy代理类中的newProxyInstance方法来动态获取代理对象
         * newProxyInstance()方法参数说明：
         *  ClassLoader loader ： 类加载器，用于加载代理类，使用真实对象的类加载器即可
         *  Class<?>[] interfaces ： 真实对象所实现的接口，代理模式真实对象和代理对象实现相同的接口
         *  InvocationHandler h ： 代理对象的调用处理程序
         *
         */
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(), //类加载器，用来加载代理类
                station.getClass().getInterfaces(),//真实对象实现的接口，代理对象跟真实对象实现同样的接口
                new InvocationHandler() {//匿名内部类中定义代理对象要处理的业务逻辑
                    /**
                     *
                     * @param proxy 代理对象
                     * @param method 对应于在代理对象上调用的接口方法的 Method 实例
                     * @param args 代理对象调用接口方法时传递的实际参数
                     * @return
                     * @throws Throwable
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理点收取一些服务费用(JDK动态代理方式)");
                        //执行真实对象
                        Object result = method.invoke(station, args);
                        return result;
                    }
                });
        return sellTickets;
    }
}
