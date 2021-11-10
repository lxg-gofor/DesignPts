package com.heima.pattern.proxy.jdk_proxy;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        //声明获取代理对象的工厂
        ProxyFactory factory = new ProxyFactory();
        //通过工厂获取代理对象
        SellTickets proxyObject = factory.getProxyObject();
        //代理对象执行业务逻辑
        proxyObject.sell();
    }
}
