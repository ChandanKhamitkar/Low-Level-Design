package Structural.ProxyPattern.VideoStreaming.WithProxyPattern;

public class Main {
    public static void main(String[] args) {

        // Authentication layer sets the current user
        AuthContext.setCurrentUser(new User(true));

        // Client only knows the Video interface
        Video video = new ProxyVideoPlayer();

        // Proxy handles authorization + lazy loading
        video.play("premium/movie.mp4");
        video.play("free/trailer.mp4");
    }
}