package org.scgk.demo01;

public class RmvbFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件:"+fileName);
    }
}
