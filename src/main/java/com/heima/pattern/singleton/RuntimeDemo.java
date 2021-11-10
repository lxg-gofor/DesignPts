package com.heima.pattern.singleton;

import java.io.IOException;
import java.io.InputStream;

/**
 * 测试RunTime类
 */
public class RuntimeDemo {

    public static void main(String[] args) throws IOException {
        //获取Runtime类的对象
        Runtime runtime = Runtime.getRuntime();
        //调用Runtime的方法
        //调用exec()方法，参数是一个命令
        Process process  = runtime.exec("ipconfig");
        //调用process对象的输入流对象
        InputStream inputStream = process.getInputStream();
        byte[] arr = new byte[1024 * 102 * 100];
        //读取数据
        int len  = inputStream.read(arr);//返回读到的字节的个数
        //将字节数组转换为字符串
        String re = new String(arr,0,len,"GBK");
        System.out.println(re);
    }
}
