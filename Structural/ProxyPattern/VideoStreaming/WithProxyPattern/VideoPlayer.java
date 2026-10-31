package Structural.ProxyPattern.VideoStreaming.WithProxyPattern;

public class VideoPlayer implements Video {

    @Override
    public void play(String filename) {
        System.out.println("Loading video: " + filename);
        System.out.println("Playing video: " + filename);
    }
}
