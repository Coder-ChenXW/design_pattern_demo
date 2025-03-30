package org.scgk.demo01;

public class Windows extends OpratingSystem {

    public Windows(VideoFile videoFile){
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
