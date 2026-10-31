package Structural.ProxyPattern.VideoStreaming.WithProxyPattern;

/*
But loading a video is expensive.

Now the business wants:
- Check user authentication before playing.
- Allow only premium users to access certain videos.
- Avoid loading the video until playback is requested (lazy loading).

- Not passing VideoPlayer in constructor to benefit lazy-intialization 
- so can avoid expensive videoPlayer intializations

Why volatile?
It ensures that once one thread initializes player, other threads see the fully initialized object.

thread safety in Proxy Pattern.
edge case: If multiple threads call play() simultaneously, both might see player == null and create separate instances.
*/

public class ProxyVideoPlayer implements Video {

    private volatile VideoPlayer player;

    public ProxyVideoPlayer() {
    }

    @Override
    public void play(String filename) {
        User user = AuthContext.getCurrentUser();

        if (filename.startsWith("premium/") && !user.isPremium()) {
            throw new SecurityException("Premium subscription required to play this video.");
        }

        if (player == null) {
            synchronized (this) {
                if (player == null){
                    player = new VideoPlayer();
                }
            }
        }
        player.play(filename);
    }
}
