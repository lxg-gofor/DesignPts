package com.heima.pattern.bridge;

//avi文件
public class AVIFile implements VideoFile{

    public void decode(String fileName) {
        System.out.println("avi视频文件："+ fileName);
    }
}
