package com.heima.pattern.proxy.static_proxy;

/**
 * 代售点，将火车站卖票的功能拿到代售点来，即代售点可以卖出火车票，具有
 * 卖票功能，所以需要实现SellTickets接口，同时是代理火车站卖票，即车票
 * 与火车站有关联，表现为具有属性 “火车站”
 */
public class ProxyPoint implements SellTickets{
    private TrainStation station;

    public void sell() {
        System.out.println("代理点代售火车票，收取一定的代理费");
        station.sell();
    }
}
