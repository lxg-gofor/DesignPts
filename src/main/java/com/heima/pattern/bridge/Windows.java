package com.heima.pattern.bridge;

//Windows版本操作系统
public class Windows extends OperatingSystemVersion{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
