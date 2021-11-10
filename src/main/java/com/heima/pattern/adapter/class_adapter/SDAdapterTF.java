package com.heima.pattern.adapter.class_adapter;

//定义适配器类（SD兼容TF）
public class SDAdapterTF  extends TFCardImpl implements SDCard{
    public String readSD() {
        System.out.println("adapter read tf card ");
        return readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
