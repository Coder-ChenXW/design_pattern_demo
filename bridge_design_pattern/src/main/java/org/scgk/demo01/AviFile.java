package org.scgk.demo01;

public class AviFile implements VideoFile  {
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件："+fileName);
    }
}
