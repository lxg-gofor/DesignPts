package com.heima.pattern.proxy.static_proxy;

/**
 * 火车站类，具有卖票功能，所以需要实现接口SellTickets
 */
public class TrainStation implements SellTickets{
    public void sell() {
        System.out.println("火车站卖票");
    }
}
