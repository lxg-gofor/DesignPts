package com.heima.pattern.adapter.class_adapter;

//SD卡实现类
public class SDCardImpl implements SDCard{
    public String readSD() {
        String msg = "sd card read a msg :hello word SD";
        return msg;
    }

    public void writeSD(String msg) {
        System.out.println("sd card write msg : " + msg);
    }
}
