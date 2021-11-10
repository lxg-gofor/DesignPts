package com.heima.pattern.adapter.object_adapter;

//SD卡接口
public interface SDCard {
    //读取SD卡方法
    String readSD();
    //写入SD卡功能
    void writeSD(String msg);
}
