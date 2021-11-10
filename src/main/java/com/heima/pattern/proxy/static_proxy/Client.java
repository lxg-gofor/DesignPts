package com.heima.pattern.proxy.static_proxy;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
