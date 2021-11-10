package com.heima.pattern.bridge;

//rmvb文件
public class RMVBBFile  implements VideoFile{

    public void decode(String fileName) {
        System.out.println("rmvb文件：" + fileName);
    }
}
