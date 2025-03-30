package org.scgk.demo01;

public class Mac extends OpratingSystem {

    public Mac(VideoFile videoFile){
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
